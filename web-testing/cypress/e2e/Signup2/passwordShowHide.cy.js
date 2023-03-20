import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 2 - Normal case", () => {
  beforeEach(
    "Validate that all elements exist in Signup 2 - after correct email is written",
    () => {
      const signupObj = new Signup();
      signupObj.visitWebsite();
      signupObj.validateSignup1Elements();
      cy.fixture("userRosa.json").then((data) => {
        const signupObj = new Signup();
        signupObj.setEmail(data.email);
      });
      cy.get(signupObj.continueBtn).click();
      signupObj.validateSignup2Elements();
    }
  );

  it("Validate terms and conditions popup when all fields are filled", () => {
    const signupObj = new Signup();
    cy.fixture("userRosa.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
      cy.get(signupObj.passwordInput).type(data.password);
    });
    cy.get(signupObj.passwordInput)
      .invoke("attr", "type")
      .should("eq", "password");
    cy.wait(1000);
    cy.get(signupObj.passwordShowHide).click();
    cy.get(signupObj.passwordInput).invoke("attr", "type").should("eq", "text");
    cy.wait(2000);
    cy.get(signupObj.passwordShowHide).click();

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordStrengthMsg).should("exist");
    cy.get(signupObj.passwordStrengthMsg).should("have.text", "is very strong");
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.termsNconditionsPopup).should("be.visible");
  });
});

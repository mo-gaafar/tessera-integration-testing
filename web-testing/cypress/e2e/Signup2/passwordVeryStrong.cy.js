import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 2 - Password is very strong", () => {
  beforeEach("Validate that all elements exist in Signup 2 - after correct email is written", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
    cy.fixture("userMichael.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
    });
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements();
  });

  it("Validate Your password message according to input very strong", () => {
    const signupObj = new Signup();
    cy.fixture("userMichael.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("1234567@EventBrite");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordStrengthMsg).should("exist");
    cy.get(signupObj.passwordStrengthMsg).should("have.text", "is very strong");
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.termsNconditionsPopup).should("exist");
  });
});

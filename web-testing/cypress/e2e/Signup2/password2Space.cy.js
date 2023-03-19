import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 2 - Password less than 8 characters", () => {

  beforeEach("Validate that all elements exist in Signup 1 & 2", () => {
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

  it("Validate Your password message according to input 2 spaces", () => {
    const signupObj = new Signup();
    // signupObj.visitWebsite();

    cy.fixture("userMichael.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
      cy.get(signupObj.continueBtn).click();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("  ");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordLess8Msg).should("exist");
    cy.get(signupObj.passwordLess8Msg).should(
      "have.text",
      "must be at least 8 characters"
    );
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.passwordLess8Alert).should("exist");
    cy.get(signupObj.passwordLess8Alert).should(
      "have.text",
      "Password must be at least 8 characters"
    );

    cy.get(signupObj.termsNconditionsPopup).should("not.exist");
  });
});

import Signup from "../../pageObjects/signupPage.js";
import TermsNconditions from "../../pageObjects/termsNconditions.js";

describe("Signup Page 2 - Password less than 8 characters", () => {
  beforeEach("Validate that all elements exist in Signup 1 & 2", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
    cy.fixture("userJim.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
    });
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements();
  });

  it("Validate Your password message according to input 8 spaces", () => {
    const signupObj = new Signup();
    const termObj = new TermsNconditions();

    cy.fixture("userJim.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("        ");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordLess8Msg).should("exist");
    cy.get(signupObj.passwordLess8Msg).should("have.text", "is very weak");
    cy.get(signupObj.createAccountBtn).click();

    cy.get(signupObj.termsNconditionsPopup).should("exist");
    cy.get(termObj.agreeButton).click();
    cy.get(signupObj.errorNotification).should("exist");
    cy.get(signupObj.randomAlertMsg).should("exist");
    cy.get(signupObj.randomAlertMsg).should(
      "have.text",
      "Whoops! Someone must have pulled a plug somewhere... try again.   "
    );
  });
});

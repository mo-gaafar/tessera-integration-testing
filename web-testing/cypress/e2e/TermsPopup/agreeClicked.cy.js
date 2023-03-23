import TermsNconditions from "../../pageObjects/termsNconditions.js";
import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page - Agree to terms", () => {
  it("Validate terms and conditions popup elements exist", () => {
    const signupObj = new Signup();
    const termObj = new TermsNconditions();

    signupObj.visitWebsite();

    cy.fixture("userMoNasser.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
      cy.get(signupObj.continueBtn).click();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
      cy.get(signupObj.passwordInput).type(data.password);
    });

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordStrengthMsg).should("exist");
    cy.get(signupObj.passwordStrengthMsg).should("have.text", "is very strong");
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.termsNconditionsPopup).should("be.visible");

    termObj.validateTermsElements();

    // this block differs among tests

    cy.get(termObj.agreeButton).click();
    cy.wait(5000);
    cy.url().should("not.be.equal", "https://www.eventbrite.com/signin/signup");
   


  });
});

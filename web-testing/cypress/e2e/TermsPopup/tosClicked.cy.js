import TermsNconditions from "../../pageObjects/termsNconditions.js";
import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 2 - Normal case", () => {
  it.only("Validate terms and conditions popup elements exist", () => {
    const signupObj = new Signup();
    const termObj = new TermsNconditions();

    signupObj.visitWebsite();

    cy.fixture("userMichael.json").then((data) => {
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
    // to deal with the website opening a new tab

    cy.get(termObj.termsLink).should("have.attr", "rel", "noopener noreferrer");
    cy.get(termObj.termsLink).invoke("removeAttr", "target");
    cy.get(termObj.termsLink).click();
    cy.get(termObj.tosPageTitle).should("exist");
    cy.get(termObj.tosPageTitle).should(
      "have.text",
      "Eventbrite Terms of Service"
    );
  });
});

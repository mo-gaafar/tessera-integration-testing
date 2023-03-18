import TermsNconditions from "../../pageObjects/termsNconditions.js";
import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page - Agree to terms", () => {
  it.only("Validate terms and conditions popup elements exist", () => {
    const signupObj = new Signup();

    signupObj.visitWebsite();

    cy.fixture("userIam.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
      cy.get(signupObj.continueBtn).click();
    });
    cy.get(signupObj.existentAccountAlert).should('exist');
    cy.get(signupObj.alertIcon).should("exist");
    cy.get(signupObj.existentAccountMsg).should("exist");
    cy.get(signupObj.existentAccountMsg).should(
      "have.text",
      "There is an account associated with the email. "
    );
    cy.get(signupObj.alertLogin).should('exist');
    cy.get(signupObj.alertLogin).should("have.text", "Log in");


  
  
  });
});

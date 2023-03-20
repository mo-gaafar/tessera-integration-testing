import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page - Existent account", () => {
  beforeEach("Validate that all elements exist", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
  });

  it("Validate alert when existent account is used to signup", () => {
    const signupObj = new Signup();

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

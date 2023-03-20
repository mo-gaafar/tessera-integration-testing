import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 1 - Empty email", () => {
  beforeEach("Validate that all elements exist", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
  });

  it("Signup for new account with an email missing @ and .com", () => {
    const signupObj = new Signup();
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.emptyEmailMsg).should('exist');
    cy.get(signupObj.emptyEmailMsg).should('have.text', 'Field required');
    cy.get(signupObj.confirmEmailInput).should("not.exist");
  });
});

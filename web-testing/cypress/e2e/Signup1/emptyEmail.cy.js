import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 1 - Incorrect email", () => {
  it("Validate that all elements exist", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
  });

  it.only("Signup for new account with an email missing @ and .com", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.emptyEmailMsg).should('exist');
    cy.get(signupObj.emptyEmailMsg).should('have.text', 'Field required');
    cy.get(signupObj.confirmEmailInput).should("not.exist");
  });
});

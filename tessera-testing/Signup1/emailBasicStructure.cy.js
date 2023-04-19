import Signup from "../../../pageObjects/signupPage copy";

describe("Signup Page 1 - Normal case", () => {
  beforeEach("Validate that all elements exist", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
  });

  it("Signup for new account with @.com", () => {
    const signupObj = new Signup();
    signupObj.setEmail("@.com");
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should("not.exist");
    
  });

  it("Signup for new account with       @      .com", () => {
    const signupObj = new Signup();
    signupObj.setEmail("  @   .com");
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should("not.exist");
  });
});

import Signup from "../../../pageObjects/signupPage copy";

describe('Signup Page 1 - Incorrect email', () => {
  beforeEach('Validate that all elements exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    signupObj.validateSignup1Elements();    
  })

  it("Signup for new account with an email missing @ and .com", () => {
    const signupObj = new Signup();
    signupObj.setEmail("incorrectEmail");  
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should('not.exist');
    
  })

  it("Signup for new account with an email missing .com", () => {
    const signupObj = new Signup();
    signupObj.setEmail("incorrectEmail@");
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should("not.exist");
  });

  it("Signup for new account with an email missing @", () => {
    const signupObj = new Signup();
    signupObj.setEmail("incorrectEmail.com");
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should("not.exist");
  });

})


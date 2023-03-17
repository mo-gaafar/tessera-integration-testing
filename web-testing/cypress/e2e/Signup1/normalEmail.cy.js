import Signup from "../../pageObjects/signupPage.js";

describe('Signup Page 1 - Normal case', () => {
  it('Validate that all elements exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    signupObj.validateSignup1Elements();
  })

  it('Signup for new account with existent email written correctly', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.setEmail("reemyasser332@yahoo.com");  
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should('exist');
    
  })
})


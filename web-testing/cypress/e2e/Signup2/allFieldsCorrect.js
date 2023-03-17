import Signup from "../../pageObjects/signupPage.js";

describe('Signup Page 2 - Normal case', () => {
  it('Validate that all elements exist in Signup 1', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    signupObj.validateSignup1Elements();
  })

  it('Validate that all elements exist in Signup 2 - after correct email is written', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.setEmail("reemyasser332@yahoo.com");  
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements(); 
  })
  it('Fill all fields correctly', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.setEmail("reemyasser332@yahoo.com");  
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements(); 
  })
  
})


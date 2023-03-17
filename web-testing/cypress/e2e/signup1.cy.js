import Signup from "../pageObjects/signupPage.js";

describe('Signup Page 1', () => {
  it.only('Validate that all elements exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    cy.get(signupObj.eventbriteLogo).should('be.visible');
    cy.get(signupObj.signupTitle).should('be.visible');
    cy.get(signupObj.backgroundImage).should('be.visible');
    cy.get(signupObj.emailInput).should('be.visible');
    cy.get(signupObj.continueBtn).should('be.visible');
    cy.get(signupObj.orDivider).should('be.visible');
    cy.get(signupObj.googleSigninBtn).should('be.visible');
    cy.get(signupObj.otherMethodsText).should('be.visible');
    cy.get(signupObj.facebookSigninBtn).should('be.visible');
    cy.get(signupObj.loginLink).should('be.visible');
  })

  it.skip('Signup for new account', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.setEmail("reemyasser332@yahoo.com");  
    
  })
})


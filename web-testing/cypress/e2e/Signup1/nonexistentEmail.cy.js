import Signup from "../../pageObjects/signupPage.js";

describe('Signup Page 1 - Nonexistent email', () => {
  it('Validate that all elements exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    signupObj.validateSignup1Elements();    
  })

  it.only('Signup for new account with email that does not exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.setEmail("hello@gmail.com");  
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should('not.exist');
    cy.get(signupObj.sentEmailPopup).should('be.visible');
    cy.get(signupObj.emailPopupTitle).should('have.text', 'Never lose your tickets');
    cy.get(signupObj.emailIconBackground).should('exist');
    cy.get(signupObj.emailIcon).should('exist');
    cy.get(signupObj.closePopupBtn).should('be.visible');
    cy.get(signupObj.closePopupBtn).click();
    
  })
})


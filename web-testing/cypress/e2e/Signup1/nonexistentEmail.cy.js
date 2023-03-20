import Signup from "../../pageObjects/signupPage.js";

describe('Signup Page 1 - Nonexistent email', () => {
  beforeEach('Validate that all elements exist', () => {
    const signupObj = new Signup();
    signupObj.visitWebsite(); 
    signupObj.validateSignup1Elements();    
  })

  it.only('Signup for new account with email that does not exist', () => {
    const signupObj = new Signup();
    signupObj.setEmail("hello@gmail.com");  
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.confirmEmailInput).should('not.exist');
    cy.get(signupObj.sentEmailPopup).should('be.visible');
    cy.get(signupObj.emailPopupTitle).should('have.text', 'Never lose your tickets');
    cy.get(signupObj.emailIconBackground).should('exist');
    cy.get(signupObj.emailIcon).should('exist');
    cy.get(signupObj.closePopupBtn).should('be.visible');
    cy.wait(3000)
    cy.get(signupObj.closePopupBtn).click();
    cy.get(signupObj.errorNotification).should('exist');
    cy.get(signupObj.weSentEmailMsg).should("exist");
    cy.get(signupObj.weSentEmailMsg).should(
      "have.text",
      "We sent you an email to hello@gmail.com with intructions to set your password.   "
    );
    
  })
})


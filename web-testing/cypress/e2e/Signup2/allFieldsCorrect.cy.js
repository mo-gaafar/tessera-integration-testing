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
    signupObj.setEmail("oyasser905@gmail.com");  
    cy.get(signupObj.continueBtn).click();
    cy.get(signupObj.errorNotification).should('exist');
    // cy.get(signupObj.errorNotification).should('have.text', 'Whoops! Someone must have pulled a plug somewhere... try again. ');

    // signupObj.validateSignup2Elements(); 
  })
  
  
})


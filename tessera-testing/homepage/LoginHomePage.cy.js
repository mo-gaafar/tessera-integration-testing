import HomePage from "../../PageObjects/HomePagee copy"

describe('HomePageNoLogin', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit("https://www.tessera.social/login");
     cy.wait(5000)
     cy.get(home.emailInput).type("samyh0592@gmail.com")
     cy.get(home.passwordInput).type("#7Assansamy")
     cy.get(home.loginBtn).click()
     cy.wait(5000)
     cy.get(home.Logo).should('exist')
     cy.get(home.emailcheck).should('exist')   
     cy.get(home.emailcheck).contains('samyh0592@gmail.com')   
     cy.get(home.emailcheck).trigger('mouseover')
     //  cy.get(home.emailcheck).contains('samyh0592@gmail.com')
     cy.contains('Log out').click()
     cy.wait(5000)
     cy.get(home.LoginButton).should('exist')
        
        
    })
    
    
  })
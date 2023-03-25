import HomePage from "../../PageObjects/HomePagee"

describe('HomePageNoLogin', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit("https://www.eventbrite.com/signin");
     cy.wait(5000)
     cy.get(home.emailInput).type("samyh0592@gmail.com")
     cy.get(home.passwordInput).type("#7Assansamy")
     cy.get(home.loginBtn).click()
     cy.wait(5000)
     cy.get(home.Logo).should('exist')
     cy.get(home.Likes).should('exist').click()
     cy.url().should('include','events')
     cy.go('back')
     cy.get(home.Tickets).should('exist').click()
     cy.url().should('include','u')
     cy.get("div[data-spec='consumer-header-user-menu'] a[aria-label='Menu dropdown link']").invoke('show').should('be.visible').trigger('mouseover')
     cy.contains('Browse events').click()
        cy.wait(2000)
        cy.url().should('include','all')
        cy.go('back')
        
        
        
    })
    
    
  })
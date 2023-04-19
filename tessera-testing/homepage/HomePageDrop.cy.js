import HomePage from "../../PageObjects/HomePagee copy"

describe('HomePageDropDown', () => {
    
  
    it('Organize', () => {

     const home=new HomePage();
     
     cy.visit('https://www.tessera.social/');
     home.OrganizeDropDown();
     cy.contains('Create Events').click()
     cy.wait(2000)
     cy.url().should('include','createevents')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Pricing').click()
     cy.wait(2000)
     cy.url().should('include','pricing')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Resources').click()
     cy.wait(2000)
     cy.url().should('include','resources')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Contact Sales').click()
     cy.wait(2000)
     cy.url().should('include','contact')
     cy.go('back')


    })
    
    it('help', () => {

        const home=new HomePage();
        
        cy.visit('https://www.tessera.social/');
        home.HelpDropDown();
        cy.contains('Find your tickets').click()
        cy.wait(2000)
        cy.url().should('include','yourtickets')
        cy.go('back')
        home.HelpDropDown();
        cy.contains('Contact an event organizer').click()
        cy.wait(2000)
        cy.url().should('include','conactorganizer')
        cy.go('back')
        home.HelpDropDown();
        cy.contains('Visit the help center').click()
        cy.wait(2000)
        cy.url().should('include',',/')
        cy.go('back')
       
     })   
    


  })
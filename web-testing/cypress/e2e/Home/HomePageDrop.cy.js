import HomePage from "../../PageObjects/HomePagee"

describe('HomePageDropDown', () => {
    
  
    it.skip('Organize', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
     home.OrganizeDropDown();
     cy.contains('Create Events').click()
     cy.wait(2000)
     cy.url().should('include','organizer')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Pricing').click()
     cy.wait(2000)
     cy.url().should('include','pricing')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Resources').click()
     cy.wait(2000)
     cy.url().should('include','blog')
     cy.go('back')
     home.OrganizeDropDown();
     cy.contains('Contact Sales').click()
     cy.wait(2000)
     cy.url().should('include','contact')
     cy.go('back')


    })
    
    it.skip('help', () => {

        const home=new HomePage();
        
        cy.visit('https://www.eventbrite.com/');
        home.HelpDropDown();
        cy.contains('Find your tickets').click()
        cy.wait(2000)
        cy.url().should('include','support')
        cy.go('back')
        home.HelpDropDown();
        cy.contains('Contact an event organizer').click()
        cy.wait(2000)
        cy.url().should('include','support')
        cy.go('back')
        home.HelpDropDown();
        cy.contains('Visit the help center').click()
        cy.wait(2000)
        cy.url().should('include','support')
        cy.go('back')
       
     })   
     it('Search', () => {

        const home=new HomePage();
        
        cy.visit('https://www.eventbrite.com/');
        cy.get(home.SearchBar).click()
        cy.wait(5000)
        cy.get("#search-autocomplete-input").type("events")
        cy.wait(5000)
        cy.go("back")
     })   
    


  })
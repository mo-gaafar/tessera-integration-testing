import HomePage from "../../PageObjects/HomePagee"

describe('categories', () => {
    
  
    it('CatUrl', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
     cy.wait(5000)
      cy.get(home.MusicIcon).click()
      cy.url().should('include','music')
      cy.go('back')
      cy.wait(5000)
      cy.get(home.HolidayIcon).click()
      cy.url().should('include','holiday')
      cy.go('back')
      cy.wait(5000)
     cy.get("#game_svg__eds-icon--game_svg").click()
     
     cy.url().should('include','hobbies')
     cy.go('back')
     cy.wait(5000)
     cy.get(home.FoodIcon).click()
     cy.url().should('include','food')
     cy.go('back')
     cy.wait(5000)

     cy.get(home.ArtsIcon).click()
     cy.url().should('include','arts')
     cy.go('back')
     cy.wait(5000)
     cy.get(home.HealthIcon).click()
     cy.url().should('include','health')
     cy.go('back')
     cy.wait(5000)
     cy.get(home.BusniesIcon).click()
     cy.url().should('include','business')
     cy.go('back')
     cy.wait(5000)
     cy.get(home.SportsIcon).click()
     cy.url().should('include','sports')
     cy.go('back')
    
         
        
    })
    it.only("LENGTH",()=>{
        cy.visit('https://www.eventbrite.com/');
        cy.get(".tile--name.eds-text-weight--heavy").should('have.length',8)
    })
    
    
  })
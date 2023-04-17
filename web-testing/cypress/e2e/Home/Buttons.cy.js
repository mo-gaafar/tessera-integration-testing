import HomePage from "../../PageObjects/HomePagee"

describe('buttonMenu', () => {
    
  
    it('Buttons', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
     cy.get(home.AllBtn).click()
     cy.wait(3000)
     cy.get(home.AllBtn).invoke("attr","class").should('include',"selected")
     
     
     cy.get(home.OnlineBtn).click()
     cy.wait(3000)
     cy.get(home.OnlineBtn).invoke("attr","class").should('include',"selected")
     
     cy.get(home.TodayBtn).click()
     cy.wait(3000)
     cy.get(home.TodayBtn).invoke("attr","class").should('include',"selected")
     
     cy.get(home.ThisWeekendBtn).click()
     cy.wait(3000)
     cy.get(home.ThisWeekendBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.WomenBtn).click()
     cy.wait(3000)
     cy.get(home.WomenBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.FreeBtn).click()
     cy.wait(3000)
     cy.get(home.FreeBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.MusicBtn).click()
     cy.wait(3000)
     cy.get(home.MusicBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.FoodBtn).click()
     cy.wait(3000)
     cy.get(home.FoodBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.CharityBtn).click()
     cy.wait(3000)
     cy.get(home.CharityBtn).invoke("attr","class").should('include',"selected")
     cy.get(home.ForYouBtn).click()
     cy.wait(3000)
    //  cy.get("#cross-chunky_svg__eds-icon--cross-chunky_svg").click({force:true})
     cy.get(home.ForYouBtn).invoke("attr","class").should('include',"selected")

     
        
    })
    
    
  })
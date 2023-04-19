import HomePage from "../../PageObjects/HomePagee copy"

describe('buttonMenu', () => {
    
  
    it('Buttons', () => {

     const home=new HomePage();
     
     cy.visit('https://www.tessera.social/');
     cy.get(home.AllBtn).click()
     cy.wait(3000)
     cy.get(home.AllBtn).invoke("attr","style").should('include',"blue")
     
     
     
     cy.get(home.OnlineBtn).click()
     cy.wait(3000)
     cy.get(home.OnlineBtn).invoke("attr","style").should('include',"blue")
     cy.get(":nth-child(1) > .imageBlock").click()
     
     cy.get(home.TodayBtn).click()
     cy.wait(3000)
     cy.get(home.TodayBtn).invoke("attr","style").should('include',"blue")
     
     cy.get(home.ThisWeekendBtn).click()
     cy.wait(3000)
     cy.get(home.ThisWeekendBtn).invoke("attr","style").should('include',"blue")
  
     cy.get(home.FreeBtn).click()
     cy.wait(3000)
     cy.get(home.FreeBtn).invoke("attr","style").should('include',"blue")
     cy.get(home.MusicBtn).click()
     cy.wait(3000)
     cy.get(home.MusicBtn).invoke("attr","style").should('include',"blue")
     cy.get(home.FoodBtn).click()
     cy.wait(3000)
     cy.get(home.FoodBtn).invoke("attr","style").should('include',"blue")
     cy.get(home.CharityBtn).click()
     cy.wait(3000)
     cy.get(home.CharityBtn).invoke("attr","style").should('include',"blue")
     cy.get(home.ForYouBtn).click()
     cy.wait(3000)
     cy.get(home.ForYouBtn).invoke("attr","style").should('include',"blue")

     
        
    })
    
    
  })
import HomePage from "../../PageObjects/HomePagee"

describe('HomePageNoLogin', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
      home.ValidateMainElement();
     
        
    })
    
    
  })
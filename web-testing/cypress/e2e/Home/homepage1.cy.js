import HomePage from "../../PageObjects/HomePagee"

describe('validatenavigation', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
     
     home.ValidateNavigation();
     
        
    })
    
    
  })
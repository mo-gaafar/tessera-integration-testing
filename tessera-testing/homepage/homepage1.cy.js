import HomePage from "../../PageObjects/HomePagee copy"

describe('validatenavigation', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit('https://www.tessera.social/');
     
     home.ValidateNavigation();
     
        
    })
    
    
  })
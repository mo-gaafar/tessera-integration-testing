import HomePage from "../../PageObjects/HomePagee copy"

describe('HomePageNoLogin', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit('https://www.tessera.social/');
      home.ValidateMainElement();
     
        
    })
    
    
  })
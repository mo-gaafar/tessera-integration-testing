import HomePage from "../../PageObjects/HomePagee"

describe('validatenavigation', () => {
    
  
    it('HomePage', () => {

     const home=new HomePage();
     
     cy.visit('https://www.eventbrite.com/');
     cy.get(
       "#music-note_svg__eds-icon--music-note_svg"
     ).scrollIntoView();
     
     home.ValidateNavigation();
     
        
    })
    
    
  })
import Tickets from "../../PageObjects/Tickets";
describe('Tickets', () => {

  
    it('Tickets', () => {
  
        const TI=new Tickets();
        TI.clicksubmit()
        cy.get(TI.ProfileHeader).should('exist')
        cy.get(TI.ProfilePicture).should('exist')
        cy.get(TI.SeePastorders).click()
        cy.wait(5000)
        cy.get(TI.nopastorders).should('exist')
        cy.get(TI.Intersts).click()
        cy.wait(5000)
        cy.url().should('include','interests')
        cy.go('back')
        cy.get(TI.Collections).click()
        cy.wait(5000)
        cy.url().should('include','collections')
        cy.go('back')
  
    })
    
    
  })
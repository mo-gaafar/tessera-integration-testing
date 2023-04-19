import HomePage from "../../PageObjects/HomePagee"

describe('buttonMenu', () => {
    it("events length", () => {
        cy.visit('https://www.eventbrite.com/')
        cy.wait(5000)
        cy.get(".eds-event-card-content__image-wrapper.eds-event-card-content__image-wrapper--sharp-corners")
         .then(($value) => {
            length = $value.length
    
        })
    
    })
    it("Printing length", () => {
        cy.log("*** length obtained is *** " + length)
    
    })
    it("checkbuttons",()=>{
        const home=new HomePage();
        cy.visit('https://www.eventbrite.com/')
        cy.wait(5000)
        cy.get(home.ComedyBtn).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Food).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Education).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Pop).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Design).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.R_b).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.HipHop).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Film).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.PersonalHealth).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Blues).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Travel).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Rock).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Yoga).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Country).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.startups).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.Classic).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.MentalHealth).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.TV).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.ALT).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)
        cy.get(home.MUSICAL).click()
        cy.url().should('include','sign')
        cy.go('back')
        cy.wait(5000)



    })
    it("checkbuttons",()=>{
        const home=new HomePage();
        cy.visit('https://www.eventbrite.com/')
        cy.wait(5000)
        cy.get(".eds-tag__text.eds-tag__item.eds-text-bm.eds-text-color--grey-800").should('have.length',20)
      


    })

  
    
    
  })

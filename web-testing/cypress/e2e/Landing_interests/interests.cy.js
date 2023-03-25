import intersts from "../../PageObjects/Interests"

describe('intersts', () => {
    
  
    it('HomePage', () => {

     const IN=new intersts();
     IN.clicksubmit()
     cy.get(IN.Msg).should('exist').should('have.text',"Nice to meet you!")
     cy.get(IN.MsgsSubtitle).should('exist').should('have.text',"What would you like to do first?")
     cy.get(IN.CreateBtn).click()
     cy.url().should('include','create')
     cy.go('back')
     cy.wait(3000)
     cy.get(IN.AttendBtn).click()
     cy.wait(5000)

     cy.get(IN.MusicsTab).should('exist')
     //cy.get(IN.Alternativebtn).invoke("attr","class").should('include',"interactive")
     cy.get(IN.Alternativebtn).click()
     cy.get(IN.Alternativebtn).invoke("attr","class").should('include',"active")
     cy.get(IN.BusinessTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.FoodTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.CommunityTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.ArtTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.FilmsTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.SportsTab).scrollIntoView({duration:1000}).should('exist') 
     cy.get(IN.HealthTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.ScienceTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.TravelTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.CharityTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.SpirtualityTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.FamilyAndEducation).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.HolidayTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.GovernmentTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.FashionTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.HomeAndLifestyleTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.TransTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.HobbiesTab).scrollIntoView({duration:1000}).should('exist')
     cy.get(IN.SchoolActivitiesTab).scrollIntoView({duration:1000}).should('exist')














     
        //  cy.visit("https://www.eventbrite.com/signin");
        //  cy.wait(5000)
        //  cy.get(home.emailInput).type("samyh0592@gmail.com")
        //  cy.get(home.passwordInput).type("#7Assansamy")
        //  cy.get(home.loginBtn).click()
        //  cy.wait(5000)
        //  cy.get(home.Logo).should('exist')
        //  cy.get(home.Likes).should('exist')
        //  cy.get(home.Tickets).should('exist')
        //  cy.get("div[data-spec='consumer-header-user-menu'] a[aria-label='Menu dropdown link']").invoke('show').should('be.visible').trigger('mouseover')
        //  cy.contains('Browse events').click()
        
    })
    
    
  })
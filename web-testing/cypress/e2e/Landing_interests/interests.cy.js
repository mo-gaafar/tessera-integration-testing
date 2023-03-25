import intersts from "../../PageObjects/Interests"

describe('intersts', () => {
    
  
    it('HomePage', () => {
      const IN = new intersts();
      IN.clicksubmit();
      cy.get(IN.Msg).should("exist").should("have.text", "Nice to meet you!");
      cy.get(IN.MsgsSubtitle)
        .should("exist")
        .should("have.text", "What would you like to do first?");
      cy.get(IN.CreateBtn).click();
      cy.wait(5000);
      cy.url().should("include", "create");
      cy.go("back");
      cy.wait(3000);
      cy.get(IN.AttendBtn).click();
      cy.wait(5000);

      cy.get(IN.MusicsTab).should("exist");
      cy.get(IN.Alternativebtn).click();
      cy.get(IN.BusinessTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.FoodTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.CommunityTab)
        .scrollIntoView({ duration: 1000 })
        .should("exist");
      cy.get(IN.ArtTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.FilmsTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.SportsTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.HealthTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.ScienceTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.TravelTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.CharityTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.SpirtualityTab)
        .scrollIntoView({ duration: 1000 })
        .should("exist");
      cy.get(IN.FamilyAndEducation)
        .scrollIntoView({ duration: 1000 })
        .should("exist");
      cy.get(IN.HolidayTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.GovernmentTab)
        .scrollIntoView({ duration: 1000 })
        .should("exist");
      cy.get(IN.FashionTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.TransTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.HobbiesTab).scrollIntoView({ duration: 1000 }).should("exist");
      cy.get(IN.SchoolActivitiesTab)
        .scrollIntoView({ duration: 1000 })
        .should("exist");
      cy.get(IN.NEXT).click();
      cy.get(IN.Location).should("exist").type("Al Jizah");
      cy.get(IN.NEXT).click();
      cy.get(IN.FollowPage).should("exist");

      cy.go('back');
      cy.go("back");
      cy.get(IN.Alternativebtn).click();
    })
    
    
  })
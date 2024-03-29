import HomePage from "../../PageObjects/HomePagee copy"
import CreateEvent from "../../PageObjects/Create Event";

describe('HomePageNoLogin', () => {
    
  
    it('create event validation', () => {

     const home=new HomePage();
     const crt=new CreateEvent();
     
     cy.visit("https://www.tessera.social/login");
     //cy.wait(5000)
     cy.get(home.emailInput).type("samyh0592@gmail.com")
     cy.get(home.passwordInput).type("#7Assansamy")
     //cy.get(home.loginBtn).click()
     cy.get('.sc-bvLVNa > button').click()
     cy.get(crt.CreateEvent_btn).click()
     cy.get(crt.searchbar).should('exist')
     cy.wait(5000)
     cy.get(crt.CreateEvent_btn2).click()
     cy.get(crt.icon).should('exist')
     cy.get(crt.category).should('exist')
     cy.get('[style="margin-top: 16px;"] > :nth-child(1) > [data-testid="title"]').type('SW')
     cy.get(crt.orgnaizer).type('Tessera')
     cy.get(crt.category).select('Business & Professional')
     cy.get(crt.onlineevent).click()
     cy.get(crt.venuesearch).should('not.exist')
     cy.get(crt.tobeannounced).click()
     cy.get(crt.venuesearch).should('not.exist')
     cy.get(crt.venue).click()
     
     cy.get('[data-testid="datepicker-container"]').click({ multiple: true })
     cy.wait(2000)
     cy.get(':nth-child(2) > [style="margin-bottom: 8px;"] > .boxesborders > .divflex > .divflex2 > [style="position: relative;"] > .react-datepicker-wrapper > .react-datepicker__input-container > .custom-datepicker').click()
     cy.get('.react-datepicker__day--020').click()
     cy.get('.fixedbuttondiv > [style="background-color: rgb(209, 65, 12); fill: rgb(255, 255, 255); color: white; border-color: rgb(209, 65, 12); margin-right: 16px;"]').click()
     //cy.get('.\.addressbox > :nth-child(1) > .divflex > .form > .error').should('exist')
     cy.get('.addressbox > [style="margin-bottom: 8px;"] > .divflex > .form > .error').scrollIntoView({duration:1000}).should('exist')
    })
    it.only('create event validation', () => {

        const home=new HomePage();
        const crt=new CreateEvent();
        
        cy.visit("https://www.tessera.social/login");
        //cy.wait(5000)
        cy.get(home.emailInput).type("samyh0592@gmail.com")
        cy.get(home.passwordInput).type("#7Assansamy")
        //cy.get(home.loginBtn).click()
        cy.get('.sc-bvLVNa > button').click()
        cy.get(crt.CreateEvent_btn).click()
        cy.get(crt.searchbar).should('exist')
        //cy.wait(5000)
        cy.get(crt.CreateEvent_btn2).click()
        cy.get(crt.icon).should('exist')
        cy.get(crt.category).should('exist')
        cy.get('[style="margin-top: 16px;"] > :nth-child(1) > [data-testid="title"]').type('SW')
        cy.get(crt.orgnaizer).type('Tessera')
        cy.get(crt.category).select('Music')
        cy.get(crt.venuesearch).type('Cairo')
        cy.get('.sc-jlRNHb > ul > :nth-child(1)').click()
        cy.get(crt.adress1).type('123')
        cy.get(crt.city).type('mazarita')
        //cy.get(crt.zipcode).type('00202')
        cy.get("input[placeholder='e.g.94103']").type('21212',{force: true})
        cy.get("input[placeholder='e.g.Apt,Suite,Bldg']").type('cairo')
        cy.get("input[placeholder='e.g.California']").type('cairo',{force: true})
        
        cy.get(crt.startdate).click({ multiple: true })
        cy.wait(2000)
        cy.get(':nth-child(2) > [style="margin-bottom: 8px;"] > .boxesborders > .divflex > .divflex2 > [style="position: relative;"] > .react-datepicker-wrapper > .react-datepicker__input-container > .custom-datepicker').click()
        cy.get('.react-datepicker__day--020').click()
        cy.get(crt.starttime).select('9:00am')
        cy.get(crt.enddate).click()
        cy.get(':nth-child(1) > [style="margin-bottom: 8px;"] > .boxesborders > .divflex > .divflex2 > [style="position: relative;"] > .react-datepicker-wrapper > .react-datepicker__input-container > .custom-datepicker').click()
        cy.get('.react-datepicker__day--027').click()
        cy.get(crt.endtime).select('6:00am')
        cy.get(':nth-child(4) > .checkbox').click()
        cy.get(':nth-child(5) > .checkbox').click()
        cy.get(crt.timezone).select('Africa/Cairo')
        cy.get('.fixedbuttondiv > [style="background-color: rgb(209, 65, 12); fill: rgb(255, 255, 255); color: white; border-color: rgb(209, 65, 12); margin-right: 16px;"]').click()
        cy.get('.fixedbuttondiv > [style="background-color: rgb(209, 65, 12); fill: rgb(255, 255, 255); color: white; border-color: rgb(209, 65, 12); margin-right: 16px;"]').click()
        cy.get(crt.imagebtn).should('exist').click()
        cy.get(crt.summary).should('exist')
        cy.get(crt.summarybox).type('safdasfasfas')
        cy.get(crt.describtionbox).type('sdadasfasf')
        cy.get('[style="background-color: rgb(209, 65, 12); fill: rgb(255, 255, 255); color: white; border-color: rgb(209, 65, 12);"]').dblclick()
        cy.get('[style="background-color: rgb(209, 65, 12); fill: rgb(255, 255, 255); color: white; border-color: rgb(209, 65, 12);"]').click()
        cy.get(crt.letscreateticket).should('exist')
        cy.get(crt.addticketbtn).click()
        cy.get(crt.ticketname).type('hassan samy')
        cy.get(crt.availbailty).type('20')
        cy.get(crt.price).type('10.00')
        cy.get(':nth-child(2) > #times').select('12:00 AM')
        cy.get(':nth-child(4) > #times').select('11:00 PM')
        cy.get(crt.savebtn).click()
        cy.get('[href="/manage"]').click()
        cy.get("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > table:nth-child(3) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(4) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)").type('1')
        cy.get("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(4) > button:nth-child(1)").click()
        cy.get("div[id='1297532720'] h2").should('exist')
        cy.go('back')
        cy.go('back')
        cy.wait(5000)
        cy.get(':nth-child(2) > a > img').click()
        cy.get('h1').should('exist')
        cy.go('back')
        cy.wait(5000)
        cy.get("a[href='/publish']").click()
        cy.get(".header").should('exist')
        cy.get(crt.publicevent).click()
        cy.get(crt.publishnow).dblclick()
        cy.get(crt.publishnow).dblclick()
        cy.get('.logged__nav > a > img').click()
        cy.get('.first-Filter > .nav--filter').click()
        cy.get(':nth-child(93) > .cardTextInfo > [data-testid="img"]').should('exist')
       })
})
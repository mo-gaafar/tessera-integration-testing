class intersts
{
    emailInput = "#email";
    passwordInput = "#password";
    loginBtn = ":nth-child(4) > div > .eds-btn";
    Likes="#heart-chunky_svg__eds-icon--user-chunky_svg"
    Tickets="div[class='consumer-header__links'] div:nth-child(2) a:nth-child(1)"
    Msg=".onboarding-reditecion__tittle"
    MsgsSubtitle=".onboarding-reditecion__subtittle"
    AttendBox=".onboarding-reditecion__box > :nth-child(1)"
    AttendBtn=":nth-child(1) > .card_button > .Button_root__1p1bh"
    CreateBtn=":nth-child(2) > .card_button > .Button_root__1p1bh"
    CreateBox=".onboarding-reditecion__box > :nth-child(2)"
    MusicsTab ="#music-note_svg__eds-icon--music-note_svg"
    BusinessTab ="#seminar_svg__eds-icon--seminar_svg"
    FoodTab ="#flatware_svg__eds-icon--flatware_svg"
    CommunityTab ="#park_svg__eds-icon--park_svg"
    ArtTab="#mask_svg__eds-icon--mask_svg"
    FilmsTab ="#film-camera_svg__eds-icon--film-camera_base"  
    SportsTab ="#shoe_svg__eds-icon--sport_base" 
    HealthTab ="#heart_svg__eds-icon--heart_svg"
    ScienceTab =".beaker_svg__eds-icon--beaker_base"
    TravelTab ="#travel_svg__eds-icon--travel_base"
    CharityTab ="#charity_svg__eds-icon--charity_svg"
    SpirtualityTab ="#religion_svg__eds-icon--religion_base"
    FamilyAndEducation ="#rocking-horse_svg__eds-icon--rocking-horse_base"
    HolidayTab ="#holiday_svg__eds-icon--holiday_svg"
    GovernmentTab ="#politic_svg__eds-icon--politic_base"
    FashionTab ="#fashion_svg__eds-icon--fashion_svg"
    HomeAndLifestyleTab ="#house_svg__eds-icon--house__svg"
    TransTab =".auto_svg__eds-icon--auto_svg"
    HobbiesTab ="#game_svg__eds-icon--game_base"
    SchoolActivitiesTab =".bus_svg__eds-icon--bus_base"
    Alternativebtn="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > main:nth-child(1) > div:nth-child(1) > main:nth-child(2) > section:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > span:nth-child(1)"
    Classicbtn=":nth-child(1) > .interest-panel__card > .eds-card > .interest-panel__card-contents > :nth-child(4) > .eds-tag > .eds-tag__text"
    Location="#locationPicker"
    Giza="#\38 5671047 > .eds-text-list-item > .eds-btn--button"
    GIZAA="div[class='eds-text-list-item eds-text-list-item--tentatively-selected'] div[class='eds-text-list-item__content-primary']"
    NEXT=".eds-btn--fill"

    clicksubmit()
    {
     cy.visit("https://www.eventbrite.com/signin");
     cy.wait(5000)
     cy.get(this.emailInput).type("samyh0592@gmail.com")
     cy.get(this.passwordInput).type("#7Assansamy")
     cy.get(this.loginBtn).click()
     cy.wait(5000)
     
     cy.get("div[data-spec='consumer-header-user-menu'] a[aria-label='Menu dropdown link']").invoke('show').should('be.visible').trigger('mouseover')
     cy.contains('Interests').click()

    }
   
}
export default intersts
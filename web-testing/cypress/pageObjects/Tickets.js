class Tickets
{
    Tickets=":nth-child(3) > .consumer-header__quick-link > :nth-child(2)"
    emailInput = "#email";
    passwordInput = "#password";
    loginBtn = ":nth-child(4) > div > .eds-btn";
    ProfileHeader=".user-profile-header__name-text"
    ProfilePicture=".user-profile-header__picture"
    Intersts="#profile-interests > .eds-l-pad-bot-8 > .eds-text-bl > .eds-link > span"
    Collections="#profile-collections > .eds-l-pad-bot-8 > .eds-text-bl > .eds-link > span"
    Following="#profile-following > .eds-l-pad-bot-8 > .eds-text-bl"
    SeeEvent=".eds-l-pad-bot-8 > .eds-link--neutral > span"
    getmycode=".eds-l-pad-bot-8 > .eds-link--neutral > span"
    SeePastorders="button[class='eds-btn eds-btn--button eds-btn--link profile-see-more-button']"
    nopastorders="button[class='eds-btn eds-btn--button eds-btn--link profile-see-more-button']"
    Followingbtn="button[class='eds-btn eds-btn--button eds-btn--neutral']"

    clicksubmit()
    {
     cy.visit("https://www.eventbrite.com/signin");
     cy.wait(5000)
     cy.get(this.emailInput).type("samyh0592@gmail.com")
     cy.get(this.passwordInput).type("#7Assansamy")
     cy.get(this.loginBtn).click()
     cy.wait(5000)
     cy.get(":nth-child(3) > .consumer-header__quick-link > :nth-child(2)").click()
     

    }
}
export default Tickets
class Signup {
    // ------------Selectors------------
    emailInput = '#email' 
    signupTitle = '[data-testid="page-header-title"]'
    continueBtn = '[data-testid="form-submit-button"]'
    orDivider = '.auth-lib__form-divider-text'
    googleSigninBtn = '.social-login__container > .eds-btn'
    facebookSigninBtn = '.secondary-method'
    otherMethodsText = "div[class='other-login-options'] div p"
    backgroundImage = '.split-container__bg'
    eventbriteLogo = '[data-testid="page-header-icon"]'
    loginLink = '[data-testid="go-to-signup"]'
    // ------------Methods------------

    // visit the website
    visitWebsite()
    {
        cy.visit("https://www.eventbrite.com/signin/signup")
    }

    // type some email
    setEmail(email)
    {
        cy.get(this.emailInput).type(email)
    }
}

export default Signup;
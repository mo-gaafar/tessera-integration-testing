class Login {
  // ------------Selectors------------
  // Login Page
  loginTitle = '[data-testid="page-header-title"]';
  emailInput = "#email";
  passwordInput = "#password";
  loginBtn = ":nth-child(4) > div > .eds-btn";
  orDivider = ".split-container__divider-text";
  signinLinkBtn = '[data-testid="signin-forgot-password-button"]'; // to be removed when Tessera is deployed
  googleLoginBtn = ".social-login__container > .eds-btn";
  facebookLoginBtn = ":nth-child(1) > .eds-card > .secondary-method";
  otherOptionsText = "div[class='other-login-options'] div p";
  signupLink = "div[class='eds-show-up-md'] a[type='button']";
  eventbriteLogo =
    ".eds-l-mar-bot-6.eds-fx--pop.eds-fx--delay-1.authentication__page-header__icon"; // or svg ??
  backgroundImg = ".split-container__bg";
  incorrectEmailMsg = ".eds-field-styled__annotation";
  incorrectPassBelowField = ".eds-field-styled__annotation";
  incorrectPasswordNotification = ".eds-notification-bar";
  emptyPasswordMsg =
    '.eds-password--v2 > [data-testid="input-field-wrapper"] > .eds-field__sub > .eds-field__sub--left > .eds-field-styled__annotation';
  emptyEmailMsg =
    'form > :nth-child(1) > [data-testid="input-field-wrapper"] > .eds-field__sub > .eds-field__sub--left > .eds-field-styled__annotation';
  forgotPasswordBtn = '[data-testid="signin-forgot-password-link-button"]';
  socialsFailureAlert = ".eds-notification-bar__content-child";
  createAccountAlert = ".eds-notification-bar";
  createAccountMsg = ".eds-notification-bar";
  createAccountLink = ".eds-notification-bar__content-child > .eds-btn--button";
  incorrectPasswordAlert = ".eds-notification-bar";
  incorrectPasswordMsg = ".eds-notification-bar__content-child > p";
  forgotPasswordPopup = ".eds-l-pad-all-8.eds-align--center";
  checkEmailTitle =
    '.authentication__page-header > :nth-child(1) > [data-testid="page-header-title"]';
  sentAlinkMsg = '[data-testid="page-header-subtitle"] > div';
  forSecurityMsg = '[data-testid="page-header-subtitle"] > div';
  forgotPasswordClose = ".eds-modal__close-button > .eds-icon-button";

  // Home Page
  navbar = ".consumer-header__desktop";

  // ------------Methods------------

  visitWebsite() {
    cy.visit("https://www.eventbrite.com/signin");
  }

  setEmail(email) {
    cy.get(this.emailInput).type(email);
  }

  setPassword(password) {
    cy.get(this.passwordInput).type(password);
  }

  validateLoginElements() {
    cy.get(this.loginTitle).should("exist");
    cy.get(this.emailInput).should("exist");
    cy.get(this.passwordInput).should("exist");
    cy.get(this.loginBtn).should("exist");
    cy.get(this.orDivider).should("exist");
    cy.get(this.signinLinkBtn).should("exist");
    cy.get(this.googleLoginBtn).should("exist");
    cy.get(this.facebookLoginBtn).should("exist");
    cy.get(this.otherOptionsText).should("exist");
    cy.get(this.signupLink).should("exist");
    cy.get(this.eventbriteLogo).should("exist");
    cy.get(this.backgroundImg).should("exist");
  }
}

export default Login;

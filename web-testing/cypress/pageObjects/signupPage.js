class Signup {
  // ------------Selectors------------

  // Signup1
  emailInput = "#email";
  signupTitle = '[data-testid="page-header-title"]';
  continueBtn = '[data-testid="form-submit-button"]';
  orDivider = ".auth-lib__form-divider-text";
  googleSigninBtn = ".social-login__container > .eds-btn";
  facebookSigninBtn = ".secondary-method";
  otherMethodsText = "div[class='other-login-options'] div p";
  backgroundImage = ".split-container__bg";
  eventbriteLogo = '[data-testid="page-header-icon"]';
  loginLink = '[data-testid="go-to-signup"]';
  sentEmailPopup = ".eds-modal__content";
  emailPopupTitle = ".eds-text--center.eds-text-hm.eds-l-mar-bot-4";
  closePopupBtn = "#cross-chunky_svg__eds-icon--cross-chunky_svg";
  emailIconBackground =
    ".eds-vector-image.eds-icon--medium.eds-vector-image--ui-700";
  emailIcon = "#mail-chunky_svg__eds-icon--mail-chunky_base";
  popupText =
    ".eds-text--center.eds-text-color--grey-600.eds-text-bm.eds-l-mar-hor-3";
  errorNotification = ".eds-notification-bar";
  emptyEmailMsg = ".eds-field-styled__annotation";
  existentAccountAlert = ".eds-notification-bar";
  existentAccountMsg =
    "div[class='eds-notification-bar__content-child'] strong";
  alertLogin =
    "div[class='eds-notification-bar__content-child'] button[type='button']";
  alertIcon = ".eds-notification-bar__icon";
  weSentEmailMsg = ".eds-notification-bar__content-child";
  randomAlertMsg = ".eds-notification-bar__content-child";

  // Signup2
  confirmEmailInput = '[data-testid="auth-lib-confirm-email-field"]';
  fnameInput = "#firstName";
  lnameInput = "#lastName";
  passwordInput = "#password";
  passwordStrengthIndicator = ".eds-progress-indicator--linear__line";
  createAccountBtn = '[data-testid="signup-submit-button"]';
  yourPasswordMsg = ".eds-l-pad-top-2 > :nth-child(1)";
  passwordStrengthMsg = ".eds-l-pad-top-2 > .eds-text-weight--heavy";
  termsNconditionsPopup = "#edsModalContentChildren";
  confirmEmailMsg = ".eds-field-styled__annotation";
  FnameMsg = ".eds-field-styled__annotation";
  LnameMsg = ".eds-field-styled__annotation";
  passwordRequiredMsg = ".eds-field-styled__annotation";
  passwordLess8Msg = ".eds-l-pad-top-2 > :nth-child(2)";
  passwordLess8Alert = ".eds-field-styled__annotation";
  passwordShowHide =
    ".eds-password-icon__wrapper > .eds-icon-button > .eds-btn--button";

  // ------------Methods------------

  // visit the website
  visitWebsite() {
    cy.visit("https://www.eventbrite.com/signin/signup");
  }

  // type some email
  setEmail(email) {
    cy.get(this.emailInput).type(email);
  }

  // validate all important elements exist in Signup page 1
  validateSignup1Elements() {
    cy.get(this.eventbriteLogo).should("exist");
    cy.get(this.signupTitle).should("exist");
    cy.get(this.backgroundImage).should("exist");
    cy.get(this.emailInput).should("exist");
    cy.get(this.continueBtn).should("exist");
    cy.get(this.orDivider).should("exist");
    cy.get(this.googleSigninBtn).should("exist");
    cy.get(this.otherMethodsText).should("exist");
    cy.get(this.facebookSigninBtn).should("exist");
    cy.get(this.loginLink).should("exist");
    cy.get(this.confirmEmailInput).should("not.exist");
  }

  // validate all important elements exist in Signup page 2
  validateSignup2Elements() {
    cy.get(this.emailInput).should("exist");
    cy.get(this.confirmEmailInput).should("exist");
    cy.get(this.fnameInput).should("exist");
    cy.get(this.lnameInput).should("exist");
    cy.get(this.passwordInput).should("exist");
    cy.get(this.createAccountBtn).should("exist");
    cy.get(this.loginLink).should("exist");
    cy.get(this.backgroundImage).should("exist");
    cy.get(this.signupTitle).should("exist");
  }
}

export default Signup;
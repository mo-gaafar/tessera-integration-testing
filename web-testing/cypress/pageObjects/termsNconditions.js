class TermsNconditions {
  // ------------Selectors------------

  // Terms and conditions popup
  TermsTitle = "#edsModalContentChildren";
  logoBgd = "#edsModalContentChildren";
  agreeStatement = "#edsModalContentChildren";
  cancelButton = '[data-testid="signup-tos-form-button-cancel"]';
  agreeButton = '[data-testid="signup-tos-form-button-accept"]';
  closeButton =
    ".eds-modal__close-button > .eds-icon-button > .eds-btn--button";
  termsLink = "#tos";
  guidelinesLink = "#community-guidelines";
  privacyPolicyLink = "#privacy-policy";
  // on Signup page when Terms popup is clicked
  mustAcceptAlert = ".eds-notification-bar";
  mustAcceptText = "div[class='eds-notification-bar__content-child'] strong";
  alertIcon = ".eds-notification-bar__icon";
  // tos page
  tosPageTitle = ".text-primary";
  //guidlines page
  communityTitle = ".text-span";
  guidelinesTitle = ".h1 > :nth-child(3)";

  // Home Page
  enteredEmail =
    ".eds-global-header__user-menu > :nth-child(1) > .eds-dropdown-menu > .eds-dropdown-menu__link > .eds-dropdown-menu__contents > .eds-global-header__menu-label";

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

  validateTermsElements() {
    cy.get(this.TermsTitle).should("exist");
    cy.get(this.logoBgd).should("exist");
    cy.get(this.agreeStatement).should("exist");
    cy.get(this.cancelButton).should("exist");
    cy.get(this.agreeButton).should("exist");
    cy.get(this.closeButton).should("exist");
    cy.get(this.termsLink).should("exist");
    cy.get(this.guidelinesLink).should("exist");
    cy.get(this.privacyPolicyLink).should("exist");
  }
}

export default TermsNconditions;


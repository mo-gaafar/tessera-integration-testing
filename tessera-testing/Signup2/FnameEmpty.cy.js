import Signup from "../../../pageObjects/signupPage copy";

describe("Signup Page 2 - Normal case", () => {
  beforeEach("Validate that all elements exist in Signup 2 - after correct email is written", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
    cy.fixture("userJim.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
    });
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements();
  });

  it("Validate that signup page gives alert for missing first name field", () => {
    const signupObj = new Signup();
    cy.fixture("userJim.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.lnameInput).type(data.Lname);
      cy.get(signupObj.passwordInput).type(data.password);
    });

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your Password is strong ");
    // cy.get(signupObj.passwordStrengthMsg).should("exist");
    // cy.get(signupObj.passwordStrengthMsg).should("have.text", "is very strong");
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.FnameMsg).should("exist");
    cy.get(signupObj.FnameMsg).should("have.text", " First name is required");
    cy.get(signupObj.termsNconditionsPopup).should("not.exist");
    //cy.url().should("be.equal", "https://www.eventbrite.com/signin/signup");
  });
});

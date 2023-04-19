import Signup from "../../../pageObjects/signupPage copy.js";

describe("Signup Page 2 - Password is moderate", () => {
  beforeEach("Validate that all elements exist in Signup 2 - after correct email is written", () => {
    const signupObj = new Signup();
    signupObj.visitWebsite();
    signupObj.validateSignup1Elements();
    cy.fixture("userRosa.json").then((data) => {
      const signupObj = new Signup();
      signupObj.setEmail(data.email);
    });
    cy.get(signupObj.continueBtn).click();
    signupObj.validateSignup2Elements();
  });

  it.only("Validate Your password message according to input moderate", () => {
    const signupObj = new Signup();
    cy.fixture("userRosa.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("1234567@eee");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your Password is moderate ");
    cy.get(signupObj.createAccountBtn).click();
    //y.get(signupObj.termsNconditionsPopup).should("not.exist");
  });
});

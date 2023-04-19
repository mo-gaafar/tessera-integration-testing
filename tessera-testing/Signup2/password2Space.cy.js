import Signup from "../../../pageObjects/signupPage copy";

describe("Signup Page 2 - Password less than 8 characters", () => {

  beforeEach("Validate that all elements exist in Signup 1 & 2", () => {
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

  it("Validate Your password message according to input 2 spaces", () => {
    const signupObj = new Signup();
    // signupObj.visitWebsite();

    cy.fixture("userRosa.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("  ");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password must be at least 8 characters and strong");
    
    cy.get(signupObj.createAccountBtn).click();
    

    cy.get(signupObj.termsNconditionsPopup).should("not.exist");
  });
});

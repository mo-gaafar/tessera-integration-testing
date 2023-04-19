import Signup from "../../../pageObjects/signupPage copy.js";

describe("Signup Page 2 - Password less than 8 characters", () => {
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

  it("Validate Your password message according to input less than 8 characters", () => {
    const signupObj = new Signup();
    cy.fixture("userJim.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
      cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);
    });
    cy.get(signupObj.passwordInput).type("123456");

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password must be at least 8 characters and strong");
    
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.passwordLess8Alert).should('exist');
    cy.get(signupObj.passwordLess8Alert).should(
      "have.text",
      " Your password must be at least 8 characters and strong"
    );

    cy.get(signupObj.termsNconditionsPopup).should("not.exist");

  });
});

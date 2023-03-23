import Signup from "../../pageObjects/signupPage.js";

describe("Signup Page 2 - Normal case", () => {
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

  it.only("Validate terms and conditions popup when all fields are filled", () => {
    const signupObj = new Signup();
    cy.fixture("userRosa.json").then((data) => {
      const signupObj = new Signup();
      cy.get(signupObj.confirmEmailInput).type(data.email);
        cy.get(signupObj.fnameInput).type(data.Fname);
      cy.get(signupObj.lnameInput).type(data.Lname);

    });
    // change accordingly

    cy.get(signupObj.passwordStrengthIndicator).should("exist");
    cy.get(signupObj.yourPasswordMsg).should("have.text", "Your password ");
    cy.get(signupObj.passwordLess8Msg).should("exist");
    cy.get(signupObj.passwordLess8Msg).should(
      "have.text",
      "must be at least 8 characters"
    );
    cy.get(signupObj.createAccountBtn).click();
    cy.get(signupObj.passwordRequiredMsg).should('exist');
    cy.get(signupObj.passwordRequiredMsg).should("have.text", "Field required");

    cy.get(signupObj.termsNconditionsPopup).should("not.exist");
  });
});

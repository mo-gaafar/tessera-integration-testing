import Login from "../../pageObjects/loginPage.js";

describe("Login - Forgot password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Go to forgot password", () => {
    const loginObj = new Login();
    cy.fixture("userMichael.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
      loginObj.setPassword("iDontKnow")
    });

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.incorrectPasswordAlert).should("exist");
    cy.get(loginObj.incorrectPasswordMsg).should("exist");
    cy.get(loginObj.incorrectPasswordMsg).should(
      "have.text",
      "The password is not correct."
    );
    cy.get(loginObj.incorrectPassBelowField).should("exist");
    cy.get(loginObj.incorrectPassBelowField).should(
      "have.text",
      "The password is not correct."
    );
    cy.get(loginObj.forgotPasswordBtn).should("exist");
    cy.get(loginObj.forgotPasswordBtn).should("have.text", "Forgot password?");
    cy.get(loginObj.forgotPasswordBtn).click();
    cy.get(loginObj.forgotPasswordPopup).should("be.visible");
    cy.get(loginObj.checkEmailTitle).should("exist");
    cy.get(loginObj.checkEmailTitle).should(
      "have.text",
      "Check your email to update your password"
    );
    cy.get(loginObj.sentAlinkMsg).should("exist");
    cy.get(loginObj.sentAlinkMsg).should(
      "have.text",
      "We sent a link to michaelRegionalManager@gmail.com to update your password."
    );
    cy.wait(3000);
    cy.get(loginObj.forgotPasswordClose).should("exist");
    cy.get(loginObj.forgotPasswordClose).click();

  
  });
});

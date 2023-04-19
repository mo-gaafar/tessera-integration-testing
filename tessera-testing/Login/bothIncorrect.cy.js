import Login from "../../../pageObjects/loginPage.js";

describe("Login - Incorrect email & password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to incorrect email & password", () => {
    const loginObj = new Login();
    loginObj.setEmail("incorrectEmail");
    loginObj.setPassword("incorrectPassword");

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.incorrectEmailMsg).should("exist");
    cy.get(loginObj.incorrectEmailMsg).should(
      "have.text",
      "Please enter a valid email address"
    );
  });
});

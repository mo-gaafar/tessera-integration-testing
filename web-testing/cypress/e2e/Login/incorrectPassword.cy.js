import Login from "../../pageObjects/loginPage.js";

describe("Login - Incorrect password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to incorrect password", () => {
    const loginObj = new Login();
    cy.fixture("userMichael.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
    });
    loginObj.setPassword("incorrectPassword");

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.incorrectEmailMsg).should("exist");
    cy.get(loginObj.incorrectEmailMsg).should(
      "have.text",
      "The password is not correct."
    );
    cy.get(loginObj.incorrectPasswordNotification).should("exist");
    cy.get(loginObj.incorrectPasswordNotification).should(
      "have.text",
      "The password is not correct."
    );
    cy.get(loginObj.forgotPasswordBtn).should("exist");
  });
});

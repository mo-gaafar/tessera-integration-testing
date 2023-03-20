import Login from "../../pageObjects/loginPage.js";

describe("Login - Nonexistent email i.e. doesn't have an account", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to nonexistent email", () => {
    const loginObj = new Login();
    cy.fixture("userRosa.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
      loginObj.setPassword(data.password);
    });

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.createAccountAlert).should('exist');
    cy.get(loginObj.createAccountMsg).should('exist');
    cy.get(loginObj.createAccountMsg).should(
      "have.text",
      "There is no account associated with the email.Create account"
    );
    cy.get(loginObj.createAccountLink).should("exist");
    cy.get(loginObj.createAccountLink).should("have.text", "Create account");
  });
});

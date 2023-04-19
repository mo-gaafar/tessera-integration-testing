import Login from "../../pageObjects/loginPage.js";

describe("Login - Empty password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to empty password", () => {
    const loginObj = new Login();
    cy.fixture("userIam.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
    });

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.incorrectEmailMsg).should("exist");
    cy.get(loginObj.incorrectEmailMsg).should(
      "have.text",
      "Password is required"
    );

  });
});

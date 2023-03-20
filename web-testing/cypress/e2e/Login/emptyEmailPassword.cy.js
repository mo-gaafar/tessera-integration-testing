import Login from "../../pageObjects/loginPage.js";

describe("Login - Empty email & password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to empty email & password", () => {
    const loginObj = new Login();
    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.emptyEmailMsg).should("exist");
    cy.get(loginObj.emptyPasswordMsg).should("exist");
    cy.get(loginObj.emptyPasswordMsg).should('have.text', 'Password is required');
    cy.get(loginObj.emptyEmailMsg).should('have.text', 'Please enter a valid email address');

  });
});

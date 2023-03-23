import Login from "../../pageObjects/loginPage.js";

describe("Login - Normal case", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Successful Login", () => {
    const loginObj = new Login();
    cy.fixture("userMichael.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
      loginObj.setPassword(data.password);
    });
    cy.get(loginObj.passwordInput)
      .invoke("attr", "type")
      .should("eq", "password");
      cy.wait(1000);
    cy.get(loginObj.passwordShowHide).click();
    cy.get(loginObj.passwordInput)
      .invoke("attr", "type")
      .should("eq", "text");
      cy.wait(2000);
      cy.get(loginObj.passwordShowHide).click();

  });
});

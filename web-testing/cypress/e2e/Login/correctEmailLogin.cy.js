import Login from "../../pageObjects/loginPage.js";

describe("Login - Normal case", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Successful Login", () => {
    const loginObj = new Login();
    cy.fixture("userIam.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
      loginObj.setPassword(data.password);
    });
    cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.loginBtn).should("not.exist");
  });
});

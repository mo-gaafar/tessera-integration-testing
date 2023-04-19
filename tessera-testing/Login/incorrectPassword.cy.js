import Login from "../../../pageObjects/loginPage copy.js";

describe("Login - Incorrect password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Unsuccessful Login due to incorrect password", () => {
    const loginObj = new Login();
    cy.fixture("userHassan.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
    });
    loginObj.setPassword("incorrectPassword");

    cy.get(loginObj.loginBtn).click();
    cy.get(loginObj.forgotPasswordBtn).should("exist");
    cy.get(loginObj.forgotPasswordBtn).should("have.text", " Forgot Password ");
    
    
    cy.get(loginObj.forgotPasswordBtn).should("exist");
  });
});

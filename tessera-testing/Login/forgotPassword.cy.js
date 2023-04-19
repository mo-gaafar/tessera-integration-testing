import Login from "../../../pageObjects/loginPage copy.js";

describe("Login - Forgot password", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Go to forgot password", () => {
    const loginObj = new Login();
    cy.fixture("userHassan.json").then((data) => {
      const loginObj = new Login();
      loginObj.setEmail(data.email);
      loginObj.setPassword("iDontKnow")
    });

    cy.get(loginObj.loginBtn).click();
    //cy.get(loginObj.navbar).should("not.exist");
    cy.get(loginObj.incorrectPasswordAlert).should("exist");
    
    cy.get(loginObj.incorrectPasswordAlert).should(
      "have.text",
      "Incorrect password"
    );
    
    cy.get(loginObj.forgotPasswordBtn).should("exist");
    cy.get(loginObj.forgotPasswordBtn).should("have.text", " Forgot Password ");
    cy.get(loginObj.forgotPasswordBtn).click();
    cy.url().should('include','forget')
    
    cy.wait(3000);
    cy.go('back')
    

  
  });
});

import Login from "../../../pageObjects/loginPage copy.js";
//import Signup from "../../pageObjects/signupPage.js";

describe("Navigate from login to signup and back", () => {

  it("Login to Signup multiple times", () => {
    const loginObj = new Login();
    //const signupObj = new Signup();
    loginObj.visitWebsite();
    cy.get(loginObj.emailInput).type("hassan@gmail.com")
    cy.get(loginObj.passwordInput).type("12343")
    cy.get(loginObj.loginTitle).should("have.text", "Log in");
    cy.get(loginObj.loginBtn).click()
    cy.wait(2000);
    //cy.get(loginObj.signupRedirect).click();
    //cy.get(loginObj.loginTitle).should("have.text", "Create an account");
    cy.wait(2000);
    cy.get(loginObj.createAccountLink).click();
    cy.url().should('include','signup')
    cy.wait(2000);
    cy.go('back')
    // cy.get(loginObj.signupRedirect).click();
    // cy.get(loginObj.loginTitle).should("have.text", "Create an account");
   
  });
});

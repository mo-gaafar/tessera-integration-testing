import Login from "../../pageObjects/loginPage.js";
import Signup from "../../pageObjects/signupPage.js";

describe("Navigate from login to signup and back", () => {

  it("Login to Signup multiple times", () => {
    const loginObj = new Login();
    const signupObj = new Signup();
    loginObj.visitWebsite();
    cy.get(loginObj.loginTitle).should("have.text", "Log in");
    cy.wait(2000);
    cy.get(loginObj.signupRedirect).click();
    cy.get(loginObj.loginTitle).should("have.text", "Create an account");
    cy.wait(2000);
    cy.get(signupObj.loginLink).click();
    cy.get(loginObj.loginTitle).should("have.text", "Log in");
    cy.wait(2000);
    cy.get(loginObj.signupRedirect).click();
    cy.get(loginObj.loginTitle).should("have.text", "Create an account");
   
  });
});

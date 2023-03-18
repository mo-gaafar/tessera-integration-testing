import Login from "../../pageObjects/loginPage.js";

describe("Google Login", () => {
  it("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it.only("Login with Google", () => {
    const loginObj = new Login(); 
    loginObj.visitWebsite();
    cy.xpath(loginObj.googleLoginBtn).click();
    // cy.get(loginObj.googleLoginBtn).click();


  });
});

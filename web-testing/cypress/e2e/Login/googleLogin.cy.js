import Login from "../../pageObjects/loginPage.js";
//POSTPONED
describe("Google Login", () => {
  beforeEach("Validate that all elements exist in Login", () => {
    const loginObj = new Login();
    loginObj.visitWebsite();
    loginObj.validateLoginElements();
  });

  it("Login with Google", () => {
    const loginObj = new Login(); 
    cy.xpath(loginObj.googleLoginBtn).click();
    // cy.get(loginObj.googleLoginBtn).click();


  });
});

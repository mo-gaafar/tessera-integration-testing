class HomePage {
  Logo =
    "div[class='consumer-header__mobile-links eds-align--space-between'] a[class='consumer-header__logo-link']";
  SearchBar =
    '[data-testid="consumer-global-header-search"] > [data-testid="input-field-wrapper"] > .eds-field-styled__border-simulation > .eds-field-styled__internal > .eds-field-styled__input-container';
  OrganizeDropdown =
    ".consumer-header__menus > :nth-child(1) > :nth-child(1) > .eds-dropdown-menu > .eds-dropdown-menu__link";
  HelpDropdown =
    ":nth-child(2) > :nth-child(1) > .eds-dropdown-menu > .eds-dropdown-menu__link > .eds-dropdown-menu__contents > .consumer-header__menu-label";
  CreateEvent =
    ".consumer-header__quick-link.consumer-header__quick-link--cta.consumer-header__menu-label";
  LoginButton =
    '[data-testid="consumer-header-links-test"] > [data-testid="consumer-header-quick-links"] > [href="https://www.eventbrite.com/signin/?referrer=%2F"]';
  SignupButton =
    '[data-testid="consumer-header-links-test"] > [data-testid="consumer-header-quick-links"] > [href="https://www.eventbrite.com/signin/signup/?referrer=%2F"]';
  Header = ".feed-fullbleed-header__title";
  FindYourNextTicketBtn = ".eds-link";
  LocationPicker = "#locationPicker";
  NavigationBar = ".eds-tabs__navigation-list";
  AllBtn = "#tab0";
  ForYouBtn = "#tab1";
  OnlineBtn = "#tab2";
  TodayBtn = "#tab3";
  ThisWeekendBtn = "#tab4";
  WomenBtn = "#tab6";
  FreeBtn = "#tab10";
  MusicBtn = "#tab11";
  FoodBtn = "#tab12";
  CharityBtn = "#tab13";
  CategoriesMsg = ".home__category-tiles--title";
  MusicIcon = "#music-note_svg__eds-icon--music-note_svg";
  HolidayIcon = "#holiday_svg__eds-icon--holiday_svg";
  HobbiesIcon = "#game_svg__eds-icon--game_svg";
  FoodIcon = "#cocktail_svg__eds-icon--cocktail_svg";
  ArtsIcon = "#mask_svg__eds-icon--mask_svg";
  HealthIcon = "#heart_svg__eds-icon--heart_svg";
  BusniesIcon = ".briefcase_svg__eds-icon--briefcase_svg";
  SportsIcon = "#shoe_svg__eds-icon--sport_base";
  SeeMoreBtn = ".eds-g-cell.eds-g-cell-6-12.eds-g-cell-sw-4-12";
  ComedyBtn = ":nth-child(1) > .eds-tag__text";
  Food = ":nth-child(2) > .eds-tag__text";
  Education = ":nth-child(3) > .eds-tag__text";
  Pop = ":nth-child(4) > .eds-tag__text";
  Design = ":nth-child(5) > .eds-tag__text";
  R_b = ":nth-child(6) > .eds-tag__text";
  HipHop = ":nth-child(7) > .eds-tag__text";
  Film = ":nth-child(8) > .eds-tag__text";
  PersonalHealth = ":nth-child(9) > .eds-tag__text";
  Blues = ":nth-child(10) > .eds-tag__text";
  Travel = ":nth-child(11) > .eds-tag__text";
  Rock = ":nth-child(12) > .eds-tag__text";
  Yoga = ":nth-child(13) > .eds-tag__text";
  Country = ":nth-child(14) > .eds-tag__text";
  startups = ":nth-child(15) > .eds-tag__text";
  Classic = ":nth-child(16) > .eds-tag__text";
  MentalHealth = ":nth-child(17) > .eds-tag__text";
  TV = ":nth-child(18) > .eds-tag__text";
  ALT = ":nth-child(19) > .eds-tag__text";
  MUSICAL = ":nth-child(20) > .eds-tag__text";
  emailInput = "#email";
  passwordInput = "#password";
  loginBtn = ":nth-child(4) > div > .eds-btn";
  Likes = "#heart-chunky_svg__eds-icon--user-chunky_svg";
  Tickets = ":nth-child(3) > .consumer-header__quick-link > :nth-child(2)";

  // CategoriesBrowse='.tile-group'
  // EventsFeed=':nth-child(2) > .feed-events-bucket'
  // SeoMoreButton='.eds-g-cell.eds-g-cell-6-12.eds-g-cell-sw-4-12'
  // MarketingBanner='.eds-global-footer.eds-g-grid.l-mar-top-2'
  ValidateMainElement() {
    cy.get(this.Logo).should("exist");
    cy.get(this.OrganizeDropdown).should("exist");
    cy.get(this.SearchBar).should("exist");
    cy.get(this.HelpDropdown).should("exist");
    cy.get(this.CreateEvent).should("exist");
    cy.get(this.LoginButton).should("exist");
    cy.get(this.SignupButton).should("exist");
    cy.get(this.Header).should("exist");
    cy.get(this.FindYourNextTicketBtn).should("exist");
    cy.get(this.LocationPicker).should("exist");
  }
  ValidateNavigation() {
    cy.get(this.NavigationBar).should("exist");
    cy.get(this.AllBtn).should("exist");
    cy.get(this.ForYouBtn).should("exist");
    cy.get(this.OnlineBtn).should("exist");
    cy.get(this.TodayBtn).should("exist");
    cy.get(this.ThisWeekendBtn).should("exist");
    cy.get(this.WomenBtn).should("exist");
    cy.get(this.FreeBtn).should("exist");
    cy.get(this.MusicBtn).should("exist");
    cy.get(this.FoodBtn).should("exist");
    cy.get(this.CharityBtn).should("exist");
    cy.get(this.CategoriesMsg).should("exist");
    ///////////////////////////////////
    cy.get(this.MusicIcon).should("exist");
    cy.get(this.HolidayIcon).should("exist");
    cy.get(this.HobbiesIcon).should("exist");
    cy.get(this.FoodIcon).should("exist");
    cy.get(this.ArtsIcon).should("exist");
    cy.get(this.HealthIcon).should("exist");
    cy.get(this.BusniesIcon).should("exist");
    cy.get(this.SportsIcon).should("exist");
    cy.wait(5000);
    cy.get(this.SeeMoreBtn).should("exist");
    cy.wait(5000);
    cy.get(this.ComedyBtn).should("exist");
    cy.get(this.Food).should("exist");
    cy.get(this.Education).should("exist");
    cy.get(this.Pop).should("exist");
    cy.get(this.R_b).should("exist");
    cy.get(this.Design).should("exist");
  }
  OrganizeDropDown() {
    cy.get(this.OrganizeDropdown).should("be.visible").trigger("mouseover");
  }
  HelpDropDown() {
    cy.get(this.HelpDropdown).should("be.visible").trigger("mouseover");
  }
}
export default HomePage;
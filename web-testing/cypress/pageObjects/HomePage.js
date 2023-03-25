class HomePage{

    Logo="div[class='consumer-header__mobile-links eds-align--space-between'] a[class='consumer-header__logo-link']"
    SearchBar='[data-testid="consumer-global-header-search"] > [data-testid="input-field-wrapper"] > .eds-field-styled__border-simulation > .eds-field-styled__internal > .eds-field-styled__input-container'
    OrganizeDropdown='.consumer-header__menus > :nth-child(1) > :nth-child(1) > .eds-dropdown-menu > .eds-dropdown-menu__link'
    HelpDropdown=".consumer-header__menus > :nth-child(1) > :nth-child(1) > .eds-dropdown-menu > .eds-dropdown-menu__link"
    CreateEvent=".consumer-header__quick-link.consumer-header__quick-link--cta.consumer-header__menu-label"
    LoginButton='[data-testid="consumer-header-links-test"] > [data-testid="consumer-header-quick-links"] > [href="https://www.eventbrite.com/signin/?referrer=%2F"]'
    SignupButton='[data-testid="consumer-header-links-test"] > [data-testid="consumer-header-quick-links"] > [href="https://www.eventbrite.com/signin/signup/?referrer=%2F"]'
    Header= '.feed-fullbleed-header__title'
    FindYourNextTicketBtn=".eds-link"
    LocationPicker='#locationPicker'
    NavigationBar='.eds-tabs__navigation-list'
    AllBtn="#tab0 > .eds-btn--button"
    ForYouBtn="#tab1 > .eds-btn--button"
    OnlineBtn="#tab2 > .eds-btn--button"
    TodayBtn="#tab3 > .eds-btn--button"
    ThisWeekendBtn="#tab4 > .eds-btn--button"
    WomenBtn="#tab6 > .eds-btn--button"
    FreeBtn="#tab10 > .eds-btn--button"
    MusicBtn="#tab11 > .eds-btn--button"
    FoodBtn="#tab12 > .eds-btn--button"
    CharityBtn="#tab13 > .eds-btn--button"
    CategoriesMsg=".home__category-tiles--title"
    MusicIcon="#music-note_svg__eds-icon--music-note_svg"
    HolidayIcon="#holiday_svg__eds-icon--holiday_svg"
    HobbiesIcon="#game_svg__eds-icon--game_svg"
    FoodIcon="#game_svg__eds-icon--game_svg"
    ArtsIcon="#game_svg__eds-icon--game_svg"
    HealthIcon="#heart_svg__eds-icon--heart_svg"
    BusniesIcon=".briefcase_svg__eds-icon--briefcase_svg"
    SportsIcon="#shoe_svg__eds-icon--sport_base"
    SeeMoreBtn=".eds-g-cell.eds-g-cell-6-12.eds-g-cell-sw-4-12"
    ComedyBtn="div[class='home__interests-selector__tag-container'] div div:nth-child(1)"
    Food="div[class='home__interests-selector__tag-container'] div div:nth-child(1) span:nth-child(1)"
    Education="div[class='home__interests-selector__tag-container'] div div:nth-child(1) span:nth-child(1)"
    Pop="div[class='home__interests-selector__tag-container'] div div:nth-child(1) span:nth-child(1)"
    Design="div[class='home__interests-selector__container'] div:nth-child(5) span:nth-child(1)"
    R_b="div[class='home__interests-selector__container'] div:nth-child(5) span:nth-child(1)"


    // CategoriesBrowse='.tile-group'
    // EventsFeed=':nth-child(2) > .feed-events-bucket'
    // SeoMoreButton='.eds-g-cell.eds-g-cell-6-12.eds-g-cell-sw-4-12'
    // MarketingBanner='.eds-global-footer.eds-g-grid.l-mar-top-2'
    ValidateMainElement(){
     cy.get(this.Logo).should('exist')
     cy.get(this.OrganizeDropdown).should('exist')
     cy.get(this.SearchBar).should('exist')
     cy.get(this.HelpDropdown).should('exist')
     cy.get(this.CreateEvent).should('exist')
     cy.get(this.LoginButton).should('exist')
     cy.get(this.SignupButton).should('exist')
     cy.get(this.Header).should('exist')
     cy.get(this.FindYourNextTicketBtn).should('exist')
     cy.get(this.LocationPicker).should('exist')
    }
    ValidateNavigation(){
     cy.get(this.NavigationBar).should('exist')
     cy.get(this.AllBtn).should('exist')
     cy.get(this.ForYouBtn).should('exist')
     cy.get(this.OnlineBtn).should('exist') 
     cy.get(this.TodayBtn).should('exist')
     cy.get(this.ThisWeekendBtn).should('exist') 
     cy.get(this.WomenBtn).should('exist')
     cy.get(this.FreeBtn).should('exist')
     cy.get(this.MusicBtn).should('exist')
     cy.get(this.FoodBtn).should('exist')
     cy.get(this.CharityBtn).should('exist')
     cy.get(this.CategoriesMsg).should('exist')
     ///////////////////////////////////
     cy.get(this.MusicIcon).should('exist')
     cy.get(this.HolidayIcon).should('exist')
     cy.get(this.HobbiesIcon).should('exist')
     cy.get(this.FoodIcon).should('exist')
     cy.get(this.ArtsIcon).should('exist')
     cy.get(this.HealthIcon).should('exist')
     cy.get(this.BusniesIcon).should('exist')
     cy.get(this.SportsIcon).should('exist')
     cy.wait(5000)
     cy.get(this.SeeMoreBtn).should('exist')
     cy.wait(5000)
     cy.get(this.ComedyBtn).should('exist')
     cy.get(this.Food).should('exist')
     cy.get(this.Education).should('exist')
     cy.get(this.Pop).should('exist')
     cy.get(this.R_b).should('exist')
     cy.get(this.Design).should('exist')

    }

}
export default HomePage;
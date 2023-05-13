import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class createEvent {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        dc.setCapability("appPackage","com.example.tessera");
        dc.setCapability("appActivity","com.example.tessera.MainActivity");
        // get the URL
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        // create the driver
        AndroidDriver driver = new AndroidDriver(url, dc);


        Thread.sleep(9000);

        // check continue email
        WebElement continueEmail = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue with Email Address\"]"));
        String continueEmailText = continueEmail.getAttribute("content-desc");
        if(continueEmailText.equals("Continue with Email Address"))
        {
            System.out.println("Continue Email Passed");
        }
        else
        {
            System.out.println("Continue Email  Failed");
        }
        continueEmail.click();
        Thread.sleep(3000);

        WebElement emailTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Email\"]"));
        String emailTitleText = emailTitle.getAttribute("content-desc");
        if(emailTitleText.equals("Email"))
        {
            System.out.println("Email Passed");
        }
        else
        {
            System.out.println("Email Failed");
        }

        // input an existing email
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        emailInput.click();
        Thread.sleep(5000);
        emailInput.sendKeys("rosa.rehab25@gmail.com");

        // click the next button
        WebElement nextBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
        nextBtn.click();

        Thread.sleep(5000);

        // check that the email matches
        WebElement loggedinEmail = driver.findElement(By.xpath("//android.view.View[@content-desc=\"rosa.rehab25@gmail.com\"]"));
        String loggedinEmailText = loggedinEmail.getAttribute("content-desc");
        if(loggedinEmailText.equals("rosa.rehab25@gmail.com"))
        {
            System.out.println("Logged in Email Passed");
        }
        else
        {
            System.out.println("Logged in Email Failed");
        }

        // enter Password
        WebElement passwordInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        passwordInput.click();
        Thread.sleep(5000);
        passwordInput.sendKeys("rosa@Rehab1122");

        Thread.sleep(5000);
        // click the login button
        WebElement loginBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]"));
        loginBtn.click();

        Thread.sleep(9000);

        // click on hamburger menu
        WebElement hamburgerMenu = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
        hamburgerMenu.click();

        Thread.sleep(3000);

        // check that the email matches
        WebElement emailShown = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Hello, null\"]"));
        String emailShownText = emailShown.getAttribute("content-desc");
        if(emailShownText.equals("Hello, rosa.rehab25@gmail.com"))
        {
            System.out.println("Logged in Email Greeting Passed");
        }
        else
        {
            System.out.println("Logged in Email Greeting Failed");
        }

        // click organize
        WebElement organizeBtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Organize\"]"));
        organizeBtn.click();

        // flip through tabs
        WebElement eventsTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Events\"]"));
        String eventsTitleText = eventsTitle.getAttribute("content-desc");
        if(eventsTitleText.equals("Events"))
        {
            System.out.println("Events Title Passed");
        }
        else
        {
            System.out.println("Events Title Failed");
        }

        WebElement liveTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Live\n" +
                "Tab 1 of 3\"]"));
        String liveTabText = liveTab.getAttribute("content-desc");
        if(liveTabText.equals("Live\n" +
                "Tab 1 of 3"))
        {
            System.out.println("Live Tab Title Passed");
        }
        else
        {
            System.out.println("Live Tab Title Failed");
        }

        WebElement pastTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Past\n" +
                "Tab 2 of 3\"]"));
        String pastTabText = pastTab.getAttribute("content-desc");
        if(pastTabText.equals("Past\n" +
                "Tab 2 of 3"))
        {
            System.out.println("Past Tab Title Passed");
        }
        else
        {
            System.out.println("Past Tab Title Failed");
        }

        WebElement draftTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Draft\n" +
                "Tab 3 of 3\"]"));
        String draftTabText = draftTab.getAttribute("content-desc");
        if(draftTabText.equals("Draft\n" +
                "Tab 3 of 3"))
        {
            System.out.println("Draft Tab Title Passed");
        }
        else
        {
            System.out.println("Draft Tab Title Failed");
        }

        Thread.sleep(2000);

        // add an event
        WebElement addEventBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
        addEventBtn.click();
        Thread.sleep(3000);

        // add a title for the event
        WebElement addEventTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Give your event a title.\"]"));
        String addEventTitleText = addEventTitle.getAttribute("content-desc");
        if(addEventTitleText.equals("Give your event a title."))
        {
            System.out.println("Add Event Title Passed");
        }
        else
        {
            System.out.println("Add Event Title Failed");
        }

        WebElement addEventTitleInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        addEventTitleInput.click();
        addEventTitleInput.sendKeys("it's an event");

        WebElement nextStepBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        nextStepBtn1.click();
        Thread.sleep(3000);

        // add a description for the event
        WebElement addEventDesc = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Describe your event.\"]"));
        String addEventDescText = addEventDesc.getAttribute("content-desc");
        if(addEventDescText.equals("Describe your event."))
        {
            System.out.println("Add Event Description Passed");
        }
        else
        {
            System.out.println("Add Event Description Failed");
        }

        WebElement addEventDescInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        addEventDescInput.click();
        addEventDescInput.sendKeys("very imppressive");
        Thread.sleep(3000);

        WebElement nextStepBtn2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        nextStepBtn2.click();
        Thread.sleep(3000);

        // add date and time for event
        WebElement addEventTimeTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Set the date of your event.\"]"));
        String addEventTimeTitleText = addEventTimeTitle.getAttribute("content-desc");
        if(addEventTimeTitleText.equals("Set the date of your event."))
        {
            System.out.println("Add Event Time & Date Passed");
        }
        else
        {
            System.out.println("Add Event Time & Date Failed");
        }

        // event start date
        WebElement addEventStart = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Date\"])[1]"));
        Thread.sleep(3000);
        addEventStart.click();
        Thread.sleep(3000);

        WebElement myEventStart = driver.findElement(By.xpath("//android.view.View[@content-desc=\"23, Tuesday, May 23, 2023\"]"));
        myEventStart.click();
        Thread.sleep(3000);

        WebElement confirmEventStartDate = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        confirmEventStartDate.click();
        Thread.sleep(5000);

        // event end date
        WebElement addEventEnd = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Date\"]"));
        addEventEnd.click();
        Thread.sleep(3000);

        WebElement myEventEnd = driver.findElement(By.xpath("//android.view.View[@content-desc=\"15, Monday, May 15, 2023\"]"));
        myEventEnd.click();
        Thread.sleep(3000);

        WebElement confirmEventEndDate = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        confirmEventEndDate.click();
        Thread.sleep(5000);


        // add event start time
        WebElement addEventStartTime = driver.findElement(By.xpath("(//android.view.View[@content-desc=\"Time\"])[1]"));
        addEventStartTime.click();
        Thread.sleep(10000);


        // event end date
        WebElement addEventEndTime = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Time\"]"));
        addEventEndTime.click();
        Thread.sleep(10000);

        WebElement nextStepBtn3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        nextStepBtn3.click();
        Thread.sleep(3000);

        WebElement addVenue = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Venue\"]"));
        addVenue.click();
        Thread.sleep(3000);

        WebElement chooseOnline = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Online Event\"]"));
        chooseOnline.click();
        Thread.sleep(3000);

        WebElement nextStepBtn4 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));
        nextStepBtn4.click();
        Thread.sleep(3000);


        WebElement searchCategory = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Event category\n" +
                "Select a Category\"]"));
        searchCategory.click();
        Thread.sleep(3000);

        WebElement chooseCategory = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Business & Professional\"]"));
        chooseCategory.click();
        Thread.sleep(5000);


        Thread.sleep(5000);

        WebElement continueBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create event and continue to ticketing\"]"));
        continueBtn.click();
        Thread.sleep(5000);

        WebElement searchCategory2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Event category\n" +
                "Business & Professional\"]"));
        searchCategory2.click();
        Thread.sleep(3000);

        WebElement chooseCategory2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Music\"]"));
        chooseCategory2.click();
        Thread.sleep(5000);

        WebElement continueBtn2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Create event and continue to ticketing\"]"));
        continueBtn2.click();
        Thread.sleep(3000);

        WebElement addTicketsBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        addTicketsBtn.click();
        Thread.sleep(3000);

        WebElement paidTicketsBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Paid\"]"));
        paidTicketsBtn.click();
        Thread.sleep(3000);

        WebElement paidTicNameInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        paidTicNameInput.click();
        Thread.sleep(3000);
        paidTicNameInput.sendKeys("VIP");
        Thread.sleep(5000);

        WebElement paidAvailQuantInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
        paidAvailQuantInput.click();
        Thread.sleep(3000);
        paidAvailQuantInput.sendKeys("3");
        Thread.sleep(5000);

        WebElement paidTicPriceInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[3]"));
        paidTicPriceInput.click();
        Thread.sleep(3000);
        paidTicPriceInput.sendKeys("100");
        Thread.sleep(5000);

        WebElement paidStartTime = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"));
        paidStartTime.click();
        Thread.sleep(3000);

        WebElement paidStartTimeOK = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        paidStartTimeOK.click();
        Thread.sleep(3000);

        WebElement paidEndTime = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]"));
        paidEndTime.click();
        Thread.sleep(3000);

        WebElement choosePaidEndTime = driver.findElement(By.xpath("//android.view.View[@content-desc=\"20, Saturday, May 20, 2023\"]"));
        choosePaidEndTime.click();
        Thread.sleep(3000);

        WebElement paidEndTimeOK = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        paidEndTimeOK.click();
        Thread.sleep(3000);

        WebElement paidStartTiming = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]"));
        paidStartTiming.click();
        Thread.sleep(4000);

        WebElement paidEndTiming = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]"));
        paidEndTiming.click();
        Thread.sleep(4000);

        WebElement checkBtn1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
        checkBtn1.click();
        Thread.sleep(3000);

        WebElement addTixBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Tickets\"]"));
        addTixBtn.click();
        Thread.sleep(3000);

        WebElement freeTierBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Free\"]"));
        freeTierBtn.click();
        Thread.sleep(3000);

        WebElement freeTixNameInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]"));
        freeTixNameInput.click();
        Thread.sleep(3000);
        freeTixNameInput.sendKeys("free");
        Thread.sleep(3000);

        WebElement freeTixQuantInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]"));
        freeTixQuantInput.click();
        Thread.sleep(3000);
        freeTixQuantInput.sendKeys("20");
        Thread.sleep(3000);

        WebElement freeTixStartDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"));
        freeTixStartDate.click();
        Thread.sleep(3000);

        WebElement freeTixStartOK = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        freeTixStartOK.click();
        Thread.sleep(3000);

        WebElement freeTixEndDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]"));
        freeTixEndDate.click();
        Thread.sleep(3000);

        WebElement chooseFreeTixEndDate = driver.findElement(By.xpath("//android.view.View[@content-desc=\"20, Saturday, May 20, 2023\"]"));
        chooseFreeTixEndDate.click();
        Thread.sleep(3000);

        WebElement freeTixEndOK = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]"));
        freeTixEndOK.click();
        Thread.sleep(3000);

        Thread.sleep(10000);

        WebElement checkBtn2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
        checkBtn2.click();
        Thread.sleep(3000);

        WebElement promoTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Promo Codes\n" +
                "Tab 2 of 2\"]"));
        promoTab.click();
        Thread.sleep(3000);

        WebElement addPromoCode = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Promo code\"]"));
        addPromoCode.click();
        Thread.sleep(3000);

        WebElement chooseAddPromoCode = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add Promo code\"]"));
        chooseAddPromoCode.click();
        Thread.sleep(6000);

        WebElement codeInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        codeInput.click();
        Thread.sleep(3000);
        codeInput.sendKeys("pr");
        Thread.sleep(3000);

        WebElement discountInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        discountInput.click();
        Thread.sleep(3000);
        discountInput.sendKeys("10");
        Thread.sleep(3000);

        WebElement limitInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        limitInput.click();
        Thread.sleep(3000);
        limitInput.sendKeys("3");
        Thread.sleep(3000);

        WebElement saveBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]"));
        saveBtn.click();
        Thread.sleep(3000);

        WebElement admissionTab = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Addmission\n" +
                "Tab 1 of 2\"]"));
        admissionTab.click();
        Thread.sleep(3000);

        WebElement nextBtn2 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
        nextBtn2.click();
        Thread.sleep(3000);

        WebElement choosePublic = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton[1]"));
        choosePublic.click();
        Thread.sleep(3000);

        WebElement choosePublishLater = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.RadioButton[4]"));
        choosePublishLater.click();
        Thread.sleep(10000);

        WebElement publishBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Publish\"]"));
        publishBtn.click();
        Thread.sleep(10000);
















        Thread.sleep(3000);
        driver.quit();

    }
}

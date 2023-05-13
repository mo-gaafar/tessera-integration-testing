import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class previewEvents {
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

        // preview events in live tab
        Thread.sleep(5000);
        // event 1 - online
        WebElement liveEvent1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"7%, hello\n" +
                "2023-05-22T17:48:00.000Z \n" +
                " 1/15\n" +
                "£0\"]"));
        liveEvent1.click();
        Thread.sleep(5000);

        WebElement previewLiveEvent1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"hello\n" +
                "Click to preview your event page.\"]"));
        previewLiveEvent1.click();
        Thread.sleep(6000);

        WebElement backLiveEvent1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
        backLiveEvent1.click();
        Thread.sleep(3000);
        // end of event 1


        // event 2 - venue (BUG)
        WebElement liveEvent2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"0%, trialVenue\n" +
                "2023-05-13T15:54:00.000Z \n" +
                " 0/20\n" +
                "£0\"]"));
        liveEvent2.click();
        Thread.sleep(5000);

        WebElement previewLiveEvent2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"trialVenue\n" +
                "Click to preview your event page.\"]"));
        previewLiveEvent2.click();
        Thread.sleep(6000);

        WebElement backLiveEvent2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
        backLiveEvent2.click();
        Thread.sleep(3000);
        // end of event 2


        // event 3 - to be announced (BUG)
        WebElement liveEvent3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"0%, eventTBA\n" +
                "2023-05-13T17:07:00.000Z \n" +
                " 0/5\n" +
                "£0\"]"));
        liveEvent3.click();
        Thread.sleep(5000);

        WebElement previewLiveEvent3 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"eventTBA\n" +
                "Click to preview your event page.\"]"));
        previewLiveEvent3.click();
        Thread.sleep(6000);

        WebElement backLiveEvent3 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
        backLiveEvent3.click();
        Thread.sleep(3000);
        // end of event 3

        // event 4 - just check title
        WebElement liveEvent4 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"0%, hsjs\n" +
                "2023-05-13T17:18:00.000Z \n" +
                " 0/20\n" +
                "£0\"]"));
        // end of event 4

        // move to tab 2 - Past
        Thread.sleep(3000);
        pastTab.click();

        // event 1 - venue (BUG)
        WebElement pastEvent1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"0%, roses are red\n" +
                "2023-05-13T05:33:00.000Z \n" +
                " 0/10\n" +
                "£0\"]"));
        String pastEvent1Text = pastEvent1.getAttribute("content-desc");
        pastEvent1.click();
        Thread.sleep(5000);

        WebElement previewPastEvent1 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"roses are red\n" +
                "Click to preview your event page.\"]"));
        previewPastEvent1.click();
        Thread.sleep(6000);

        WebElement backPastEvent1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
        backPastEvent1.click();
        Thread.sleep(3000);
        // end of event 1


        // move to tab 3 - draft
        Thread.sleep(3000);
        draftTab.click();
        Thread.sleep(3000);

        // event 2 - venue (BUG)
        WebElement draftEvent2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"0%, gibberish\n" +
                "2023-05-13T17:16:00.000Z \n" +
                " 0/0\n" +
                "£0\"]"));
        draftEvent2.click();
        Thread.sleep(5000);

        WebElement promoDraftEvent2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Promo Codes\n" +
                "Tab 2 of 2\"]"));
        promoDraftEvent2.click();
        Thread.sleep(6000);


        WebElement addPromoTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Add promocodes for your own event Or import them using CSV!\"]"));
        String addPromoTitleText = draftEvent2.getAttribute("content-desc");
        if(addPromoTitleText.equals("Add promocodes for your own event Or import them using CSV!"))
        {
            System.out.println("Event 2 - Add Promo Title Passed");
        }
        else
        {
            System.out.println("Event 2 - Add Promo Title Failed");
        }




        Thread.sleep(3000);
        driver.quit();

    }
}

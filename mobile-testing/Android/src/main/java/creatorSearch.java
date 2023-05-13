import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class creatorSearch {
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

        liveTab.click();
        Thread.sleep(3000);
        pastTab.click();
        Thread.sleep(3000);
        draftTab.click();
        Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]"));
        searchButton.click();
        Thread.sleep(3000);

        WebElement searchInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText"));
        searchInput.sendKeys("s");
        Thread.sleep(3000);

        WebElement russiaOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Russia\"]"));
        String russiaOptionText = russiaOption.getAttribute("content-desc");
        if(russiaOptionText.equals("Russia"))
        {
            System.out.println("Russia Passed");
        }
        else
        {
            System.out.println("Russia Failed");
        }

        russiaOption.click();
        Thread.sleep(3000);


        WebElement usaOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"USA\"]"));
        String usaOptionText = usaOption.getAttribute("content-desc");
        if(usaOptionText.equals("USA"))
        {
            System.out.println("USA Passed");
        }
        else
        {
            System.out.println("USA Failed");
        }

        usaOption.click();
        Thread.sleep(3000);

        WebElement cancelSearchBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]"));
        cancelSearchBtn.click();

        WebElement brazilOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Brazil\"]"));
        String brazilOptionText = brazilOption.getAttribute("content-desc");
        if(brazilOptionText.equals("Brazil"))
        {
            System.out.println("Brazil Passed");
        }
        else
        {
            System.out.println("Brazil Failed");
        }



        Thread.sleep(3000);
        driver.quit();

    }
}

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class checkoutExtraTix {
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
        passwordInput.sendKeys("rosa@Rehab1122");

        Thread.sleep(5000);
        // click the login button
        WebElement loginBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]"));
        loginBtn.click();

        Thread.sleep(7000);

        // click on freeNpaidEvent
        WebElement freeNpaidEvent = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"freeNpaidEvent\n" +
                "Online\n" +
                "14  MAY\"]"));

        freeNpaidEvent.click();
        Thread.sleep(3000);

        // click ticket
        WebElement ticketBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ticket\"]"));
        ticketBtn.click();
        Thread.sleep(3000);


        // check pricey text
        WebElement priceyOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"pricey:30\"]"));
        String priceyOptionText = priceyOption.getAttribute("content-desc");
        if(priceyOptionText.equals("pricey:30"))
        {
            System.out.println("Priced Ticket Button Text Passed");
        }
        else
        {
            System.out.println("Priced Ticket Button Text Failed");
        }

        WebElement pricedBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[2]"));
        pricedBtn.click();
        Thread.sleep(3000);

        // choose 7 tickets
        WebElement plusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);
        plusBtn.click();
        Thread.sleep(1500);

        // check and click checkout button
        WebElement checkoutBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CheckOut\"]"));
        checkoutBtn.click();
        Thread.sleep(3000);

        WebElement fnameInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        fnameInput.click();
        Thread.sleep(3000);
        fnameInput.sendKeys("myFName");
        Thread.sleep(5000);

        WebElement lnameInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        lnameInput.click();
        Thread.sleep(3000);
        lnameInput.sendKeys("myLName");
        Thread.sleep(5000);

        WebElement emailCheckoutInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        emailCheckoutInput.click();
        Thread.sleep(3000);
        emailCheckoutInput.sendKeys("rosa.rehab25@gmail.com");
        Thread.sleep(5000);

        WebElement finishCheckoutBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CheckOut\"]"));
        finishCheckoutBtn.click();
        Thread.sleep(5000);




        Thread.sleep(3000);
        driver.quit();

    }
}

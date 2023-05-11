import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class existentPromo {
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

        Thread.sleep(9000);

        // click on help me please
        WebElement helpmeEvent = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"help me please\n" +
                "Online\n" +
                "10  MAY\"]"));
        helpmeEvent.click();

        Thread.sleep(3000);

        // check event price
        WebElement price = driver.findElement(By.xpath("//android.view.View[@content-desc=\"12.9\"]"));
        String priceText = price.getAttribute("content-desc");
        if(priceText.equals("12.9"))
        {
            System.out.println("Event Price Text Passed");
        }
        else
        {
            System.out.println("Event Price Text  Failed");
        }

        // check & click ticket button
        WebElement ticketBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Ticket\"]"));
        String ticketBtnText = ticketBtn.getAttribute("content-desc");
        if(ticketBtnText.equals("Ticket"))
        {
            System.out.println("Ticket Button Text Passed");
        }
        else
        {
            System.out.println("Ticket Button Text  Failed");
        }

        ticketBtn.click();

        Thread.sleep(3000);

        // check free text
        WebElement priceBtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"jokes on you:12.9\"]"));
        String priceBtnText = priceBtn.getAttribute("content-desc");
        if(priceBtnText.equals("jokes on you:12.9"))
        {
            System.out.println("12.9 Button Text Passed");
        }
        else
        {
            System.out.println("12.9 Button Text Failed");
        }


        WebElement price12Btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[2]"));
        price12Btn.click();

        Thread.sleep(6000);

        // choose 1 ticket
        WebElement plusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
        plusBtn.click();
        Thread.sleep(1000);


        // check that 1 ticket is chosen
        WebElement addedTickets = driver.findElement(By.xpath("//android.view.View[@content-desc=\"1\"]"));
        String addedTicketsText = addedTickets.getAttribute("content-desc");
        if(addedTicketsText.equals("1"))
        {
            System.out.println("1 ticket Text Passed");
        }
        else
        {
            System.out.println("1 ticket Text  Failed");
        }

        // reduce tickets to 1
        WebElement minusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));

        WebElement promoCodeInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        promoCodeInput.click();
        promoCodeInput.sendKeys("QSKK");

        Thread.sleep(3000);

        // check and click checkout button
        WebElement checkoutBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CheckOut\"]"));
        String checkoutBtnText = checkoutBtn.getAttribute("content-desc");
        if(checkoutBtnText.equals("CheckOut"))
        {
            System.out.println("Checkout Button Text Passed");
        }
        else
        {
            System.out.println("Checkout Button Text  Failed");
        }

        checkoutBtn.click();
        Thread.sleep(3000);

        // enter First name
        WebElement fname = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]"));
        fname.click();
        Thread.sleep(3000);
        fname.sendKeys("rosa");

        // enter Last name
        WebElement lname = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]"));
        lname.click();
        Thread.sleep(3000);
        lname.sendKeys("rehab");

        // enter Email
        WebElement checkoutEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]"));
        checkoutEmail.click();
        Thread.sleep(3000);
        checkoutEmail.sendKeys("rosa.rehab25@gmail.com");

        Thread.sleep(5000);

        // click the button to finish checkout
        WebElement finishCheckout = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"CheckOut\"]"));
        String finishCheckoutText = finishCheckout.getAttribute("content-desc");
        if(finishCheckoutText.equals("CheckOut"))
        {
            System.out.println("Checkout Button Text Passed");
        }
        else
        {
            System.out.println("Checkout Button Text Failed");
        }

        finishCheckout.click();
        Thread.sleep(6000);

        // check return to landing
        WebElement landingLogo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[2]"));

        Thread.sleep(3000);
        driver.quit();

    }
}

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class paidEventVIP {
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

        // click on Anime North 2023 event in Khan el Khalili
        WebElement crossplatformEvent = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Cross Platform\n" +
                "My Venue\n" +
                "1  MAY\"]"));
        crossplatformEvent.click();

        Thread.sleep(3000);

        // check event page
        // check the event title
        WebElement crossplatformEventTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cross Platform\"]"));
        String crossplatformEventText = crossplatformEventTitle.getAttribute("content-desc");
        if(crossplatformEventText.equals("Cross Platform"))
        {
            System.out.println("Event Title Passed");
        }
        else
        {
            System.out.println("Event Title Failed");
        }

        // check the event start date
        WebElement crossplatformStart = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Monday, May 1, 2023\"]"));
        String crossplatformStartText = crossplatformStart.getAttribute("content-desc");
        if(crossplatformStartText.equals("Monday, May 1, 2023"))
        {
            System.out.println("Event Start Date Passed");
        }
        else
        {
            System.out.println("Event Start Date Failed");
        }

        // check the event end date
        WebElement crossplatformEnd = driver.findElement(By.xpath("//android.view.View[@content-desc=\" To Monday, May 1, 2023\"]"));
        String crossplatformEndText = crossplatformEnd.getAttribute("content-desc");
        if(crossplatformEndText.equals(" To Monday, May 1, 2023"))
        {
            System.out.println("Event End Date Passed");
        }
        else
        {
            System.out.println("Event End Date Failed");
        }

        // check event online/offline
        WebElement offline = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Offline\"]"));
        String offlineText = offline.getAttribute("content-desc");
        if(offlineText.equals("Offline"))
        {
            System.out.println("Event Offline Passed");
        }
        else
        {
            System.out.println("Event Offline Failed");
        }

        // check event location
        WebElement eventLocation = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Portland\"]"));
        String eventLocationText = eventLocation.getAttribute("content-desc");
        if(eventLocationText.equals("Portland"))
        {
            System.out.println("Event Location Passed");
        }
        else
        {
            System.out.println("Event Location Failed");
        }

        Thread.sleep(3000);

        // check refund policy title text
        WebElement refundTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Refund policy\"]"));
        String refundTitleText = refundTitle.getAttribute("content-desc");
        if(refundTitleText.equals("Refund policy"))
        {
            System.out.println("Refund Policy Title Passed");
        }
        else
        {
            System.out.println("Refund Policy Title  Failed");
        }

        // check refund policy text
        WebElement refundPolicy = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Tessera's fee is non-refundabe\"]"));
        String refundPolicyText = refundPolicy.getAttribute("content-desc");
        if(refundPolicyText.equals("Tessera's fee is non-refundabe"))
        {
            System.out.println("Refund Policy Text Passed");
        }
        else
        {
            System.out.println("Refund Policy Text  Failed");
        }

        Thread.sleep(3000);
        // check About text
        WebElement aboutTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"About\n" +
                "Join us for an evening of live music!\"]"));
        String aboutTitleText = aboutTitle.getAttribute("content-desc");
        if(aboutTitleText.equals("About\n" +
                "Join us for an evening of live music!"))
        {
            System.out.println("About Text Passed");
        }
        else
        {
            System.out.println("About Text  Failed");
        }

        // check organizer text
        WebElement organizer = driver.findElement(By.xpath("//android.view.View[@content-desc=\"organizers  Zeekoojohn\"]"));
        String organizerText = organizer.getAttribute("content-desc");
        if(organizerText.equals("organizers  Zeekoojohn"))
        {
            System.out.println("Organizer Text Passed");
        }
        else
        {
            System.out.println("Organizer Text  Failed");
        }

        // check event price
        WebElement price = driver.findElement(By.xpath("//android.view.View[@content-desc=\"20.0\"]"));
        String priceText = price.getAttribute("content-desc");
        if(priceText.equals("20.0"))
        {
            System.out.println("Event Price Text Passed");
        }
        else
        {
            System.out.println("Event Price Text  Failed");
        }

        // check event price
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

        // check regular text
        WebElement basicOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Regular:20\"]"));
        String basicOptionText = basicOption.getAttribute("content-desc");
        if(basicOptionText.equals("Regular:20"))
        {
            System.out.println("Regular Button Text Passed");
        }
        else
        {
            System.out.println("Regular Button Text  Failed");
        }

        // check VIP text
        WebElement vipOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"VIP:50\"]"));
        String vipOptionText = vipOption.getAttribute("content-desc");
        if(vipOptionText.equals("VIP:50"))
        {
            System.out.println("VIP Button Text Passed");
        }
        else
        {
            System.out.println("VIP Button Text Failed");
        }

        WebElement vipBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[2]"));
        vipBtn.click();

        Thread.sleep(6000);

        // choose 3 tickets
        WebElement plusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
        plusBtn.click();
        Thread.sleep(1000);
        plusBtn.click();
        Thread.sleep(1000);
        plusBtn.click();
        Thread.sleep(1000);


        // check that 3 tickets are chosen
        WebElement addedTickets = driver.findElement(By.xpath("//android.view.View[@content-desc=\"3\"]"));
        String addedTicketsText = addedTickets.getAttribute("content-desc");
        if(addedTicketsText.equals("3"))
        {
            System.out.println("3 tickets Text Passed");
        }
        else
        {
            System.out.println("3 tickets Text  Failed");
        }

        // reduce tickets to 2
        WebElement minusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[2]"));
        minusBtn.click();
        Thread.sleep(1000);


        // check that 1 ticket is chosen
        if(addedTicketsText.equals("2"))
        {
            System.out.println("2 tickets Text Passed");
        }
        else
        {
            System.out.println("2 tickets Text  Failed");
        }

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

        // check that 1 ticket is chosen
        WebElement checkoutTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Check Out Information\"]"));
        String checkoutTitleText = checkoutTitle.getAttribute("content-desc");
        if(checkoutTitleText.equals("Check Out Information"))
        {
            System.out.println("Checkout Page Title Text Passed");
        }
        else
        {
            System.out.println("Checkout Page Title Text  Failed");
        }

        // check my ticket info

        // check tier info
        WebElement tier = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Tier: VIP\"]"));
        String tierText = tier.getAttribute("content-desc");
        if(tierText.equals("Tier: VIP"))
        {
            System.out.println("Tier Text Passed");
        }
        else
        {
            System.out.println("Tier Text Failed");
        }

        // check no. of tickets
        WebElement numTickets = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Number of Ticket: 2\"]"));
        String numTicketsText = numTickets.getAttribute("content-desc");
        if(numTicketsText.equals("Number of Ticket: 2"))
        {
            System.out.println("No. of tickets Text Passed");
        }
        else
        {
            System.out.println("No. of tickets Text Failed");
        }

        // check price
        WebElement checkoutPrice = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Price: 50\"]"));
        String checkoutPriceText = checkoutPrice.getAttribute("content-desc");
        if(checkoutPriceText.equals("Price: 50"))
        {
            System.out.println("Checkout Price Text Passed");
        }
        else
        {
            System.out.println("Checkout Price Text Failed");
        }

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

        Thread.sleep(3000);
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

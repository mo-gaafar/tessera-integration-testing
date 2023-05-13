import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class nonexistentPromo {
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
        WebElement animeKhan = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Anime North 2023\n" +
                "Khan el Khalili \n" +
                "1  JUL\"]"));
        animeKhan.click();

        Thread.sleep(3000);

        // check event page
        // check the event title
        WebElement animeKhanTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Anime North 2023\"]"));
        String animeKhanTitleText = animeKhanTitle.getAttribute("content-desc");
        if(animeKhanTitleText.equals("Anime North 2023"))
        {
            System.out.println("Event Title Passed");
        }
        else
        {
            System.out.println("Event Title Failed");
        }

        // check the event start date
        WebElement animeKhanStart = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Saturday, Jul 1, 2023\"]"));
        String animeKhanStartText = animeKhanStart.getAttribute("content-desc");
        if(animeKhanStartText.equals("Saturday, Jul 1, 2023"))
        {
            System.out.println("Event Start Date Passed");
        }
        else
        {
            System.out.println("Event Start Date Failed");
        }

        // check the event end date
        WebElement animeKhanEnd = driver.findElement(By.xpath("//android.view.View[@content-desc=\" To Monday, Feb 19, 2024\"]"));
        String animeKhanEndText = animeKhanEnd.getAttribute("content-desc");
        if(animeKhanEndText.equals(" To Monday, Feb 19, 2024"))
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
        WebElement eventLocation = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Cairo\"]"));
        String eventLocationText = eventLocation.getAttribute("content-desc");
        if(eventLocationText.equals("Cairo"))
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
                "largest fan-run Japanese Animation convention\"]"));
        String aboutTitleText = aboutTitle.getAttribute("content-desc");
        if(aboutTitleText.equals("About\n" +
                "largest fan-run Japanese Animation convention"))
        {
            System.out.println("About Text Passed");
        }
        else
        {
            System.out.println("About Text  Failed");
        }

        // check organizer text
        WebElement organizer = driver.findElement(By.xpath("//android.view.View[@content-desc=\"NO KNOWN ORGANIZER\"]"));
        String organizerText = organizer.getAttribute("content-desc");
        if(organizerText.equals("NO KNOWN ORGANIZER"))
        {
            System.out.println("Organizer Text Passed");
        }
        else
        {
            System.out.println("Organizer Text  Failed");
        }

        // check event price
        WebElement price = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Free\"]"));
        String priceText = price.getAttribute("content-desc");
        if(priceText.equals("Free"))
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

        // check free text
        WebElement freeOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Free:Free\"]"));
        String freeOptionText = freeOption.getAttribute("content-desc");
        if(freeOptionText.equals("Free:Free"))
        {
            System.out.println("Free Button Text Passed");
        }
        else
        {
            System.out.println("Free Button Text  Failed");
        }

        // check VIP text
        WebElement vipOption = driver.findElement(By.xpath("//android.view.View[@content-desc=\"VIP:403.32\"]"));
        String vipOptionText = vipOption.getAttribute("content-desc");
        if(vipOptionText.equals("VIP:403.32"))
        {
            System.out.println("VIP Button Text Passed");
        }
        else
        {
            System.out.println("VIP Button Text Failed");
        }

        WebElement freeBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.RadioButton[2]"));
        freeBtn.click();

        Thread.sleep(6000);

        // choose 1 ticket
        WebElement plusBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]"));
        plusBtn.click();
        Thread.sleep(1000);


        // check that 3 tickets are chosen
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
        promoCodeInput.sendKeys("gibberish");

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

        //
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

        // exit checkout
        WebElement exitCheckout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
        exitCheckout.click();

        WebElement sureTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure?\"]"));
        String sureTitleText = sureTitle.getAttribute("content-desc");
        if(sureTitleText.equals("Are you sure?"))
        {
            System.out.println("Exit Checkout Page Title Text Passed");
        }
        else
        {
            System.out.println("Exit Checkout Page Title Text  Failed");
        }

        WebElement leavingTitle= driver.findElement(By.xpath("//android.view.View[@content-desc=\"Leaving check out?\"]"));
        String leavingTitleText = leavingTitle.getAttribute("content-desc");
        if(leavingTitleText.equals("Leaving check out?"))
        {
            System.out.println("Leaving Checkout Page Title Text Passed");
        }
        else
        {
            System.out.println("Leaving Checkout Page Title Text  Failed");
        }

        WebElement warningTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Are you sure you want to go back to the Event Page?   the items you selected might not be available later.\"]"));
        String warningTitleText = warningTitle.getAttribute("content-desc");
        if(warningTitleText.equals("Are you sure you want to go back to the Event Page?   the items you selected might not be available later."))
        {
            System.out.println("Are you sure? Text Passed");
        }
        else
        {
            System.out.println("Are you sure?  Text  Failed");
        }

        WebElement noBTN = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"No\"]"));
        WebElement yesBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Yes\"]"));
        yesBtn.click();

        // back to event page
        WebElement bookTicket = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Book a ticket to your newest adventure !\"]"));
        String bookTicketText = bookTicket.getAttribute("content-desc");
        if(bookTicketText.equals("Book a ticket to your newest adventure !"))
        {
            System.out.println("Event Page Redirect Passed");
        }
        else
        {
            System.out.println("Event Page Redirect Failed");
        }


        Thread.sleep(3000);
        driver.quit();

    }
}

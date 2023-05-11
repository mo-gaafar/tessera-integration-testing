import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class emptyEvents {
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
        Thread.sleep(3000);

        Thread.sleep(5000);
        // check title and subtitle text
        String title = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Let's get started!\"]")).getAttribute("content-desc");
        if(title.equals("Let's get started!"))
        {
            System.out.println("Title Passed");
        }
        else
        {
            System.out.println("Title Failed");
        }

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

        Thread.sleep(3000);

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


        // check that the password input exists
        WebElement passwordInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        // enter valid password
        passwordInput.click();
        passwordInput.sendKeys("rosa@Rehab1122");

        Thread.sleep(3000);

        // click the login button with password
        WebElement loginBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]"));
        loginBtn.click();


        Thread.sleep(10000);
        // first event in page
        WebElement randomEvent = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Cross body\n" +
                "My Venue\n" +
                "1  MAY\"]"));
        String randomEventText = randomEvent.getAttribute("content-desc");
        if(randomEventText.equals("Cross body\n" +
                "My Venue\n" +
                "1  MAY"))
        {
            System.out.println("Empty Event - Text Passed");
        }
        else
        {
            System.out.println("Empty Event - Text Failed");
        }

        randomEvent.click();

        System.out.println("Empty Event");


        Thread.sleep(3000);
        driver.quit();

    }
}

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class emailRequiredSignin {
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
        String subtitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign up or log in to see what's happening near you.\"]")).getAttribute("content-desc");
        if(subtitle.equals("Sign up or log in to see what's happening near you."))
        {
            System.out.println("Subtitle Passed");
        }
        else
        {
            System.out.println("Subtitle Failed");
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
        // move on to login & signup
        // check Title text

        Thread.sleep(3000);
        WebElement signupTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Log In or Sign Up\"]"));
        String signupTitleText = signupTitle.getAttribute("content-desc");
        if(signupTitleText.equals("Log In or Sign Up"))
        {
            System.out.println("Signup Title Passed");
        }
        else
        {
            System.out.println("Signup Title Failed");
        }
        // check Email block
        WebElement emailTitle = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Email\"]"));
        String emailTitleText = emailTitle.getAttribute("content-desc");
        if(emailTitleText.equals("Email"))
        {
            System.out.println("Email Title Passed");
        }
        else
        {
            System.out.println("Email Title Failed");
        }

        // email is required
        WebElement nextButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
        nextButton.click();
        WebElement emailAlert = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Email is required.\"]"));
        String emailAlertText = emailAlert.getAttribute("content-desc");
        if(emailAlertText.equals("Email is required."))
        {
            System.out.println("Email Alert Passed");
        }
        else
        {
            System.out.println("Email Alert Failed");
        }


        Thread.sleep(3000);
        driver.quit();

    }
}

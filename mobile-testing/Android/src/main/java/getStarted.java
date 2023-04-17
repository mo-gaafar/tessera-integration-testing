import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class getStarted {
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
        // check continue facebook
        WebElement continueFb = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue with Facebook\"]"));
        String continueFbText = continueFb.getAttribute("content-desc");
        if(continueFbText.equals("Continue with Facebook"))
        {
            System.out.println("Continue Facebook Passed");
        }
        else
        {
            System.out.println("Continue Facebook Failed");
        }
        // check continue google
        WebElement continueGoogle = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue with Google\"]"));
        String continueGoogleText = continueGoogle.getAttribute("content-desc");
        if(continueGoogleText.equals("Continue with Google"))
        {
            System.out.println("Continue Google Passed");
        }
        else
        {
            System.out.println("Continue Google Failed");
        }


//        allow_button.click();
//        driver.findElement(By.id("com.android.calculator2:id/op_add")).click(); //plus button
//        WebElement three = driver.findElement(By.id("com.android.calculator2:id/digit_3"));
//        three.click();
//        driver.findElement(By.id("com.android.calculator2:id/eq")).click(); //equal button
//        Thread.sleep(3000);
//        String result = driver.findElement(By.id("com.android.calculator2:id/result")).getText(); //result element
//        if(result.equals("10"))
//        {
//            System.out.println("Test Passed");
//
//        }
//        else
//        {
//            System.out.println("Test Failed");
//        }

        Thread.sleep(3000);
        driver.quit();

    }
}

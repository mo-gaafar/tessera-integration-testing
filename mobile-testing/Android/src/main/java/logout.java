import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class logout {
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

        // check that the change button exists
        WebElement changeBtn = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Change\"]"));
        String changeBtnText = changeBtn.getAttribute("content-desc");
        if(changeBtnText.equals("Change"))
        {
            System.out.println("Change Button Passed");
        }
        else
        {
            System.out.println("Change Button Failed");
        }

        // check that the password input exists
        WebElement passwordInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));

        // check that the Forgot Password exists
        WebElement forgotPassword = driver.findElement(By.xpath("//android.view.View[@content-desc=\"I forgot my password\"]"));
        String forgotPasswordText = forgotPassword.getAttribute("content-desc");
        if(forgotPasswordText.equals("I forgot my password"))
        {
            System.out.println("Forgot Password Passed");
        }
        else
        {
            System.out.println("Forgot Password Failed");
        }

        // enter valid password
        passwordInput.click();
        passwordInput.sendKeys("rosa@Rehab1122");
        Thread.sleep(3000);

        // click the login button with password
        WebElement loginBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Log in\"]"));
        loginBtn.click();

        // confirm redirect to landing page
        Thread.sleep(6000);
        WebElement tesseraLogo = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.widget.ImageView[2]"));
        System.out.println("Successful Login Logo Exists");

        // click on logout
        WebElement logoutBtn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
        logoutBtn.click();

        Thread.sleep(5000);

        // check that Tessera logo exists in get started page
        WebElement logOutCheck = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign in with the same email addrerss you used to get your tickets.\"]"));



        Thread.sleep(3000);
        driver.quit();

    }
}

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class password1Number {
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
        // type an email
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText"));
        emailInput.click();
        emailInput.sendKeys("jimothy1jimbo@gmail.com");
        // click next
        WebElement nextButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Next\"]"));
        nextButton.click();

        // move to signup 2
        Thread.sleep(3000);
        // check email title in signup 2
        WebElement emailTitle2 = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Email\"]"));
        String emailTitle2Text = emailTitle2.getAttribute("content-desc");
        if(emailTitle2Text.equals("Email"))
        {
            System.out.println("Email Title Passed");
        }
        else
        {
            System.out.println("Email Title Failed");
        }
        // Confirm email Empty
        WebElement confirmEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));

        // First Name Empty
        WebElement fName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));

        // Last Name Empty
        WebElement lName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));

        // Password Strength Indicator default
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]"));
        // num characters must be 8
        WebElement passwordStrengthIndicator = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Password must have at least 8 characters.\"]"));
        String passwordStrengthIndicatorText = passwordStrengthIndicator.getAttribute("content-desc");
        if(passwordStrengthIndicatorText.equals("Password must have at least 8 characters."))
        {
            System.out.println("Password Strength Indicator Passed");
        }
        else
        {
            System.out.println("Password Strength Indicator Failed");
        }
        //password less than 8 characters

        password.click();
        password.sendKeys("helloSir@");


        // click Sign Up when all fields are empty
        Thread.sleep(5000);
        WebElement signupBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]"));
        signupBtn.click();

        Thread.sleep(3000);

        // alerts for empty fields

        // re enter email
        WebElement emailAlert = driver.findElement(By.xpath("//android.view.View[@content-desc=\"please re enter your email to confirm it\"]"));
        String emailAlertText = emailAlert.getAttribute("content-desc");
        if(emailAlertText.equals("please re enter your email to confirm it"))
        {
            System.out.println("Email Alert Passed");
        }
        else
        {
            System.out.println("Email Alert Failed");
        }

        // First name required
        WebElement fNameAlert = driver.findElement(By.xpath("//android.view.View[@content-desc=\"First name is required\"]"));
        String fNameAlertText = fNameAlert.getAttribute("content-desc");
        if(fNameAlertText.equals("First name is required"))
        {
            System.out.println("First Name Alert Passed");
        }
        else
        {
            System.out.println("First Name Alert Failed");
        }

        // Last name required
        WebElement lNameAlert = driver.findElement(By.xpath("//android.view.View[@content-desc=\"surname is required\"]"));
        String lNameAlertText = lNameAlert.getAttribute("content-desc");
        if(lNameAlertText.equals("surname is required"))
        {
            System.out.println("Last Name Alert Passed");
        }
        else
        {
            System.out.println("Last Name Alert Failed");
        }

        // Password minimum 1 number
        Thread.sleep(3000);
        WebElement passwordAlert = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Must contains minimum of 1 number.\"]"));
        String passwordAlertText = passwordAlert.getAttribute("content-desc");
        if(passwordAlertText.equals("Must contains minimum of 1 number."))
        {
            System.out.println("Password Alert Passed");
        }
        else
        {
            System.out.println("Password Alert Failed");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}



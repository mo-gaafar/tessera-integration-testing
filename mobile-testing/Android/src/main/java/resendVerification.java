import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class resendVerification {
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
        emailInput.sendKeys("staan1ey.huds0n2@gmail.com");
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
        // Confirm email
        WebElement confirmEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
        confirmEmail.click();
        confirmEmail.sendKeys("staan1ey.huds0n2@gmail.com");

        // First Name
        WebElement fName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
        fName.click();
        fName.sendKeys("Stanley");

        // Last Name
        WebElement lName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
        lName.click();
        lName.sendKeys("Hudson");

        // Password
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

        password.click();
        password.sendKeys("cr0ssw0rd@LIFE");
        Thread.sleep(3000);

        // password strength changed
        if(passwordStrengthIndicatorText.equals("Your Password is very strong."))
        {
            System.out.println("Password Strength Indicator Passed");
        }
        else
        {
            System.out.println("Password Strength Indicator Failed");
        }

        // click Sign Up
        Thread.sleep(3000);
        WebElement signupBtn = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]"));
        signupBtn.click();

        // move to email verification

        Thread.sleep(3000);
        WebElement verificationCommand = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Check your email to verify your account.\"]"));
        String verificationCommandText = verificationCommand.getAttribute("content-desc");
        if(verificationCommandText.equals("Check your email to verify your account."))
        {
            System.out.println("Email Verification Passed");
        }
        else
        {
            System.out.println("Email Verification Failed");
        }

        // check we sent a link to the correct email
        WebElement sentLink = driver.findElement(By.xpath("//android.view.View[@content-desc=\"We sent a link to staan1ey.huds0n2@gmail.com to verify your account.\"]"));
        String sentLinkText = sentLink.getAttribute("content-desc");
        if(sentLinkText.equals("We sent a link to staan1ey.huds0n2@gmail.com to verify your account."))
        {
            System.out.println("Email Verification Passed");
        }
        else
        {
            System.out.println("Email Verification Indicator Failed");
        }

        // check change email exists and correct text
        WebElement changeEmail = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Change email\"]"));
        String changeEmailText = changeEmail.getAttribute("content-desc");
        if(changeEmailText.equals("Change email"))
        {
            System.out.println("Change Email Text Passed");
        }
        else
        {
            System.out.println("Change Email Text Failed");
        }

        // check received email exists and correct text
        WebElement receivedEmail = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Recieved Email\"]"));
        String receivedEmailText = receivedEmail.getAttribute("content-desc");
        if(receivedEmailText.equals("Recieved Email"))
        {
            System.out.println("Received Email Text Passed");
        }
        else
        {
            System.out.println("Received Email Text Failed");
        }

        // check resend email exists and correct text
        WebElement resendVerification = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Resend verification email\"]"));
        String resendVerificationText = resendVerification.getAttribute("content-desc");
        if(resendVerificationText.equals("Resend verification email"))
        {
            System.out.println("Resend Verification Text Passed");
        }
        else
        {
            System.out.println("Resend Verification Text Failed");
        }

        resendVerification.click();

        // check that it redirects to login and password input exists
        Thread.sleep(1000);
        WebElement emailSent = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Verification email sent\"]"));
        String emailSentText = emailSent.getAttribute("content-desc");
        if(emailSentText.equals("Verification email sent"))
        {
            System.out.println("Verification Email Sent Passed");
        }
        else
        {
            System.out.println("Verification Email Sent Failed");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}

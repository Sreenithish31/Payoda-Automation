package AppiumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

public class Login {
	private WebDriver driver;
    private WebDriverWait wait;
    private By usernameLocator = (AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
    private By passwordLocator = (AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
    private By loginButtonLocator = (AppiumBy.accessibilityId("Sign in"));
    private By SplashScreenLocator = (AppiumBy.accessibilityId("Begin your journey"));
    private By AdminloginLocator = AppiumBy.accessibilityId("Admin");
    
    private String username = "lakumvishalbhai.r@payoda.com";
    protected String password = "Tileman@1234";

    
    protected Login(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    
    // Splash Screen 
    protected void Beginyourjourney() {
        WebElement Beginyourjourney = wait.until(ExpectedConditions.elementToBeClickable(SplashScreenLocator));
        Beginyourjourney.click();
    }
    
    // Splash Screen 
    protected void Adminlogin() {
        WebElement Adminlogin = wait.until(ExpectedConditions.elementToBeClickable(AdminloginLocator));
        Adminlogin.click();
    }

    protected void enterUsername() {
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(usernameLocator));
        usernameField.click();
        usernameField.sendKeys(username);
    }

    protected void enterPassword() {
        WebElement passwordField = wait.until(ExpectedConditions.presenceOfElementLocated(passwordLocator));
        passwordField.click();
        passwordField.sendKeys(password);
    }

    protected void clickLogin() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(loginButtonLocator));
        loginButton.click();
    }

}
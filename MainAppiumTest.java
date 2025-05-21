package AppiumDemo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class MainAppiumTest {

    public static void main(String[] args) throws MalformedURLException, URISyntaxException, InterruptedException {
        // Setup Appium Options
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sreeemulator");
        options.setApp("C:\\Users\\sreenithish.r\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\app-dev-release.apk");

        // Launch Appium Driver
        WebDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // --- Login ---
        Login login = new Login(driver);
        login.Beginyourjourney();
        login.Adminlogin();
        login.enterUsername();
        login.enterPassword();
        login.clickLogin();

        // --- Handle Popups ---
        PopupHandler popup = new PopupHandler(driver, wait);
        popup.handleInitialPopups();
        popup.handleOptionalPermissionPopup();
        //popup.applyAllFilters();

       // --- Create Package ---
        CreatePackagePage createPackage = new CreatePackagePage(driver);
        createPackage.Createpackagebutton();
        createPackage.enterPackagedetails();
        createPackage.addAddress();
        
        // Optional delay before closing
        Thread.sleep(3000);

        // Quit driver
        driver.quit();
    }
}

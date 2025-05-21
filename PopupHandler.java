package AppiumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;

public class PopupHandler {
	private WebDriver driver;
    private WebDriverWait wait;

    public PopupHandler(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // Clicks "Let’s Go" button
    public void handleInitialPopups() {
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button"))).click();
        if (driver.findElements(AppiumBy.accessibilityId("Let’s Go")).size() > 0) {
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Let’s Go"))).click();
        } else {
            System.out.println("'Let’s Go' button not found. Proceeding with next step.");
        }
    }

    // Handles optional one-time permission popup (if present)
    public void handleOptionalPermissionPopup() {
        if (driver.findElements(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).size() > 0) {
            wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button"))).click();
        } else {
            System.out.println("Optional permission popup not found. Skipping to next step.");
        }
    }


    // Clicks on image icon, "All", and then "Apply" to filter
   /* public void applyAllFilters() {
        wait.until(ExpectedConditions.presenceOfElementLocated(
            AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("All"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Apply"))).click();
    }*/
}

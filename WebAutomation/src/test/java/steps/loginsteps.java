package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	 WebDriver driver;
	 
	@Given("User should navigate to the application")
	public void usershouldNavigate() {

		System.setProperty("webdriver.Edge.driver",
				"C:\\Users\\sreenithish.r\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		EdgeOptions options = new EdgeOptions();
		// Location disable in the Automated browser
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.geolocation", 2); // 1 = Allow, 2 = Block
		options.setExperimentalOption("prefs", prefs);
		driver = new EdgeDriver(options);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://a2bdeliverwebqa.z5.web.core.windows.net/");
		driver.manage().window().maximize();
	}

	@Given("User enter the username as lakumvishalbhai.r@payoda.com")
	public void userEnterTheUsernameAsLakumvishalbhaiRPayodaCom() {
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("lakumvishalbhai.r@payoda.com");
	}

	@Given("User enter the password as Tileman@1234")
	public void userEnterThePasswordAsTileman() {
		WebElement pass = driver.findElement(By.id("password"));
		pass.click();
		pass.sendKeys("Tileman@1234");
	}

	@When("User clicks on login button")
	public void userClicksOnLoginButton() {
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		System.out.println("You have successfully logged in");
	}

	/*
	 * @Given("User should fill details for creating package") public void
	 * userShouldFillDetailsForCreatingPackage() {
	 * 
	 * 
	 * 
	 * }
	 */

}

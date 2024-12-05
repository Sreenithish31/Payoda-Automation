package SreeMobileAutomation;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

@Test
	public class Tilleman extends Basetest {

		public void TestingA2B() throws MalformedURLException, URISyntaxException, InterruptedException {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			Thread.sleep(5000);
			//wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.accessibilityId("Begin your journey")), "text", "Begin your journey"));
			driver.findElement(AppiumBy.accessibilityId("Begin your journey")).click();
			Thread.sleep(3000);
			
			// Admin Flow
			driver.findElement(AppiumBy.accessibilityId("Admin")).click();
			Thread.sleep(3000);
			WebElement Login = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
			Login.click();
			Login.sendKeys("Lakumvishalbhai.r@payoda.com");
			WebElement Pass =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
			Pass.click();
			Pass.sendKeys("Tilleman@321");
		

			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Sign in"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_button"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Let’s Go"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("All"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Apply"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Tab 3 of 5"))).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"))).sendKeys("Package 01");

			WebElement Description = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
			Description.click();
			Description.sendKeys("This is the package created for automation");
			WebElement Height = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
			Height.click();
			Height.sendKeys("12");
			WebElement width = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")));
			width.click();
			width.sendKeys("11.5");
			WebElement depth = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")));
			depth.click();
			depth.sendKeys("15");
			
			//wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Continue"))).click();
		//	((JavascriptExecutor) driver).executeScript("mobile: scroll", Map.of("direction", "down"));
			//WebElement weight = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Weight\"));"));	
			driver.hideKeyboard();
			WebElement weight = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(5)")));
			weight.click();
			weight.sendKeys("50");	
			driver.hideKeyboard();
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(20)"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("30, Saturday, November 30, 2024"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("OK"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Continue"))).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"))).click();
			WebElement Name = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
			Name.click();
			Name.sendKeys("Sreenithish");
			
			WebElement Phone = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")));
			Phone.click();
			Phone.sendKeys("9237964134");
			
			WebElement Address = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
			Address.click();
			Address.sendKeys("121 First St");
			
			driver.hideKeyboard();
			WebElement State = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)")));
			State.click();
			
			
		//	WebElement Search = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")));
			//Search.click();
			//Search.sendKeys("mt");

			//wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Alabama"))).click();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Akron"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Add address"))).click();



			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"))).click();
			WebElement Fullname= wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
			Fullname.click();
			Fullname.sendKeys("Ashok");
			
			WebElement Deliveryphone= wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")));
			Deliveryphone.click();
			Deliveryphone.sendKeys("9876543210");
			
			WebElement DeliveryAddress = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")));
			DeliveryAddress.click();
			DeliveryAddress.sendKeys("200 N Broadway St");
			
			driver.hideKeyboard();
			
			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Alaska"))).click();
			driver.hideKeyboard();

			wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Akiak"))).click();

			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Add address"))).click();

			wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Create request"))).click();

			
			
			
			//wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.accessibilityId("Sign in")), "text", "Sign in"));
			/*driver.findElement(AppiumBy.accessibilityId("Continue with number")).click();

			driver.findElement(By.xpath("//android.widget.EditText")).click();
			driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("9629641553");
			driver.findElement(AppiumBy.accessibilityId("Get OTP")).click();

			//wait.until(ExpectedConditions.attributeContains(driver.findElement(AppiumBy.accessibilityId("Verify your number")), "text", "Verify your number"));
			driver.findElement(By.xpath(
					"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView"))
					.click();
			driver.findElement(AppiumBy.accessibilityId("Get OTP")).click();
			Thread.sleep(3000);
			// driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]")).sendKeys(Keys.NUMPAD1);
			WebElement source = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")"));
					//"//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]"));
					source.clear();		
					source.click();
					source.sendKeys("123456");
				
					//((JavascriptExecutor) driver).executeScript("mobile: click",
					  //ImmutableMap.of("elementId", ((RemoteWebElement) source).getId(), "endX", 110, "endY", 724));
			
			//driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")"))
				//	.sendKeys("123456");
			// Thread.sleep(5000);
			driver.findElement(AppiumBy.accessibilityId("Validate")).click();

			/*
			 * Set<String> contexts = driver.getContextHandles(); for (String contextName :
			 * contexts) { System.out.println(contextName); }
			 */

			// Login using Gmail
			/*
			 * driver.findElement(By.xpath(
			 * "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]"
			 * )).click(); Thread.sleep(8000);
			 * driver.findElement(By.className("android.widget.EditText")).sendKeys(
			 * "a2bdelivertesting@gmail.com");
			 * driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click()
			 * ; Thread.sleep(3000);
			 * driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys(
			 * "A2B@delivertest");
			 * driver.findElement(By.xpath("//android.widget.Button[@text='Next']")).click()
			 * ;
			 */

		}

	}

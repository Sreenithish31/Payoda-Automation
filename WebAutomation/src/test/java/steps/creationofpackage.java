package steps;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class creationofpackage {
	
	 WebDriver driver;
	
	@Given("User should click on the create new button")
	public void userShouldClickOnTheCreateNewButton() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		Random random = new Random();
		int randomNumber = random.nextInt(1000);

		String packageName = " Package " + randomNumber;
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create New']"))).click();

		// Package Name
		WebElement pack = wait.until(ExpectedConditions.elementToBeClickable(By.name("packageName")));
		pack.click();
		pack.sendKeys(packageName);

		// Package Description
		WebElement descrip = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@placeholder='Enter short description here ']")));
		descrip.click();
		descrip.sendKeys("This package is created for testing Automation Scripts");

		// Height of the package
		WebElement height = wait.until(ExpectedConditions.elementToBeClickable(By.name("height")));
		height.click();
		height.sendKeys("11");

		// Width of the package
		WebElement width = wait.until(ExpectedConditions.elementToBeClickable(By.name("width")));
		width.click();
		width.sendKeys("10");

		// Depth of the package
		WebElement depth = wait.until(ExpectedConditions.elementToBeClickable(By.name("depth")));
		depth.click();
		depth.sendKeys("12");

		// Weight of the package
		WebElement weight = wait.until(ExpectedConditions.elementToBeClickable(By.name("weight")));
		weight.click();
		weight.sendKeys("5");

		// Package Expiry date
		wait.until(ExpectedConditions.elementToBeClickable(By.name("expiryDate"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.name("expiryDate"))).sendKeys("12/31/2024");

		// Pickup Address
		// Full Name
		WebElement fullname = wait.until(ExpectedConditions.elementToBeClickable(By.name("pickupFullName")));
		fullname.click();
		fullname.sendKeys("Sree");

		// Phone Number
		WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.name("pickupPhoneNumber")));
		phone.click();
		phone.sendKeys("9629641553");

		// Address
		WebElement addr = wait.until(ExpectedConditions.elementToBeClickable(By.name("pickupAddress")));
		addr.click();
		addr.sendKeys("Tidel Park");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-component-select-pickupState"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search state\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search state\"]")))
				.sendKeys("mt");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()='Montana']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"mui-component-select-pickupCity\"]")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search City\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search City\"]")))
				.sendKeys("Havre");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()=\"Havre\"]"))).click();

		// Delivery Address
		// Full Name
		WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.name("deliveryFullName")));
		name.click();
		name.sendKeys("Nithish");

		// Phone Number
		WebElement number = wait.until(ExpectedConditions.elementToBeClickable(By.name("deliveryPhoneNumber")));
		number.click();
		number.sendKeys("9894931986");

		// Address
		WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.name("deliveryAddress")));
		address.click();
		address.sendKeys("Pattanam");

		wait.until(ExpectedConditions.elementToBeClickable(By.id("mui-component-select-deliveryState"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search state\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search state\"]")))
				.sendKeys("mt");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()=\"Montana\"]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mui-component-select-deliveryCity']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search City\"]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Search City\"]")))
				.sendKeys("gre");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()=\"Great Falls\"]"))).click();

		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='mui-component-select-deliveryZipcode']")))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[text()=\"59401\"]"))).click();

		// Special Instruction
		WebElement instruction = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//textarea[@placeholder=\"Enter special instructions here\"]")));
		instruction.click();
		instruction.sendKeys("This a package created by automation");

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Package']"))).click();
	}

}

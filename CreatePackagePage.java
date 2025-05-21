package AppiumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class CreatePackagePage {
    private WebDriver driver;
    private By CreatepackagebuttonLocator = AppiumBy.accessibilityId("Tab 3 of 5");
    private By packageNameLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
    private By pacakgeDescriptionLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private By heightLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private By widthLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private By depthLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private By weightLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)");
    private By expirydateLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(5)");
    private By dateselectorLocator = AppiumBy.accessibilityId("31, Saturday, May 31, 2025");
    private By continueButtonLocator = AppiumBy.accessibilityId("Continue");
    private By addPickupAddressLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)");
    private By FullnameLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)");
    private By PhonenumberLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private By stateLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)");
    private By stateselectorLocator = AppiumBy.accessibilityId("Alabama");
    private By cityLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(13)");
    private By cityselectorLocator = AppiumBy.accessibilityId("Akron");
    private By addressLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private By addAddressLocator = AppiumBy.accessibilityId("Add address");
    private By addDeliveryAddressLocator = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.CheckBox\")");
    
    
    private String packageName = "Test Package 001";
    private String pacakgeDescription = "This package is created for Automation Testing";
    private String height = "15";
    private String width = "5.5";
    private String depth = "1.5";
    private String weight = "50";
    private String expirydate = "50";
    private String Fullname = "Sreenithish";
    private String phonenumber = "9876543212";
    private String address = "121 First St";
    
    
    public CreatePackagePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void Createpackagebutton() {
        WebElement Createpackagebutton = driver.findElement(CreatepackagebuttonLocator);
        Createpackagebutton.click();
    }
    
    protected void enterPackagedetails() {
		driver.findElement(packageNameLocator).click();
        driver.findElement(packageNameLocator).sendKeys(packageName);
		
		driver.findElement(pacakgeDescriptionLocator).click();
		driver.findElement(pacakgeDescriptionLocator).sendKeys(pacakgeDescription);

		driver.findElement(heightLocator).click();
		driver.findElement(heightLocator).sendKeys(height);

		driver.findElement(widthLocator).click();
		driver.findElement(widthLocator).sendKeys(width);
		
		driver.findElement(depthLocator).click();
		driver.findElement(depthLocator).sendKeys(depth);
		
		driver.findElement(weightLocator).click();
		driver.findElement(weightLocator).sendKeys(weight);
		
		driver.findElement(expirydateLocator).click();
		driver.findElement(expirydateLocator).sendKeys(expirydate);
		
		driver.findElement(dateselectorLocator).click();
		
		driver.findElement(continueButtonLocator).click();
    }
    
    //Pickup and Delivery Location
    //Pickup Location 
    public void addAddress() {
    	
    	//Pickup Address
        driver.findElement(addPickupAddressLocator).click();
      
		driver.findElement(FullnameLocator).click();
        driver.findElement(FullnameLocator).sendKeys(Fullname);
   
		driver.findElement(PhonenumberLocator).click();
        driver.findElement(PhonenumberLocator).sendKeys(phonenumber);
        
        driver.findElement(addressLocator).click();
        driver.findElement(addressLocator).sendKeys(address);
	
		driver.findElement(stateLocator).click();
    
        driver.findElement(stateselectorLocator).click();
        
		driver.findElement(cityLocator).click();
        
		driver.findElement(cityselectorLocator).click();
		
		driver.findElement(addAddressLocator).click();
		
		driver.findElement(addDeliveryAddressLocator).click();
		
		//Delivery Address
		driver.findElement(addDeliveryAddressLocator).click();
		
		driver.findElement(addAddressLocator).click();
		
    }	
}
package SreeMobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basetest {

	public  AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException
	{
		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\sreenithish.r\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				   .withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setChromedriverExecutable("C:\\Users\\sreenithish.r\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		options.setDeviceName("Sreeemulator");
		options.setApp("C:\\Users\\sreenithish.r\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\1111.apk");
		
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}
}

package testngprogram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {

	//Making the ChromeDriver(OR) object a Global to make the object access for the every method
	ChromeDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		//Open the chrome browser
		driver = new ChromeDriver();
		
		//Maximize the Chrome Browser
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://facebook.com/");
		
	}
	
	@Test
	public void verifyTheTitle() {
		//To Verify the Title of the Fb Page
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
		
	}
	
}

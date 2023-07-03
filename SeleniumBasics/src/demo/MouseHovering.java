package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHovering {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://ebay.com");
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, new File("D:\\Selenium Screenshot\\Screen1.jpeg"));
		
		//Hover over to Collectibles and Art
	WebElement collectibles =	driver.findElement(By.linkText("Collectibles and Art"));
	Actions actions = new Actions(driver);
	actions.moveToElement(collectibles).build().perform();
	
	//Click on the Antiques from the Sub-Menu of the Collectibles and Art
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Art")));
	driver.findElement(By.linkText("Art")).click();
	
	File sss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sss, new File("D:\\Selenium Screenshot\\Screen2.png"));
	
	}
}
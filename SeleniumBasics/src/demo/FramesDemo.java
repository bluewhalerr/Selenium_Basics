package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
			//open the browser
			ChromeDriver driver = new ChromeDriver();
			
			//Maximize the browser window
			driver.manage().window().maximize();
			
			//Navigate to the application
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			//To get into the frame
			driver.switchTo().frame("classFrame");
			
			//To click on the Depricated WebElement
			driver.findElement(By.linkText("DEPRECATED")).click();
			
		}
}

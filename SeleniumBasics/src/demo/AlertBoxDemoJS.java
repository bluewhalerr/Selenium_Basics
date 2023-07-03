package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemoJS {

		public static void main(String[] args) throws InterruptedException {
			//To open the chrome browser
			System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Navigate to the application
			driver.get("https://www.onlinesbi.sbi/");
		
			//Click on the login button
			driver.findElement(By.xpath("//span[contains(@class,'classicTxt')]")).click();
			
			driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
			
			driver.findElement(By.id("Button2")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().alert().accept();
		}

}

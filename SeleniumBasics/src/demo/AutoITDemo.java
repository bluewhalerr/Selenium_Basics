package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//open the browser
		System.setProperty("webdriver.chrome.driver","resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to the application
		driver.get("https://www.file.io/");
		
		Thread.sleep(2000);
		//Click on the Upload Button
		driver.findElement(By.xpath("//label[contains(@for,'upload-button')]")).click();
		
		Thread.sleep(2000);
		//Hand over the control to the AUTO IT to locate the file from the local machine
		Runtime.getRuntime().exec("resources//Upload.exe");
		
		
	}

}

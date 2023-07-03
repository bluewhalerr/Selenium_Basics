package demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class LocatorDemo {

	public static void main(String[] args) {
		
			//(1)open the browser
			ChromeDriver driver = new ChromeDriver ();
			
			//(2) Navigate to the website FB
			driver.get("https://facebook.com/");
			//(3)Enter the invalid username in FB Username Text Box
			driver.findElement(By.id("email")).sendKeys("dds@gmail.com");

			//(4)Enter the invalid username in FB Username Text Box
			driver.findElement(By.id("pass")).sendKeys("12345");
			//(5)Click on the login button
			driver.findElement(By.name("login")).click();
			
			//(6)Verify the error msg
				
				String expectedErrormsg = "Find your account and log in.";
				String actualErrormsg = driver.findElement(By.cssSelector("#email_container > div._9ay7 > a")).getText();
		
				if ( expectedErrormsg.equals(actualErrormsg)){
					System.out.println("Tes Case Passed");
				}
				else{
				System.out.println("Test Case Failed");
				}
			//close browser()
			
			driver.quit();
	}

}

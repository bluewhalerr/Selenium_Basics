package demo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class VerifyTitleOfA_Webpage {

	public static void main(String[] args) {
		//(1)open the browser
		ChromeDriver driver = new ChromeDriver ();
		
		//(2) Navigate to the website FB
		driver.get("https://facebook.com/");
		//(3)Verify the title of the webpage FB
		String expectedTitle = "Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle) ) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		//(4)Close the browser
		driver.close();
		
	}
}

package demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExpliocitWaitDemo {

public static void main(String[] args) {
	//1) Open the browser
	System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//2) Maximize the window	
	driver.manage().window().maximize();
	//3)Navigate to the application using get method
	driver.get("https://whitecircleschool.com/explicit-wait-demo1/");
	//4)Click on Start Button
	driver.findElement(By.id("start")).click();
	//5)Verifying the Text
	String expectedText = "Hello World!";
	//6)Explicit Wait
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
	
	String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
	if (expectedText.equals(actualText)) {
		System.out.println("Test Case Passed");
	}
	else {
		System.out.println("Test Case Failed");
	}
	driver.quit();
}

}

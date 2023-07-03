package demo;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class VerifyRadioBtnStatus {
	public static void main(String[] args) throws InterruptedException {
		
		//1)Open the browser
	  System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		
		//2)Maximize the browser
		driver.manage().window().maximize();
		
		//3)Navigate to FB
		driver.get("https://facebook.com/");
		
		//4)To verify the radio Btn Status
		
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@class,'_8esa')])[2]")));
		
		boolean maleRadioBtn = driver.findElement(By.xpath("(//input[contains(@class,'_8esa')])[2]")).isSelected();
		
		if (!maleRadioBtn) {
			System.out.println("Radio Btn is not Selected By Default");
		}
		else {
			System.out.println("Radio Btn is Seleced By Default");
		}
}
}
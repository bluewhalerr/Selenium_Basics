package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderDem {

	public static void main(String[] args) {

		// To close the push notification / pop up which appears on the top of the
		// webpage
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		// Open the\Chrome Browser
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to the application
		driver.get("https://www.spicejet.com/");

		// Click on the Calendar
		driver.findElement(By.xpath("//div[contains(@data-testid,'departure-date-dropdown-label-test-id')]")).click();

		// Click on the Next Month in the Calendar

		// i)Locate the Next Month
		WebElement nextMonth = driver.findElement(
				By.xpath("//div[contains(@data-testid,'undefined-calendar-picker')]/div[3]/div[2]/div/div[3]/div"));

		// ii)Store the Element in the List
		List<WebElement> dates = nextMonth.findElements(By.tagName("div"));

		// iii)Click on the Date 20th

		for (WebElement x : dates) {
			if (x.getText().equals("20")) {
				x.click();
				break;  // to break the iteration (OR) to stop the loop
				
			}
		}

	}
}

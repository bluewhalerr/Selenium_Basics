package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {
	public static void main(String[] args) {

		// Open the browser
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Go TO FB Page
		driver.get("https://facebook.com/");
		
		//Click oh Create New Account Button
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		//Select Date From The DropDown
		WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
	
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select selectDate = new Select(dayDropDown);
		selectDate.selectByVisibleText("30");
		
		//Selecting Month--Selecting By Visibility of text--Method(1)
		 WebElement monthDropDown = driver.findElement(By.id("month"));
		Select selectMonth = new Select(monthDropDown);//CLASS OBJECT = NEW CLASS();
		selectMonth.selectByVisibleText("May");//OBJECT.METHOD;
		
		//Selecting YearSelecting By Visibility of Value--Method(2)
		//Method (1) or (2) can be used to select the element form the DropDown
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByValue("2010");
		
		//To Retrieve the info Selected form the DropDown
		WebElement selectedDate = selectDate.getFirstSelectedOption();
		WebElement selectedMonth = selectMonth.getFirstSelectedOption();
		WebElement selectedYear = selectYear.getFirstSelectedOption();
		System.out.println("Selected Option :" + " "+selectedDate.getText() +" "+ selectedMonth.getText() +" "+ selectedYear.getText() );
	}
}

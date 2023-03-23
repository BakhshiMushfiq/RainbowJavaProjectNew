package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MousAndKeyboard {

	public static void main(String[] args) {
		// Mushfiq Bakhshi Assignment
		System.setProperty("webdriver.driver.chrome", "chromeDriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://formy-project.herokuapp.com/keypress");
		WebElement mousKey = driver.findElement(By.className("btn btn-lg"));
		mousKey.click();
		WebElement fullName = driver.findElement(By.className("col-sm-4"));
		fullName.sendKeys("Mushfiq Bakhshi");
		driver.close();
		
		
	}

}

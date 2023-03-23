package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chorem.driver", "choremdriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("cheese");
		driver.close();
		driver.quit();
	}

}

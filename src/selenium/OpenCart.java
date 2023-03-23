package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		WebElement checkBox = driver.findElement(By.id("checkbox-1"));
		checkBox.click();
		
		WebElement checkBox2 = driver.findElement(By.id("checkbox-2"));
		checkBox2.click();
	}

}

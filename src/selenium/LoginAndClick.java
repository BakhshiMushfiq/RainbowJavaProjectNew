package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAndClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.facebook.com/");
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("mushfiqbakhshi");
		
		WebElement pass = driver.findElement(By.cssSelector("input[id='pass']"));
		pass.sendKeys("318Street");
		WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		
		
		login.click();
		driver.quit();
	}

}

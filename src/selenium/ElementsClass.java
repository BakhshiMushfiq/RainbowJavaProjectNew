package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.facebook.com/");
		WebElement id = driver.findElement(By.cssSelector("input[id= 'email']"));
		id.sendKeys("mushfiqbakhshi@yahoo.com");
		WebElement password = driver.findElement(By.cssSelector("input[name= 'pass']"));
		password.sendKeys("318Street");
		//password.click();
		driver.close();
;	}

}

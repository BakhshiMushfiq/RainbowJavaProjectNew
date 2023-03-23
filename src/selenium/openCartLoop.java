package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openCartLoop {

	public static void main(String[] args) {
		// for loop in selenium 
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		//add userName
		WebElement userName = driver.findElement(By.id("input-username"));
		userName.sendKeys("Mushfiq");
		//add FirstName
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		firstName.sendKeys("Mushfiqullah");
		//lastName
		WebElement lastName = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		lastName.sendKeys("Bakhshi");
		//email
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("mushfiqbakhshi@yahoo.com");
		//select Country
		WebElement country = driver.findElement(By.id("input-country"));
		country.click();
		
		WebElement selectCountry = driver.findElement(By.xpath("//option[@value='1']"));
		Select option = new Select (selectCountry);
		
		List <WebElement> allCountry = option.getOptions();
		System.out.println("number of countres:" + allCountry.size());	
		
		for (WebElement aCountry: allCountry) {
			if (aCountry.getText().equals("Afghanistan"));
			aCountry.click();
			break;
		}
			
	}
		
}



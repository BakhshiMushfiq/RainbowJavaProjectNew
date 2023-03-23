package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class interfacePrecClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		//add UserName
		WebElement userName = driver.findElement(By.id("input-username"));
		userName.sendKeys("Hamidi");
		//add the First name
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Mushfiq");
		//add the last name
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("Bakhshi");
		//add Email
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("mushfiqbakhshi@yahoo.com");
		
		//select
		WebElement selection = driver.findElement(By.id("input-country"));
		Select country = new Select (selection);
		//List
		List <WebElement> alloption = country.getOptions();
	
		System.out.println("Numeb of countries:" + alloption.size());
		//For each loop
		 for (WebElement option: alloption) {
			 if (option.getText().equals("Iran")) {
			 option.click();
		break;
		}
	}

	}
}

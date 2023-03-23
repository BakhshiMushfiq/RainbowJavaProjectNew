import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssighnment {

	public static void main(String[] args) {
		// Mushfiq Bakhshi --> Selenium Assignment  
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		//Enter to webpage
		WebDriver driver = new ChromeDriver ();
		driver.get("https://formy-project.herokuapp.com/form");
		//Enter First Name
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Ahmad");
		//adding Last name
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Bakhshi");
		//Adding Job title
		WebElement jobTitle = driver.findElement(By.id("job-title"));
		jobTitle.sendKeys("Tester");
		//Radio button
		WebElement radioButton = driver.findElement(By.id("radio-button-3"));
		radioButton.click();
		//Gender check mark
		WebElement gender = driver.findElement(By.id("checkbox-2"));
		gender.click();
		//Select 
		WebElement select = driver.findElement(By.id("select-menu"));
		select.click();
		//Date picker
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("02/16/2023");
		
		WebElement submit = driver.findElement(By.linkText("Submit"));
		submit.click();
		//driver.close();
		}
		
		
	}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePacker {

	public static void main(String[] args) {
		// Date packer
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		//web address:
		driver.get("https://formy-project.herokuapp.com/");
		
		//Date Packer
		WebElement datePack = driver.findElement(By.linkText("Datepicker"));
		datePack.click();
		//Date Failed
		WebElement dateFaild = driver.findElement(By.id("datepicker"));
		dateFaild.sendKeys("02/14/2023");
		//dateFaild.sendKeys(Keys.ENTER);
		dateFaild.sendKeys(Keys.RETURN);
		
	}

}

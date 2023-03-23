import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropeeDownExample {

	public static void main(String[] args) throws InterruptedException {
		// Drop Down 
		System.setProperty("webdriver.chrme.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://formy-project.herokuapp.com/");
		WebElement dropdown = driver.findElement(By.linkText("Dropdown"));
		dropdown.click();
		Thread.sleep(2000);
		
		WebElement dropButton = driver.findElement(By.id("dropdownMenuButton"));
		dropButton.click();
		
		WebElement radiobutton = driver.findElement(By.linkText("Radio Button"));
		radiobutton.click();
	}

}

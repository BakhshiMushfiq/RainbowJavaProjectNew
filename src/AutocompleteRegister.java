import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteRegister {

	public static void main(String[] args) {
		// MushfiqBakhshi
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://formy-project.herokuapp.com/");
		WebElement autoComplete = driver.findElement(By.cssSelector("a[class='btn btn-lg']"));
		autoComplete.click();
		WebElement adress = driver.findElement(By.cssSelector("input[id='autocomplete']"));
		adress.sendKeys("8495 Everglade dr");
		WebElement city = driver.findElement(By.cssSelector("input[id='locality']"));
		city.sendKeys("Sacramento");
		WebElement state = driver.findElement(By.cssSelector("input[id = 'administrative_area_level_1']"));
		state.sendKeys("CA");
		WebElement zipCode = driver.findElement(By.cssSelector("input[id='postal_code']"));
		zipCode.sendKeys("75849");
		WebElement country = driver.findElement(By.cssSelector("input[id='country']"));
		country.sendKeys("USA");
		
		
		
	}

}

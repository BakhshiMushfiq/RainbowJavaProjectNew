import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterFaceFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://www.facebook.com");
		WebElement email = driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("mushfiqbakhshi@yahoo.com");
		WebElement id = driver.findElement(By.cssSelector("input[id='pass']"));
		id.sendKeys("318Street");
		
		driver.close();	
		driver.quit();
	
	}
}

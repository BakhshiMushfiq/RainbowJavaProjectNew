import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switchFram {

	public static void main(String[] args) {
		// Switch to
		System.setProperty("webdriver.chrome.driver", "Chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.switchTo().frame("iframeResult");
		//failed
		WebElement faild1 = driver.findElement(By.id("field1"));
		faild1.clear();
		faild1.sendKeys("Mushfiq");
		//faild2
		WebElement button = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions action = new Actions (driver);
		action.doubleClick(button).perform();
		driver.close();
		
		
		
		}

}

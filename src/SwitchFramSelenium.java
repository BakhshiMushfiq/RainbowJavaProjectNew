import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFramSelenium {

	public static void main(String[] args) throws InterruptedException {
		// Switch2
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/?overview-summary.html");
		//driver.manage().window().maximize();
	Thread.sleep(2000);	
	driver.switchTo().frame("packageListFrame");
	
	driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	driver.switchTo().defaultContent();
	
	//2 frame
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.linkText("Alert")).click();
	driver.switchTo().defaultContent();
	
	// 3 Frame
	Thread.sleep(2000);
	driver.switchTo().frame("classFrame");
	driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Index']")).click();
	}

}

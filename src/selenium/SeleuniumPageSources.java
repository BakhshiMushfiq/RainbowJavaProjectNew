package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleuniumPageSources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com/");
	driver.get("http://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	

	}

}

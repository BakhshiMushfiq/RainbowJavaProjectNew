package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readTitle {

	public static void main(String[] args) {
		// read the Title
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/modal");
		
		WebElement modal = driver.findElement(By.id("modal-button"));
		modal.click();
		WebElement closeButton = driver.findElement(By.id("close-button"));
		//closeButton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", closeButton);

		//driver.close();
		System.out.println("readTitle" +driver.getTitle());
		
		String title = (String) js.executeAsyncScript("return document.title");
		System.out.println("Title:" +title);
	}

}

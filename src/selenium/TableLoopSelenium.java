package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableLoopSelenium {

	public static void main(String[] args) {
		// Looping Table
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List <WebElement> row = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr["));
		String beforXpath = "//*[@id='customers']/tbody/tr";
		String aferXpath = "]/td[1]";
		
		for (int i = 2; i <= row.size();i++) {
			String element = beforXpath + i + aferXpath;
			WebElement company = driver.findElement(By.xpath(element));
			System.out.println("Compay:"+ company.getText());
		}
		
	}

}

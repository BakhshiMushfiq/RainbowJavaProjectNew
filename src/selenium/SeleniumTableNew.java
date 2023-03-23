package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTableNew {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List <WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		System.out.println("table size:" + table.size());
		
		String beforePath = "//tad[2]";
		
		for (int i = 2; i <= table.size(); i++) {
			String actualPath = beforePath + i + afterPath;
			WebElement element = driver.findElement(By.xpath(actualPath));
			System.out.println(element.getText());
		}
	}
}

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewSeleniumPage {

	public static void main(String[] args) {
		// Switch
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/html/html_tables.asp");;
		List <WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowSize = row.size();
		System.out.println("Totle row: " +rowSize);
		
		String before = "//table[@id='customers']/tbody/tr[";
		String after = "]/td[2]";
		
		for (int i = 2; i < rowSize; i++) {
			String actualPath = before + i + after;
			WebElement element = driver.findElement(By.xpath(actualPath));
			System.out.println("company:" +element.getText());
		}
		
	}

}

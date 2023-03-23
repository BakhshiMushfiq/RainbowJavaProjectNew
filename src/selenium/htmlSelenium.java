package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class htmlSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List <WebElement> row = driver.findElements(By.xpath("//*table[@id='customers']/tbody/tr"));
		int rowCount = row.size();
				System.out.println("Totle:" +rowCount);
				System.out.println("<************>");
				String before = "//*table[@id='customers']/tbody/tr[";
						String after = "]/td[2]";
						
						for (int i = 2; i <= rowCount; i++) {
							String actualRow = before + i + after;
							WebElement element = driver.findElement(By.xpath(actualRow));
							System.out.println(element.getText());
						}
;	}

}

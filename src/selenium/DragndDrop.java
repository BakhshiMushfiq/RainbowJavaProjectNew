package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragndDrop {

	public static void main(String[] args) {
		// DragAndDroping
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		WebElement image = driver.findElement(By.cssSelector("div[id='image']"));
		WebElement box = driver.findElement(By.cssSelector("div[id='box']"));
		
		Actions action = new Actions (driver);
		action.dragAndDrop(image, box).build().perform();
		
	}

}

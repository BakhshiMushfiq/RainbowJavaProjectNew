import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		WebElement image = driver.findElement(By.cssSelector("div[id='image']"));
		WebElement box = driver.findElement(By.cssSelector("div[id='box']"));
		
		Actions action = new Actions (driver);
		action.dragAndDrop(image, box).build().perform();
	}

}

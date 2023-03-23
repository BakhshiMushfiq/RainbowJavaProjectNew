
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class readTitlExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//String title = (String)jse.executeScript("return document.title;");
		//System.out.println("title: "+ title);
		//String title = (String) jse.executeAsyncScript("return document.title;");
		//System.out.println("Title : " +title);
		jse.executeScript("alert ('Helow Renbow, what is up')");
	}

}

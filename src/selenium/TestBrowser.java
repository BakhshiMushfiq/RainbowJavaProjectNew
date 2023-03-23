package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// To open a web-page --> .get ();  --> String URL address
		
		driver.get("https://www.google.com/");
		System.out.println("Print the Title: "+ driver.getTitle());
		System.out.println("print the URL: "+driver.getCurrentUrl());
		
		System.out.println("Print the Class:"+ driver.getClass());
		System.out.println("Print the WindowHadle: "+driver.getWindowHandle());
		
		
		
		
	}


}

package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFinalAssignment {

	private static Object it;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/partners");
		// clicking BecomPatner
		WebElement becomePartner = driver.findElement(By.linkText("Become a Partner"));
		becomePartner.click();
		Thread.sleep(2000);
		// enter in window
		Set handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parantsid = (String) it.next();
		String childId = (String) it.next();
		driver.switchTo().window(childId);

		// add fullName
		WebElement fullName = driver.findElement(By.xpath("//input[@id='Form_getForm_Name']"));
		fullName.sendKeys("Ahmad Zaki");
		// add email
		WebElement email = driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
		email.sendKeys("mushfiqbakhshi@yahoo.com");
		// add phone number
		WebElement phonNumber = driver.findElement(By.xpath("//input[@id='Form_getForm_Contact']"));
		phonNumber.sendKeys("9163433434");
		// add Company Name
		WebElement companyName = driver.findElement(By.id("Form_getForm_CompanyName"));
		companyName.sendKeys("PrintingPress");
		// select country
		WebElement country = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
		Select select = new Select(country);
		select.selectByVisibleText("Algeria");
		// select partnership
		WebElement partnershipTyp = driver.findElement(By.name("PartnershipType"));
		Select selectTyp = new Select(partnershipTyp);
		selectTyp.selectByVisibleText("Reseller partnership\n");

		// add massage
		WebElement massage = driver.findElement(By.xpath("//textarea[@id='Form_getForm_Comment']"));
		massage.sendKeys("Hi, could you please send out more information about the Orange HRM possible. thank you!");

		driver.switchTo().frame(1);
		WebElement robot = driver.findElement(By.cssSelector("#recaptcha-anchor']"));
	   robot.click();
		
		// WebElement iAmNotRobat =
		// driver.findElement(By.cssSelector("#recaptcha-accessible-status"));
		// iAmNotRobat.click();

		// WebElement selectphto =
		// driver.findElement(By.cssSelector("div[class='rc-image-tile-overlay']"));
		// selectphto.click();

		// WebElement submit =
		// driver.findElement(By.xpath("//input[@id='Form_getForm_action_submitForm']"));
		// submit.submit();

	}

}

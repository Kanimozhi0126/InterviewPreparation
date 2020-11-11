package interviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
	//set Webdriver
	System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
	
	//Open chrome browser
	ChromeDriver driver = new ChromeDriver();
		
	//Open Google
	driver.get("https://www.google.com/");
	
	//Maximize the window
	driver.manage().window().maximize();
	
	//enter search inputs
	driver.findElementByXPath("//input[@title='Search']").sendKeys("wikipedia"+Keys.ENTER);
	
	//adding waits to load the page
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	//select the first result
	driver.findElementByXPath("(//a)[30]").click();
		
	

	}

}

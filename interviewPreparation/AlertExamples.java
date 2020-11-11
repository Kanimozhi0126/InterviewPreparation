package interviewPreparation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		//system.set property tells the loaction where the browser im going to use is located in my system
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div/div/button");
		alertBox.click();
		
		//alert interface is inbuilt in selenium
		//normal alert
		driver.switchTo().alert().accept();
		
		//confirmation alert
		WebElement confirmAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
		confirmAlert.click();
		
		driver.switchTo().alert().dismiss();
		
		//Thread.sleep(3000);
		
		//prompt alert
		WebElement promptAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/button");
		promptAlert.click();
		
		Alert alertText = driver.switchTo().alert();
		alertText.sendKeys("Kani");
		alertText.accept();
		
		
		
		
		
	}

}

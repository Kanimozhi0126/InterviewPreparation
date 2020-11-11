package interviewPreparation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {
		//system.set property tells the loaction where the browser im going to use is located in my system
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = driver.findElementById("dropdown1");
		//'Select' pre built class in selenium to handle dropdown and input ah you have to pass the webelement found
		Select select = new Select(dropDown1);
		select.selectByIndex(2);
		
		WebElement dropDown2 = driver.findElementByName("dropdown2");
		Select select1 = new Select(dropDown2);
		select1.selectByValue("2");
		select1.selectByVisibleText("Selenium");
		
		//List is a collection type to store several elements
		List<WebElement> options = select1.getOptions();
		int sizeOfOptions = options.size();
		
		System.out.println("The number of dropdown options are : " + sizeOfOptions);
		
		//using sendkeys to select value from dropdown
		dropDown2.sendKeys("Selenium");
		
		//Multiselect values from dropdown
		WebElement multiSelectBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[6]/select");
		Select select2 = new Select(multiSelectBox);
		select2.selectByIndex(1);
		select2.selectByIndex(3);
		
		

	}

}

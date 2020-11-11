package interviewPreparation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExamples {

	public static void main(String[] args) {
		//system.set property tells the loaction where the browser im going to use is located in my system
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/checkbox.html");
		
		//select any one checkbox
		WebElement selectOne = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input");
		selectOne.click();
		
		//confirm checkbox is selected
		WebElement confirmSelected = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/input");
		boolean selected = confirmSelected.isSelected();
		
		System.out.println("Selenium checkbox is selected: " + selected);
		
		//deselect alraedy seleected checkbox
		WebElement alreadySelected = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input");
		boolean isSelected = alreadySelected.isSelected();
		
		WebElement notSelected = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input");
		boolean isSelected1 = notSelected.isSelected();
		
		if(isSelected = true)
		{
			alreadySelected.click();
		}
		
		//select all checkboxes
		WebElement firstBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input");
		firstBox.click();
		
		WebElement secondBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input");
		secondBox.click();
	}

}

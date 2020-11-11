package interviewPreparation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/Edit.html");
		
		WebElement emailBox = driver.findElementById("email");
		emailBox.sendKeys("Kanimozhi197@gmail.com");
		
		WebElement appendBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/input");
		appendBox.sendKeys("@gmail.com");
		
		//to read the text inside the textbox using the attribute "value" --namve value pair
		WebElement textBox = driver.findElementByName("username");
		String textValue = textBox.getAttribute("value");
		System.out.println(textValue);
		
		WebElement clearBox = driver.findElementByXPath("(//input[@name='username'])[2]");
		clearBox.clear();
		
		WebElement disableBox = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/div/div/input");
		boolean flag = disableBox.isEnabled();
		
		System.out.println(flag);
		
		if (flag == false)
		{
			System.out.println("The Text box is disabled");
		}
		else
		System.out.println("The textbox is enabled");
		

	}

}

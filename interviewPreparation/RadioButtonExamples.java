package interviewPreparation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExamples {

	public static void main(String[] args) {
	
		//system.set property tells the loaction where the browser im going to use is located in my system
				System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http:www.leafground.com/pages/radio.html");
				
				//find the default selected radio box on loading the page
				WebElement unchecked = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input");
				boolean isSelected = unchecked.isSelected();
				
				System.out.println("Unchceked box is selected default: " + isSelected);
				
				WebElement checked = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input");
				boolean isSelected1 = checked.isSelected();
				
				System.out.println("Checked box is selected default : " + isSelected1);
				
				//select any radio button from given options
				WebElement selectRadioOption = driver.findElementByXPath("(//input[@name='age'])[1]");
				selectRadioOption.click();
				
				

	}

}

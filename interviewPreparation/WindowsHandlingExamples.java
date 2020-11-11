package interviewPreparation;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingExamples {

	public static void main(String[] args) {
		//system.set property tells the loaction where the browser im going to use is located in my system
				System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http:www.leafground.com/pages/Window.html");
				
				//Open Window/page
				
				WebElement homeButton = driver.findElementById("home");
				homeButton.click();
				//PRebuilt method in selenium to get the current Window details/id in usage
				String parentWindow = driver.getWindowHandle(); //this will return current window open
				Set<String> allWindows = driver.getWindowHandles();//this will return all windows that are opened by driver 
				
				for (String eachWindow : allWindows) {
					
					driver.switchTo().window(eachWindow);
					
				}
				
				WebElement editButton = driver.findElementByXPath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img");
				editButton.click();
				
				driver.close(); //this will close the new window 
				
				driver.switchTo().window(parentWindow);// this will move the mouse control to original window opened by driver.
				//driver.switchTo().defaultContent(); // This will search for the second window and will get an exception as you have already closed it.
				
				//Open Multiple Windows
				
				WebElement multipleWindow = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
				multipleWindow.click();
				
				int numOfWindows = driver.getWindowHandles().size();
				System.out.println("The number of Windows opened : " + numOfWindows);
				
				//Close all Windows except parent window
				
				WebElement dontCloseWindow = driver.findElementById("color");
				dontCloseWindow.click();
				
				//String defaultWindow = driver.getWindowHandle();
				
				Set<String> newWindowHandles = driver.getWindowHandles();

			for (String allWindow : newWindowHandles) {
				
				if(!allWindow.equals(parentWindow)) //! represents that any window that currently opened is not parent window then close it
				{
					driver.switchTo().window(allWindow);
					driver.close();
				}
				
			}
			
			driver.quit();
	}

}

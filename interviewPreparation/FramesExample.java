package interviewPreparation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		//system.set property tells the loaction where the browser im going to use is located in my system
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0); // index 0 represents first frame identified in the HTML page
		
		WebElement clickMe = driver.findElementById("Click");
		clickMe.click();
		
		String text = clickMe.getText();
		System.out.println("Text is : "+ text);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement clickMe1 = driver.findElementById("Click1");
		clickMe1.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames = driver.findElementsByTagName("iframe");
		int size = totalFrames.size();
		
		System.out.println("Number of Frames in the Web page is: " + size);
		

	}

}

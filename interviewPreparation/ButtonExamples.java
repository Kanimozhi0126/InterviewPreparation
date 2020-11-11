package interviewPreparation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/Button.html");
		
		//find button position
		WebElement getPositionButton = driver.findElementById("position");
		//In Selenium there is an inbuilt class 'Point' to get the position of a button/...
		Point position = getPositionButton.getLocation();
		int xLocation = position.getX();
		int yLocation = position.getY();
		
		System.out.println("X value is : " + xLocation + " and " + "Y value is : " + yLocation);
		
		//find button color
		WebElement getColor = driver.findElementById("color");
		String colorName = getColor.getCssValue("background-color");
		System.out.println("Button color is : " + colorName);
		
		//find length and height of the button
		WebElement sizeButton = driver.findElementById("size");
		Dimension size = sizeButton.getSize();
		int height = size.height;
		int width = size.width;
		
		System.out.println("Height of the button is : " + height + " and " + "Width of the button is : " + width);
		
		driver.findElementById("home").click();
		
	}

}

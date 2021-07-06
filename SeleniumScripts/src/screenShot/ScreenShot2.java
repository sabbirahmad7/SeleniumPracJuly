package screenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mortgagecalculator.org/");
		driver.findElement(By.cssSelector("#homeval")).sendKeys("5000");
		
		Utility.objectByCss(driver,"#homeval","5000");
		
		Utility.objectByCss(driver,"#downpayment", "100");
		
		Utility.clickByCss(driver,"input[type='submit']");
		
		Utility.takePicture(driver, "Cal");
	}
	


}

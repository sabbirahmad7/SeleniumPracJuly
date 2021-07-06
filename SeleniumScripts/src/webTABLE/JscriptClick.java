package webTABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JscriptClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?.lang=en-US&src=homepage&activity=ybar-signin&pspid=2023538075&done=https%3A%2F%2Fwww.yahoo.com%2F&add=1");
		driver.manage().window().maximize();

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("#login-username")).sendKeys("sa");
		
		js.executeScript("document.getElementById('persistent').click()");
		
		we used a seperate method javaScript to run these lines
		*/
		javaScript(driver,"document.getElementById('persistent').click()");
	}
	
	public static void javaScript(WebDriver driver, String ele) {
JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("#login-username")).sendKeys("sa");
		js.executeScript(ele);
	}

}

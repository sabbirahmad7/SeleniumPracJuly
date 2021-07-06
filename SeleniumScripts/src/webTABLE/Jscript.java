package webTABLE;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Jscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// js.executeScript("window.scrollTo(400,0)");

		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,200)");

		List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sumry =0;
		
		for (int i = 0; i < value.size(); i++) {
			String tamount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")).get(i).getText();
			System.out.println(tamount);
			int intval = Integer.parseInt(tamount);
			System.out.println(intval);
		//	Integer.parseInt(value.get(i).getText());
			// iterates all the values and outputs integer
			sumry = sumry + intval; 
			
		}
		System.out.println(sumry);
		String total = driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim();
		
		int totalamt = Integer.parseInt(total);
		
		Assert.assertEquals(sumry, totalamt);
		
		int sum = 295;
		Assert.assertEquals(totalamt, sum);
		

	}

}

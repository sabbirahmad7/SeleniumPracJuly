package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		String name = "iphone";
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		act.contextClick(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		// Right Click
		// on my laptop options pop up as well
		WebElement sarch =driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(sarch).click().keyDown(Keys.SHIFT).sendKeys(name).build().perform();
		// Puts the variable name into Uppercase 
		
		
	}

}

package action;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.blinkingText")).click();// 2 tab
		
		Set <String> window = driver.getWindowHandles();// 2 ID
		// gets unique id's for opened browsers
		//intialed to a set of type string 
		
		Iterator <String> it = window.iterator(); // 2 ID
		// loads window value from next
		
		String parID = it.next();// 1st ID
		String childID = it.next();// 2nd ID
		
		driver.switchTo().window(childID);
		String email = driver.findElement(By.cssSelector("p.im-para.red"))
		.getText().split("at")[1].trim().split(" ")[0];
		
		System.out.println(email);
		driver.switchTo().window(parID);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}

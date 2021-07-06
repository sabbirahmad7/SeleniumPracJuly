package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travel_date")).click();
		
		List <WebElement> dates = driver.findElements(By.cssSelector(".day"));
		//42
		// select all calenders
		
		int count = dates.size();
		// count the days
		
		for(int i =0; i<count;i++) {
			String Day = "24";
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(Day)){
				driver.findElements(By.cssSelector(".day")).get(i).click();
				// clicks on the 24
			}
		}
		
	}

}

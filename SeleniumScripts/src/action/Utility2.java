package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility2 {

	public static void monthSelect(WebDriver driver, String munth, String dey) {
		// TODO Auto-generated method stub
	driver.findElement(By.id("travel_date")).click();// opens up calender
	
	
		
		String month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText();
		System.out.println(month);
		// prints out the first visible month
		
		
		while(!	driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains(munth)) {
				driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
				// clicks on the next button
			
				
			}
		List <WebElement> dates = driver.findElements(By.cssSelector(".day"));
		//42
		// select all calenders
		
		int count = dates.size();
		// returns the size as 0
		
		
		for(int i =0; i<count;i++) {
			//String Day = "24";
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(dey)){
				driver.findElements(By.cssSelector(".day")).get(i).click();
				// clicks on the 24
			}
		}
		
	}


}



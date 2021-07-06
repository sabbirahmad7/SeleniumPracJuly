package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		// no more jar file for screenshot 
		//webdriver allows u to caputre screenshot on memory
		// u have to capture it from memory

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		// TakeScreenShot is a interface of WebDriver instance
		Utility.takePicture(driver,"Round");
		
	//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click();
		
		driver.get("https://www.yahoo.com/?fr=yset_chr_syc_hp&type=hp-banner-v2Aug27&extInst=1");
		
		Utility.takePicture(driver,"yahoo");
		
		driver.get("https://www.facebook.com/");
		
		Utility.takePicture(driver,"facebook");
		
		
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver;
		 
		// takes screen shot and stores it in the temporary memory
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		// store it in a file format from memory 
		
		FileUtils.copyFile(source, new File("/Users/sabbirahmad/eclipse-workspace/SeleniumScripts/src/screenShot/screen/Round.png"));

		*/

	}

}

package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	//static WebDriver driver = new ChromeDriver();

	public static void takePicture(WebDriver driver, String name) {
		
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	// takes screen shot and stores it in the memory
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	// store it in a file format
	
	try {
		FileUtils.copyFile(source, new File("/Users/sabbirahmad/eclipse-workspace/SeleniumScripts/src/screenShot/screen/"+name+".png"));
		// copy source file into png file 
		System.out.println(name+" ScreenShot Done");
		System.out.println(driver.getTitle());
	} catch (Exception e) {
		// generic exception
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public static void objectByCss(WebDriver driver,String objLoc, String objData)  {
		// second screenshot 
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
		WebElement obj = driver.findElement(By.cssSelector(objLoc));
		// finding the object location
		obj.clear();
		obj.sendKeys(objData);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void clickByCss(WebDriver driver, String objLoc) {
		WebElement objE = driver.findElement(By.cssSelector(objLoc));
		objE.click();
	}
		
		
		
	}
	



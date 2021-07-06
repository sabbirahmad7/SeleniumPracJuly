package link;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkDeMO {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement Footerdriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(Footerdriver.findElements(By.tagName("a")).size());

		WebElement ColoumDriver = Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		System.out.println(ColoumDriver.findElements(By.tagName("a")).size());

		for (int i = 1; i < ColoumDriver.findElements(By.tagName("a")).size(); i++) {

			String clickTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			ColoumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickTab);

		}
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}

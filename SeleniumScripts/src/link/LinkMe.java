package link;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/sabbirahmad/Desktop/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement FootDriver = driver.findElement(By.id("pageFooter"));
		System.out.println(FootDriver.findElements(By.tagName("a")).size());
		// 45
		WebElement childFooterDriver = driver.findElement(By.xpath("//div[@id='pageFooterChildren']/ul"));
		System.out.println(childFooterDriver.findElements(By.tagName("a")).size());
		// 34
		for (int i = 1; i < childFooterDriver.findElements(By.tagName("a")).size(); i++) {
			String clickTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
			childFooterDriver.findElements(By.tagName("a")).get(i).sendKeys(clickTab);
		}

		Set<String> window = driver.getWindowHandles();

		Iterator<String> it = window.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			/*
			 * prints out: Facebook - Log In or Sign Up Page Not Found | Facebook Log into
			 * Facebook Facebook Help Center Facebook Terms and Policies How can I adjust
			 * how ads on Facebook are shown to me based on data about my activity from
			 * partners? | Facebook Help Center Cookies Policy Facebook Facebook Careers |
			 * Do the Most Meaningful Work of Your Career | Facebook Careers Facebook for
			 * Developers Facebook Log into Facebook Facebook - Home | Facebook Voting
			 * Information Center | Facebook Facebook Services Directory Fundraisers Local
			 * Guides Instagram Smart Video Calling with Alexa Built-in | Portal from
			 * Facebook Oculus | VR Headsets & Equipment Job Search | Facebook Groups
			 * Directory Facebook Pay: Simple, Secure, Free Payments Facebook Marketplace:
			 * Buy and Sell Items Locally or Shipped | Facebook Places Directory Games
			 * Discover great places in every city | Facebook Page Categories | Facebook
			 * Pages Directory A A APescatore Sampei | azzyk'Newbie | People Directory
			 * Facebook Watch Facebook Lite APK for Android Messenger Log into Facebook
			 * 
			 */
		}

	}

}

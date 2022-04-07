import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksassignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// System.out.println(driver.findElements(By.tagName("a")).size());

		// WebElement footerdriver = driver.findElement(By.id("navFooter"));

		WebElement linkdriver = driver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[7]//ul"));
		linkCount(driver, linkdriver);
		
	}

	public static void linkCount(WebDriver driver, WebElement linkdriver ) {
		System.out.println(linkdriver.findElements(By.tagName("a")).size());

		String keyclick = Keys.chord(Keys.COMMAND, Keys.ENTER);

		for (int i = 0; i < linkdriver.findElements(By.tagName("a")).size(); i++) {
			linkdriver.findElements(By.tagName("a")).get(i).sendKeys(keyclick);

		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}

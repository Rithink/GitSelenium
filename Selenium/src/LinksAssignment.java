import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("navFooter"));
		
	//WebElement colomdriver = footerdriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[1]//ul"));
	WebElement colomdriver = footerdriver.findElement(By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//div[7]//ul"));
	
	System.out.println(colomdriver.findElements(By.tagName("a")).size());
	
	String keyclick = Keys.chord(Keys.COMMAND,Keys.ENTER);
	
	for(int i=0; i<colomdriver.findElements(By.tagName("a")).size();i++)
	{
		colomdriver.findElements(By.tagName("a")).get(i).sendKeys(keyclick);
		
	}
	
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	
	while(it.hasNext())
	{
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}

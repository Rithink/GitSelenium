import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		//driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("June");
		while(!(driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("April 2023"))) {
		
		driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
		}
		//List<WebElement> dat =driver.findElements(By.cssSelector("td[class='day']"));
		
		int size = driver.findElements(By.cssSelector("td[class='day']")).size();
		for(int i=0; i<size ;i++)
		{
			String find = driver.findElements(By.cssSelector("td[class='day']")).get(i).getText();
			if(find.equalsIgnoreCase("22"))
			{
				driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

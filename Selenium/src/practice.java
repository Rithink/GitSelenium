
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		System.out.println( driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.className("_1_3w1N")).click();
		driver.findElement(By.className("VJZDxU")).sendKeys("rithin@gmail.com");
		driver.findElement(By.cssSelector("input[class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("rithin@gmail.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'✕')])[1]")).click();
		driver.quit();
		System.out.println("This is added to test git");
		System.out.println("This is added to test git");
		
	}
	
}
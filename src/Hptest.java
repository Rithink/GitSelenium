
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hptest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rithi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//this is system set property
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		Thread.sleep(3000);
		driver.quit();
		
		System.out.println( "This is Hp test change");
		
	}
	
}
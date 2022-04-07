import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locattors {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println( driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Rithin");
		driver.findElement(By.name("inputPassword")).sendKeys("tetst123455667");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rithin");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("testmail@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8737648494");
		driver.findElement(By.cssSelector(".reset-pwd-btn"));
		

	
	}
}

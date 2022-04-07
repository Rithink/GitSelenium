import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locattors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println( driver.getTitle());
		driver.findElement(By.id("inputUsername")).sendKeys("Rithin");
		driver.findElement(By.name("inputPassword")).sendKeys("tetst123455667");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println( driver.findElement(By.cssSelector("p.error")).getText());
	

	
	}

}

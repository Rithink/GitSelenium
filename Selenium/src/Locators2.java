import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Locators2 pass = new Locators2();
		String S = pass.getPassword(driver);
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(S);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		driver.quit();
		
		

	}
	
	public String getPassword(WebDriver driver) throws InterruptedException {
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
    String passwordText =   driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
    String[] spit = passwordText.split("'");
    
    return spit[1];
		
		
	}
	
 
}

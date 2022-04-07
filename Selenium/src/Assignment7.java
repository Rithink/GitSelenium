import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		int a = driver.findElements(By.xpath("(//table[@id='product'])[1]//tbody//tr")).size();
		System.out.println("number of rows = "+a);
		int b = driver.findElements(By.xpath("(//table[@id='product'])[1]//tbody//tr//th")).size();
		System.out.println("number of coloums = "+b);
		List<WebElement> data = driver.findElements(By.xpath("(//table[@id='product'])[1]//tbody//tr[3]/td"));
		for(int i=0;i<data.size();i++)
		{
			System.out.println( data.get(i).getText());
		}
	
		driver.findElement(By.id("autocomplete")).sendKeys("ba");
		Thread.sleep(1000);
		int i=0;
		while(i<5)
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);	
			i++;
		}
	
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		
	
	}

}

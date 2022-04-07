import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollandTable {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,600)");
	Thread.sleep(1000);
	//js.executeScript("document.querySelecor('.tableFixHead').scrollTop=5000");
	
	List<WebElement> table=  driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	int sum=0;
	for(int i=0;i<table.size();i++)
	{
		sum = sum+Integer.parseInt(table.get(i).getText());
	}
	
	System.out.println(sum);
	int actual = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
	
	if(sum==actual)
	{
		System.out.println("correct");
	}
	else
	{
		System.out.println("Wrong");
	}
	
	Assert.assertEquals(sum, actual);
	
	

	}

}

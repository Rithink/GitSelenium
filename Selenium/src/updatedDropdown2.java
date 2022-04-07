import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			
			driver.findElement(By.xpath("//a[@value='AMD']")).click();
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
			driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='TIR']")).click();
			
			//calendar
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			
			//TO calendar enabled or not
			System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println( driver.findElement(By.id("Div1")).getAttribute("style"));
			if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1"))
			{
				System.out.println("Calendaer is enabled");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
				System.out.println("Calendaer is disabled");
			}
				
			
	}

}

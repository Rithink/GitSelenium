import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		// from to date
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(1000);
		// driver.findElement(By.xpath("(//a[@value='TIR'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='TIR']"))
				.click();

		// calendar
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// TO calendar enabled or not
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
			System.out.println("Calendaer is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
			System.out.println("Calendaer is disabled");
		}
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());

		// count the checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// selecting number of passengers

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000);

		int i = 1;
		while (i < 7) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;

		}
		driver.findElement(By.xpath("//input[@class='buttonN']")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));

		// selecting currency
		WebElement statciDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
        
		Select dropdown = new Select(statciDropdown);
		dropdown.selectByIndex(3);

	}

}



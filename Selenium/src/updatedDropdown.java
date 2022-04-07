import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class updatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount']")).isSelected());
		

		
		
		
		
		//count the checkbox
		System.out.println( driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i=1;
		while (i<7) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		
	}
		driver.findElement(By.xpath("//input[@class='buttonN']")).click();

}
}

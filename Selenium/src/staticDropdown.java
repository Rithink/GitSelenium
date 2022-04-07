
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Thread.sleep(5000);
		
		
		WebElement statciDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(statciDropdown);
		dropdown.selectByIndex(0);
		System.out.println(  dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(  dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(  dropdown.getFirstSelectedOption().getText());
		driver.close();
		
		
		
		
		
	}

}

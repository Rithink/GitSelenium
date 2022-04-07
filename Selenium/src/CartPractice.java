import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPractice {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// driver.manage().window().maximize();
		String[] itemsArray = { "Beetroot" , "Brocolli", "Cauliflower", "Walnuts" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver, itemsArray);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//		driver.findElement(By.xpath("//img[@alt='Cart']"));
//		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	
	}


public static void addItems(WebDriver driver , String[] itemsArray) {

	 
	 int j = 0;
        List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));

          for (int i = 0; i < product.size(); i++) {
	String name = product.get(i).getText();

	// triming the vegetable name
	String[] vegName = name.split("-");
	String vegNameReal = vegName[0].trim();
	
	
   //coverting array to arraylist
	List itemsNeeded = Arrays.asList(itemsArray);

	if (itemsNeeded.contains(vegNameReal)) {
		j++;
		// Click to add to cart

		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

		if (j == itemsArray.length) {
			break;
		}
	}
}
}
}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			
			driver.findElement(By.name("name")).sendKeys("Rithin");
			driver.findElement(By.name("email")).sendKeys("Rithin@gmail.com");
			driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rithin123");
	        driver.findElement(By.id("exampleCheck1")).click();
	        WebElement form =  driver.findElement(By.id("exampleFormControlSelect1"));
	        
	        Select dropdown = new Select(form);
	        dropdown.selectByVisibleText("Male");
	        driver.findElement(By.id("inlineRadio2")).click();
	        driver.findElement(By.name("bday")).sendKeys("22/03/1998");
	        driver.findElement(By.cssSelector(".btn.btn-success")).click();
	        System.out.println( driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	        
	        
	        
	        		
	        		
	        
			

	}

}

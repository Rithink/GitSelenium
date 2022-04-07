import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testaa {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jira.robosoftin.com");
		driver.findElement(By.id("usernamelabel")).sendKeys("rithin.kumar@robosoftin.com");
		driver.findElement(By.id("login-form-password")).sendKeys("Rithin@93");
		driver.findElement(By.id("login")).clear();

	}

}

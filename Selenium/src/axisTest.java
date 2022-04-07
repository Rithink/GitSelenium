import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class axisTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://betaservices.axismf.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//li[2]//div[1]//ion-button[1]")).click();
	}

}

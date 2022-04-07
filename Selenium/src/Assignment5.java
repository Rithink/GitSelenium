import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rithinkumar/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		//System.out.println( driver.findElements(By.tagName("frame")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=frame-top]")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=frame-middle]")));
		System.out.println( driver.findElement(By.id("content")).getText());
	}

}

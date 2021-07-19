import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement search=driver.findElement(By.name("q"));
search.sendKeys("I Love Selenium");
	}

	
}

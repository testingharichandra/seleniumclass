import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		WebElement search=driver.findElement(By.id("email"));
		search.sendKeys("8928530581");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Samarth");
       

	}
}

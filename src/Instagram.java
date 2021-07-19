import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		WebElement userid=driver.findElement(By.name("username"));
		userid.sendKeys("8928530581");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Samarth");
		WebElement  login=driver.findElement(By.name("login"));
		login.click();
       driver.quit();

	}
}

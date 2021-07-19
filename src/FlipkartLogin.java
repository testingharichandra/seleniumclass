import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement login=driver.findElement(By.className("_1_3w1N"));
		login.click();
		
		WebElement user=driver.findElement(By.className("_2IX_2- VJZDxU"));
		user.sendKeys("8928530581");
		
		WebElement pass=driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
		pass.sendKeys("Samarth");
		
		WebElement button=driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL"));
		button.click();
		
	}

}

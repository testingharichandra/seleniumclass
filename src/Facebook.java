import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement search=driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
		search.sendKeys("8928530581");
		WebElement pass=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("Samaghdtrth");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
       login.click();
       
       driver.navigate().to("https://amazon.in");
       
       driver.close();
       
    			
    	
	}

}

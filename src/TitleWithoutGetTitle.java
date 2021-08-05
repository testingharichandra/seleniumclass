import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleWithoutGetTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
 
	WebElement title = driver.findElement(By.xpath("id=\"pageTitle"));
	System.out.println(title.getAttribute("title"));
		driver.close();
	}

}

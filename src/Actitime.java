import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("admin");
	WebElement pass=driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	WebElement login=driver.findElement(By.id("loginButton"));
	login.click();
     String title=driver.getTitle();
     System.out.println(title);
     Thread.sleep(10000);
     driver.quit();
	}

}

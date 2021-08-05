import java.util.concurrent.TimeUnit;

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
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.name("pwd")).sendKeys("manager");

	WebElement login=driver.findElement(By.id("loginButton"));
	login.click();
     String title=driver.getTitle();
     System.out.println(title);
     Thread.sleep(10000);
     driver.quit();
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicite {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("admin");
		WebDriverWait ww=new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.textToBePresentInElementValue(user, "admin"));
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

}
}

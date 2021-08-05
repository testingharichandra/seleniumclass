import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExpliciteWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		

		 WebElement login = driver.findElement(By.xpath("//a[@id='loginButton']"));
		 WebDriverWait ww=new WebDriverWait(driver, 10);
		 ww.until(ExpectedConditions.elementToBeClickable(login));
		 login.click();
		 
		 ww.until(ExpectedConditions.titleContains("Enter"));
		 driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		 driver.close();

}}

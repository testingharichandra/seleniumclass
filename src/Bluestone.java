import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	
	driver.findElement(By.xpath("//input[@id='search_query_top_elastic_search']")).sendKeys("ring",Keys.ENTER);
	driver.findElement(By.xpath("//img[@class='hc img-responsive center-block']")).click();
	
	Set <String> tabs=driver.getWindowHandles();
	for (String tab : tabs) {
		
		driver.switchTo().window(tab);
			}
	
	 driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	String errormsg= driver.findElement(By.xpath("//div[@class='formErrorContent']")).getText();
	System.out.print(errormsg);
	
}
}

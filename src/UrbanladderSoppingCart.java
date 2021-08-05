import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanladderSoppingCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		WebElement sale = driver.findElement(By.xpath("//li[@class='topnav_item saleunit']"));
		Thread.sleep(1000);
		a.moveToElement(sale).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[text()='Wooden Sofa Sets']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/products/malabar-wooden-sofa-macadamia-brown?src=listing-wooden-sofas']/descendant::button[.='View Product']")).click();
		Thread.sleep(2000);
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			
			
		}
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//img[@class='logo-img']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Cart']")).click();
		
	}
}

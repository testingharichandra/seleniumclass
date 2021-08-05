import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationPracticeAssigment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']")).click();
		
		Actions a=new Actions(driver);
		WebElement tshirt=driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		a.moveToElement(tshirt).perform();
		
		
		driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		
		driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']/span[@title='Close window']")).click();
		
		WebElement cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		a.moveToElement(cart).perform();
		
		
		WebElement title = driver.findElement(By.xpath("//dl[@class='products']/dt"));
		System.out.println(title.getText());
		WebElement total = driver.findElement(By.xpath("//span[@class='price cart_block_total ajax_block_cart_total']"));
		System.out.println(total.getText());
		
       driver.close();
}
}

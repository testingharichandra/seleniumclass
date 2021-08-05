import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonesc2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		
		WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
		
		a.moveToElement(coins).build().perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']")).click();
	
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}

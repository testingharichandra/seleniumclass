import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonesc6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings", Keys.ENTER);
		
		WebElement price = driver.findElement(By.xpath("//section[@id='Price-form']"));
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		a.moveToElement(price).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		Thread.sleep(3000);
		String below10k = driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']/descendant::span[@class='items-count']")).getText();
		System.out.println(below10k);

		//Thread.sleep(5000);
	     driver.close();
}
}

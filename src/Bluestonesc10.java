import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestonesc10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings", Keys.ENTER);
		

		
		
	      WebElement delivery = driver.findElement(By.xpath(""));
			
			
			Actions a=new Actions(driver);
			//a.moveToElement().build().perform();

}
}
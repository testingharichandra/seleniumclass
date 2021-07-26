import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartorder {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.flipkart.com/");
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 12 pro max gold 512 " );
      driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      driver.findElement(By.linkText("APPLE iPhone 12 Pro Max (Gold, 512 GB)")).click();
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
      driver.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']")).sendKeys("411038");
      driver.findElement(By.xpath("//span[@class='UgLoKg']")).click();
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
      
      

	}

}

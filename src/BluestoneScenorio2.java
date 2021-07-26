import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenorio2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
 driver.findElement(By.xpath("//a[@title='Coins']")).click();
 driver.findElement(By.xpath("//div[@class='filter 50gms']")).click();
 System.out.print("50 grams coins display :");
System.out.println(driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse weight-50']")).isDisplayed());



}
	}
	
/*
		//div[@class='filter 50gms']
		/*Thread.sleep(2000);
		 * 
		 
		Actions a=new Actions(driver);
		
 WebElement coins = driver.findElement(By.xpath("//a[@title='Coins']"));
 a.moveToElement(coins).build().perform();
 
 driver.findElement(By.linkText("50 gram")).click();
 
 System.out.print("50 grams coins display :");
 /*
System.out.println(driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse weight-50']']")).isDisplayed());*/

 
	

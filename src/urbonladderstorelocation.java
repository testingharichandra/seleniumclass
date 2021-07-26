import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbonladderstorelocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();

		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
		
		driver.findElement(By.xpath("//a[@href='../../furniture-stores?src=header']")).click();
		
 List<WebElement> locname = driver.findElements(By.xpath("//h3[@class='_3JJeW']"));
 
for (WebElement locs : locname) {
	
	//String loc=((WebElement) driver.switchTo()).getText();
	
	System.out.println(locs.getText());
}
	Thread.sleep(5000);
	driver.close();
}

}

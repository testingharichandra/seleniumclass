import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDoubleClick {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(20000);
	WebElement element2 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			//WebElement element=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			Actions a=new Actions(driver);
			a.contextClick(element2).perform();
			//a.doubleClick(element).perform();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimecontains {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
      WebElement   inrtxt= driver.findElement(By.xpath("//b[text()='admin']"));
   
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(inrtxt.getText());
	WebElement ps=driver.findElement(By.xpath("//b[text()='manager']"));
	String pass=ps.getText();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(10000);
	
	driver.quit();
	}
	

}
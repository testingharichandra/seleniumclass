import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testingharichandra@gmail.com");
	driver.findElement(By.xpath("//span[@jsname='V67aGc']")).click();

	
	}

}

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

	
	WebElement email=driver.findElement(By.name("identifier"));
	email.sendKeys("pujagpawar@gmail.com");
	WebElement nextbutton=driver.findElement(By.id("identifierNext"));
	nextbutton.click();
	
	}

}

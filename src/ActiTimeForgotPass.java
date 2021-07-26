import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeForgotPass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	WebElement forgotPass=driver.findElement(By.linkText("Forgot your password?"));
	forgotPass.click();
	WebElement forgotemail=driver.findElement(By.name("forgetPasswordEmailOrUsername"));
	forgotemail.sendKeys("trainee");
	WebElement getpass=driver.findElement(By.linkText("Request Login Info"));
	getpass.click();
	}

}

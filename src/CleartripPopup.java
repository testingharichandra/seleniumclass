import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CleartripPopup {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");


}
}

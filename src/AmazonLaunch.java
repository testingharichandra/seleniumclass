import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLaunch {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
	}

}

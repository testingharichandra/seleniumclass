import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopCluesLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shopclues.com");
		String title =driver.getTitle();
		System.out.println(title);	
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		Thread.sleep(2000);
		driver.quit();
	}
}

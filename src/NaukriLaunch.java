import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(1000);
		 Set<String> wins=driver.getWindowHandles();
		for (String id : wins) {
			System.out.println(id);
			driver.switchTo().window(id);
			Thread.sleep(2000);
			driver.close();
		}
	}

}

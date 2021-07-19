import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.getClass());
		String parent =driver.getWindowHandle();
		wins.remove(parent);
		for (String id:wins) {
			driver.switchTo().window(id);
			driver.close();
		}
}
}
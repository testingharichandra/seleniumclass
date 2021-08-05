import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLaunch3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.getClass());
		
		
		ArrayList <String> lst=new ArrayList<>(wins);
		
		for(int i=lst.size()-1;i>=1;i--) {
			String id=lst.get(i);
			driver.switchTo().window(id);
			
			driver.close();
			
		}

	}

}

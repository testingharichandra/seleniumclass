import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneMousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.bluestone.com/");
		driver.get("https://www.bluestone.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a=new Actions(driver);
		for (WebElement menuName : menus) {
			a.moveToElement(menuName).build().perform();
			
			System.out.println(menuName.getText());
			
		}

	}

}

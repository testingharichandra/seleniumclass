import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAssignmentMouseHover {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		

		List<WebElement> print = driver.findElements(By.xpath("//ul[@class='erkvQe']"));

		for (WebElement prt : print) {

			System.out.println(prt.getText());

		}

		// List<WebElement> option =
		// driver.findElements(By.xpath("//div[@role='option']"));
		print.get(2).click();
		// driver.findElement(By.xpath("//span[text()='java']/descendant::b[text()='script']")).click();
		driver.close();

		/*
		 * Actions a=new Actions (driver); for (WebElement opt : option) {
		 * Thread.sleep(2000); a.moveToElement(opt).build().perform();
		 * System.out.println(opt.getText());
		 * 
		 * }
		 */

	}

}

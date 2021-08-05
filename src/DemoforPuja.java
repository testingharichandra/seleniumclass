import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoforPuja {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("I love Selenium");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(3000);
		search.sendKeys("I Love Testing");
		Thread.sleep(3000);
		/*//System.out.println(search.isDisplayed());
		System.out.println(search.getCssValue("border"));
		System.out.println(search.getCssValue("margin"));
		System.out.println(search.getLocation());*/
		driver.close();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement search=driver.findElement(By.name("q"));
search.sendKeys("I Love Selenium");
Thread.sleep(3000);
search.clear();
Thread.sleep(3000);
search.sendKeys("i love testing");


Point loc = search.getLocation();

WebElement titleEle= driver. findElement(By.tagName("title")); 
System.out.println("Title of webpage by webelement title :"+titleEle.getAttribute("text content"));
System.out.println(loc);
driver.close();
	}

	
}

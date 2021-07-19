import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
               System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
               WebDriver driver=new ChromeDriver();
               driver.get("https://www.instagram.com/");
               driver.manage().window().maximize();
               
               
               WebElement link=driver.findElement(By.className(" coreSpriteFacebookIcon AeB99"));
               link.click();
               WebElement  user=driver.findElement(By.name("email"));
               user.sendKeys("8928530581");
               WebElement pass=driver.findElement(By.id("pass"));
               pass.sendKeys("Samarth");
               
               WebElement login=driver.findElement(By.name("login"));
               login.click();

	}

}

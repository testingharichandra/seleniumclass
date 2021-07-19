import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement search=driver.findElement(By.id("email"));
		search.sendKeys("8928530581");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Samarth");
		WebElement login=driver.findElement(By.name("login"));
       login.click();
       

       WebElement srch=driver.findElement(By.name("global_typeahead"));
       srch.sendKeys("kalpak jaiswal");
    		   
    	WebElement kalpak=driver.findElement(By.className("j83agx80 cbu4d94t ew0dbk1b irj2b8pg"));
    	kalpak.click();
    			
    	
	}

}

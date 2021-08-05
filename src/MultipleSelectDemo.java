import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Harichandra/Desktop/Selenium%20batch/select.html");

	WebElement ele = driver.findElement(By.id("b"));
		Select s=new Select(ele);
		
		if(s.isMultiple()) {
			s.selectByIndex(3);
			s.selectByValue("misal pav");
		}
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("***************************************");
	List<WebElement> allopt = s.getAllSelectedOptions();
	for (WebElement opt : allopt) {
		System.out.println(opt.getText());
		
	}
	
	}

}

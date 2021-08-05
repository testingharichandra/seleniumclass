import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		Select dy = new Select(day);
		dy.selectByIndex(7);
		WebElement mon = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		Select mn=new Select(mon);
		mn.selectByVisibleText("May");
		List<WebElement> months = mn.getOptions();
		for (WebElement val : months) {
			System.out.println(val.getText());
		}
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		Select yy=new Select(year);
		yy.selectByValue("1998");
			
}
}
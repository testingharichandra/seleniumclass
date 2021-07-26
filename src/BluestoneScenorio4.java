import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneScenorio4 {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
 driver.findElement(By.xpath("//a[@title='Coins']")).click();
 driver.findElement(By.xpath("//div[@class='filter 5gms']")).click();
 System.out.print("5 grams coins display :");
System.out.println(driver.findElement(By.xpath("//li[@class='col-xs-4 three-column-browse weight-5']")).isDisplayed());

}
}

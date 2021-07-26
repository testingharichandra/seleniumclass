import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbonLadder {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.urbanladder.com/");
driver.manage().window().maximize();

Thread.sleep(10000);
driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Sofa",Keys.ENTER);
driver.findElement(By.xpath("//img[@alt='Weston Half Leather Sofa (Licorice Italian Leather)']")).click();;
driver.findElement(By.xpath("//a[@data-gacategory='Sofa_Prod_Page']")).click();
driver.findElement(By.xpath("//button[@id='add-to-cart-button']")).click();
Thread.sleep(2000);
System.out.println(driver.getTitle());
driver.close();
	}

}

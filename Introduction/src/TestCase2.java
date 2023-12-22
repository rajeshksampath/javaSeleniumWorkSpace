import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create driver object for Browser
		// Methods of webdriver can be implemented
		/* Class name= ChromeDriver,
		 * X driver = new X();
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://facebook.com");
		System.out.println(driver1.getTitle());
		driver1.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("rajesh_sparks@yahoo.co.in");
		driver1.findElement(By.xpath("//*[@id='pass']")).sendKeys("beachpoint");
		driver1.findElement(By.xpath("//*[@type='submit']")).click();
	}

}

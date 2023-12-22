package basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, 5);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");

		driver.findElement(By.xpath("//a[text()='Click to load get data via Ajax!']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#results")));

		System.out.println(driver.findElement(By.cssSelector("div#results")).getText());
	}

}

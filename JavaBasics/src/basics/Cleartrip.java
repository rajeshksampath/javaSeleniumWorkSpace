package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");

		driver.findElement(By.cssSelector(".span.span15.datePicker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();

		driver.findElement(By.id("SearchBtn")).click();
		driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}

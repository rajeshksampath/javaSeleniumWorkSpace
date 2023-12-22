import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rajes\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		
		driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000L);
		/*
		 * int i=1; while(i<5) {
		 * driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']"
		 * )).click(); i++; } driver.findElement(By.xpath(
		 * "//div[@data-testid='home-page-travellers-done-cta']")).click();
		 */

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

		System.out.println(driver.findElement(By.xpath(
				"//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]"))
				.getText());

		driver.findElement(By.xpath("//div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]"))
				.click();
		// Reference - //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath(
				"//div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2] //div[contains(text(),'MAA')]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2] //div[contains(text(),'CJB')]"))
				.click();
		
	}

}

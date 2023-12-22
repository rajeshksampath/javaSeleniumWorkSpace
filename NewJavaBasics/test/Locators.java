import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rajes\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		// By.id
		driver.findElement(By.id("inputUsername")).sendKeys("rajeshkumar");
		// By.name
		driver.findElement(By.name("inputPassword")).sendKeys("abcd1234");
		// By.Class
		driver.findElement(By.className("signInBtn")).click();
		// By.CSSselector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("sampath");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rajs.amp@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rajs1.amp@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rajs2.amp@gmail.com");
		// Parent to child with xpath
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2132453421");
		driver.findElement(By.className("reset-pwd-btn")).click();
		// Parent to child with CSS
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("div button")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//CSSSelector regex
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//xpath regex
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}

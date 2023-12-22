import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ParentChildXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input[@class='gLFyf gsfi']")).sendKeys("1st automated search");
		
		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[@class='gNO89b']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@class='content']/span/center/div")).click();
		WebElement searchbtn = driver.findElement(By.xpath("//*[@class='FPdoLc tfB0Bf']/center/input[@class='gNO89b']")).click();
		Assert.assertFalse(true);
	
	}

}

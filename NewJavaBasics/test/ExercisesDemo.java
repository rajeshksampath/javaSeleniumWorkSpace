import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExercisesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\rajes\\\\Desktop\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		List<WebElement> list = driver.findElements(By.xpath("//*[@href or @src]"));
		

		for (WebElement e : list) {
			String name = e.getText();
			//String name = e.getAttribute("innerText");
			if(name != null && !name.isEmpty())
			{
			String link = e.getAttribute("href");
			if (null == link)
				link = e.getAttribute("src");
				System.out.println(name + "=" + link);
			}
		}
	}
}

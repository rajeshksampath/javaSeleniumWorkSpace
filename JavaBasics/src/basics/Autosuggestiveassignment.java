package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiveassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
		WebElement box = driver.findElement(By.id("autocomplete"));
		box.click();
		box.sendKeys("uni");
		Thread.sleep(2000);
		// System.out.println(box.getText());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String country = "return document.getElementById(\"autocomplete\").value;";
		String name = (String) js.executeScript(country);
		System.out.println(name);

		int i = 0;

		while (!name.equalsIgnoreCase("United States (USA)")) {
			i++;
			box.sendKeys(Keys.ARROW_DOWN);
			name = (String) js.executeScript(country);
			// System.out.println(name);

			if (i > 10) {
				System.out.println("Country not found");
				break;
			}

		}
		System.out.println(name);
	}

}

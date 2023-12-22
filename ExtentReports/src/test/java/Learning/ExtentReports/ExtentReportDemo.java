package Learning.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Test
public class ExtentReportDemo {
	ExtentReports Extent;

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Webreports");
		reporter.config().setDocumentTitle("Main Report");

		Extent = new ExtentReports();
		Extent.attachReporter(reporter);
		Extent.setSystemInfo("Tester", "Rajesh");

	}

	@Test
	public void initialDemo() {
		ExtentTest test = Extent.createTest("initialDemo");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		test.fail("Not Matching");

		Extent.flush();
	}

}

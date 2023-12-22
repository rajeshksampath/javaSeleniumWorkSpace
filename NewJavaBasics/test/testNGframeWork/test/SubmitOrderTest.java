package testNGframeWork.test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNGframeWork.PageObjects.CartPage;
import testNGframeWork.PageObjects.CheckoutPage;
import testNGframeWork.PageObjects.ConfirmationPage;
import testNGframeWork.PageObjects.LandingPage;
import testNGframeWork.PageObjects.OrderPage;
import testNGframeWork.PageObjects.ProductCatalog;
import testNGframeWork.testComponents.BaseTest;

public class SubmitOrderTest extends BaseTest {
	public String productname = "zara coat 3";

	@Test(dataProvider = "getData", groups = { "Purchase" })
	public void submitorder(HashMap<String, String> input) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String country = "India";
		ProductCatalog productcatalog = LandingPage.loginapplication(input.get("email"), input.get("password"));
		List<WebElement> products = productcatalog.getmeProductList();
		productcatalog.addProductToCart(input.get("product"));
		CartPage cartpage = productcatalog.goToCart();
		Boolean match = cartpage.verifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		CheckoutPage checkoutpage = cartpage.goToCheckout();
		checkoutpage.SelectCountry(country);
		ConfirmationPage confirmationpage = checkoutpage.SubmitOrder();
		String confirmmsg = confirmationpage.getConfirmation();
		Assert.assertTrue(confirmmsg.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

	}

	@Test(dependsOnMethods = { "submitorder" }, dataProvider = "getData")
	public void OrderHistoryTest(HashMap<String, String> input) {
		ProductCatalog productcatalog = LandingPage.loginapplication(input.get("email"), input.get("password"));
		OrderPage OrderPage = productcatalog.goToOrderPage();
		Assert.assertTrue(OrderPage.verifyOrderDisplay(input.get("product")));
	}
	
	// Screenshot utility
	
	
	//Pull data from getJsonDataToMap utility available in BaseTest
	@DataProvider
	public Object[][] getData() throws IOException {
		/*
		 * HashMap<String, String> map = new HashMap<String, String>(); map.put("email",
		 * "anshika@gmail.com"); map.put("password", "Iamking@000"); map.put("product",
		 * "zara coat 3");
		 * 
		 * HashMap<String, String> map1 = new HashMap<String, String>();
		 * map1.put("email", "shetty@gmail.com"); map1.put("password", "Iamking@000");
		 * map1.put("product", "adidas original");
		 */

		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "\\main\\testNGframeWork\\data\\Purchase.json");
		return new Object[][] { {data.get(0) }, {data.get(1) } };
	}

}

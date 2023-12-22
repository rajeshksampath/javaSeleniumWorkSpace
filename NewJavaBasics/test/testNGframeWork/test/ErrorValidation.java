package testNGframeWork.test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import testNGframeWork.PageObjects.CartPage;
import testNGframeWork.PageObjects.CheckoutPage;
import testNGframeWork.PageObjects.ConfirmationPage;
import testNGframeWork.PageObjects.ProductCatalog;
import testNGframeWork.testComponents.BaseTest;

public class ErrorValidation extends BaseTest {

	@Test(groups= {"errorHandling"})
	public void LoginerrorValidation() throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		String productname = "zara coat 3";
		String country = "India";
		LandingPage.loginapplication("anshika@gmail.com", "Iamkin@000");
		Assert.assertEquals("Incorrect email or password.", LandingPage.geterrorMessage());
		
	}
	
	@Test
	public void ProducterrorValidation() throws InterruptedException
	{
		String productname = "zara coat 3";
		String country = "India";
		ProductCatalog productcatalog = LandingPage.loginapplication("seltester@gmail.com", "Iamexpert@000");
		List<WebElement> products = productcatalog.getmeProductList();
		productcatalog.addProductToCart(productname);
		CartPage cartpage = productcatalog.goToCart();
		Boolean match = cartpage.verifyProductDisplay("zara coat 33");
		Assert.assertTrue(match);
			
	}

}

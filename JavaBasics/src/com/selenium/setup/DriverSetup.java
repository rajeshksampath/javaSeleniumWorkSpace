
package com.selenium.setup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

	private WebDriver driver;

	public static String baseUrl = "http://webapps.tekstac.com/CustomerRegistration/";

	public WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\AssessmentWorkspace\\Customer Registration\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to(DriverSetup.baseUrl);

		return driver;

	}

}
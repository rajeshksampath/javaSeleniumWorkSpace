package com.selenium.tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.selenium.pages.CustomerForm;

import com.selenium.pages.DisplayCustomer;

import com.selenium.setup.DriverSetup;

import com.selenium.setup.ExcelUtils;

public class TestDisplayCustomer extends DriverSetup {

	WebDriver driver;

	DisplayCustomer displayCustomer;

	CustomerForm customerForm;

	public static String titletxt;

	public static String customerNametxt;

	public static String agetxt;

	public static String addresstxt;

	public static String numbertxt;

	public static String emailtxt;

	@BeforeClass

	public void setUp() {

		driver = getDriver();

		displayCustomer = new DisplayCustomer(driver);

		customerForm = new CustomerForm(driver);

	}

	@Test(dataProvider = "customerValid")

	public void testValidCustomerDetails(String customerName, String age, String address, String phoneNumber,
			String email) {

		customerForm.setCustomerName(customerName);

		customerForm.setAge(age);

		customerForm.setAddress(address);

		customerForm.setPhoneNumber(phoneNumber);

		customerForm.setEmail(email);

		customerForm.submitForm();

		titletxt = displayCustomer.getTitle();

		customerNametxt = displayCustomer.getName();

		agetxt = displayCustomer.getAge();

		addresstxt = displayCustomer.getAddress();

		numbertxt = displayCustomer.getPhoneNumber();

		emailtxt = displayCustomer.getEmail();

	}

	@DataProvider(name = "customerValid")

	public Object[][] getExcelData() throws Exception {

		Object[][] arrayExcelData = ExcelUtils.readExcelData("customer_valid");
		;

		return arrayExcelData;

	}

	@AfterClass

	public void closeBrowser() {

		driver.close();

	}

}
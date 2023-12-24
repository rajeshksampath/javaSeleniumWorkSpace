package com.selenium.tests;

import java.io.File;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import com.selenium.pages.CustomerForm;

import com.selenium.setup.DriverSetup;

public class TestCustomerForm extends DriverSetup {

	WebDriver driver;

	CustomerForm customerForm;

	static public String blankErrtxt;

	private static String filePath;

	private static String workingDir;

	private static FileInputStream excelFile;

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	@BeforeClass

	public void setUp() {

		driver = getDriver();

		customerForm = new CustomerForm(driver);

	}

	@Test(dataProvider = "customerInvalid")

	public void testInvalidCustomerDetails(String customerName, String age, String address, String phoneNumber,
			String email) {

		customerForm.setCustomerName(customerName);

		customerForm.setAge(age);

		customerForm.setAddress(address);

		customerForm.setPhoneNumber(phoneNumber);

		customerForm.setEmail(email);

		customerForm.submitForm();

		blankErrtxt = customerForm.getErrorMessage();

	}

	@DataProvider(name = "customerInvalid")

	public Object[][] getExcelData() throws Exception {

		Object[][] arrayExcelData = null;

		workingDir = System.getProperty("user.dir");

		filePath = workingDir + File.separator + "src" + File.separator + "customer_registration.xlsx";

		// "C:\\Users\\843896\\CCCAWorkspace\\selenium\\customer_registration.xlsx";

		excelFile = new FileInputStream(filePath);

		ExcelWBook = new XSSFWorkbook(excelFile);

		ExcelWSheet = ExcelWBook.getSheet("customer_invalid");

		arrayExcelData = new String[][] { { ExcelWSheet.getRow(1).getCell(1).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(2).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(3).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(4).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(5).getStringCellValue() } };

		return arrayExcelData;

	}

	@AfterClass

	public void closeBrowser() {

		driver.close();

	}

}

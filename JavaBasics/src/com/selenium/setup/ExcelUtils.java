package com.selenium.setup;

import java.io.File;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static FileInputStream excelFile;

	private static String filePath;

	public static Object[][] readExcelData(String sheetName) throws Exception {

		String[][] arrayExcelData = null;

		String workingDir = System.getProperty("user.dir");

		filePath = workingDir + File.separator + "src" + File.separator + "customer_registration.xlsx";

		// filePath =
		// "C:\\Users\\843896\\CCCAWorkspace\\selenium\\customer_registration.xlsx";

		excelFile = new FileInputStream(filePath);

		ExcelWBook = new XSSFWorkbook(excelFile);

		ExcelWSheet = ExcelWBook.getSheet(sheetName);

		arrayExcelData = new String[][] { { ExcelWSheet.getRow(1).getCell(1).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(2).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(3).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(4).getStringCellValue(),
				ExcelWSheet.getRow(1).getCell(5).getStringCellValue() } };

		return arrayExcelData;

	}

}

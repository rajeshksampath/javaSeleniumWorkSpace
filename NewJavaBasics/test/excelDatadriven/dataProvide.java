package excelDatadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {
	DataFormatter d = new DataFormatter(); // Class to format cell value and convert into string

	@Test(dataProvider = "driveTest")
	public void TestCaseData(String greet, String msg, String id) {
		System.out.println(greet + msg + id);

	}

	@DataProvider(name = "driveTest")
	public Object[][] getData() throws IOException {
		// Object[][] data = {{"hello","text","1"},
		// {"bye","message","2"},{"solo","call","345"}};
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\rajes\\Learning\\eclipse-workspace\\NewJavaBasics\\exceldriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);
		int rowcount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		short colCount = row.getLastCellNum();
		Object data[][] = new Object[rowcount - 1][colCount];
		for (int i = 0; i < rowcount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = d.formatCellValue(cell); // Converts integers to string
			}
		}
		return data;
	}

}

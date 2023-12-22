package excelDatadriven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
// Identify the test cases column by scanning the entire row.
	// Once column is identified then scan entire test cases column to identify
	// purchase test case row.
	// after you grab purchase test case row, pull the data of that row and feed
	// into test.

	public ArrayList<String> getData(String testcasename) throws IOException {
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("C:\\Users\\rajes\\Learning\\eclipse-workspace\\TestData.xlsx");
// fis -> is a class in Java where it will create an object which will have power to read any file.		
		// @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				// Identify the test cases column by scanning the entire row.
				Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows
				Row firstrow = rows.next();
				Iterator<Cell> cells = firstrow.cellIterator(); // row is collection of cells
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell value = cells.next();
					if (value.getStringCellValue().equalsIgnoreCase("test case")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);

				// Once column is identified then scan entire test cases column to identify
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
						// after you grab purchase test case row, pull the data of that row and feed
						// into test.
						Iterator<Cell> c = r.cellIterator();
						while (c.hasNext()) {
							
							Cell cv=c.next();
							if (cv.getCellTypeEnum()==CellType.STRING) // To handle numeric data
							{
							a.add(cv.getStringCellValue());
							}
							else
							{
								a.add(NumberToTextConverter.toText(cv.getNumericCellValue())); // To handle numeric data
							
							}
						}

					}

				}
			}
		}
		return a;
	}

	
}
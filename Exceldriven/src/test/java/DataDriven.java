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

public class DataDriven {
	
	public ArrayList<String> getData(String TestcaseName) throws IOException
	{
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();		
		
				FileInputStream fis = new FileInputStream("C:\\Users\\rajes\\Desktop\\Selenium\\Datadriven.xlsx");
				XSSFWorkbook workbook = new XSSFWorkbook(fis);

				int sheets = workbook.getNumberOfSheets();
				for (int i = 0; i < sheets; i++) {
					if (workbook.getSheetName(i).equalsIgnoreCase("input")) {
						XSSFSheet sheet = workbook.getSheetAt(i);
						Iterator<Row> rows = sheet.iterator();
						Row firstrow = rows.next();
						Iterator<Cell> cells = firstrow.cellIterator();
						int k = 0;
						int column = 0;
						while (cells.hasNext()) {
							Cell value = cells.next();
							if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
								/// on the desired cell;
								column = k;
							}
							k++;

						}
						//System.out.println(column);
						while (rows.hasNext()) {
							Row rv = rows.next();
							if (rv.getCell(column).getStringCellValue().equalsIgnoreCase(TestcaseName)) {
								Iterator<Cell> cv = rv.cellIterator();
								while (cv.hasNext()) {
									Cell val = cv.next();
									if(val.getCellTypeEnum()==CellType.STRING)
									{
										a.add(val.getStringCellValue());
									}
									else
									{
										a.add(NumberToTextConverter.toText(val.getNumericCellValue()));
										
									}
									
								}
							}

						}

					}

				}
				return a;
	}

	public static void main(String[] args) throws IOException {
		

	}
}

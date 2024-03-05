package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Wrappermethods {



		public static String[][] getSheet(String fileName, String sheetname)  {
	
			String[][] data = null;
	
			try {
	
				FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\OneDrive\\Documents\\obe\\hotel.xlsx"));
	
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheet(sheetname);
	
				// get the number of rows
				int rowCount = sheet.getLastRowNum();
	
				// get the number of columns
				int columnCount = sheet.getRow(0).getLastCellNum();
				data = new String[rowCount][columnCount];
	
				// loop through the rows
				for (int i = 1; i < rowCount + 1; i++) {
					try {
						XSSFRow row = sheet.getRow(i);
						for (int j = 0; j < columnCount; j++) { // loop through the
							// columns
							try {
								String cellValue = "";
								try {
									if (cellValue != null) {
										cellValue = row.getCell(j).getStringCellValue();
									}
								} catch (NullPointerException e) {
	
								}
	
								data[i - 1][j] = cellValue; // add to the data array
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					fis.close();
				}
	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
	
	
	}

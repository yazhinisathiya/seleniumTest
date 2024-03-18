package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample {

	public static void main(String[] args) throws IOException {
		
		String filePath="./Data1.xlsx";
		
		String sheetName="Sheet1";
		
		File src= new File(filePath);
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb1= new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb1.getSheet(sheetName);
		
		int rowCount = sheet1.getLastRowNum();
		
		int columnCount = sheet1.getRow(0).getLastCellNum();
		
		 for (int i = 0; i < rowCount+1; i++) {
		        Row row = sheet1.getRow(i);
		        for (int j = 0; j < columnCount; j++) {
		        	
		        	System.out.println(row.getCell(j).toString());
		        	
		        	
		          //  data[i][j] = row.getCell(j).toString();
		        }
		    }
		

	}
}

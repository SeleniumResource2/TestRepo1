package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AccessExcel {
	
	String path = "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Basics04072018\\Sample.xlsx";
	
	//All index starts from zero ==> either rows or columns
	//extension of excel is xlsx then XSSF prefix should be used
	//extension of excel is xls then HSSF prefix should be used
	
	// Hierarchy of excel : WorkBook-> worksheet=> rows ==> column/cell
	public void readData(int rownum, int colnum) throws IOException{
		//Go to the file location
		FileInputStream fis = new FileInputStream(path);
		
		//goto workbook
		
		XSSFWorkbook w = new XSSFWorkbook(fis);
		
		//go to sheet
		
		XSSFSheet s = w.getSheet("TestData");
		
		//go to rows
		
		XSSFRow r = s.getRow(rownum);
		
		//go to cell or column
		
		XSSFCell c = r.getCell(colnum);
		
		String value = c.getStringCellValue();
		
		System.out.println("Value at the specified cell is : " + value);
		
	}
	
	public static void main(String[] args) throws IOException {
		AccessExcel ob = new AccessExcel();
		ob.readData(1, 3);
		
	}

}

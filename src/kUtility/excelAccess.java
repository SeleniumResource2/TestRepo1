package kUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelAccess {
	
	private static XSSFWorkbook w;
	private static XSSFSheet s;
	private static XSSFRow r;
	private static XSSFCell c;
	
	public void openExcel(String path) throws IOException{
		FileInputStream fis = new FileInputStream(path);
		w = new XSSFWorkbook(fis);
		s = w.getSheet("TestCase");
	}
	
	public String fetchData(int rownum, int colnum){
		c = s.getRow(rownum).getCell(colnum);
		String value = c.getStringCellValue();
		return value;
		
	}

}

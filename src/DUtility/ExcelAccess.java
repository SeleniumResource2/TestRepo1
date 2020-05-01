package DUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAccess {
	
	/**Hierarchy of excel
	 * Workbook=>worksheet=>rows=>cells
	 * @throws IOException 
	 * 
	 */
	
	private static XSSFWorkbook w;
	private static XSSFSheet s;
	private static XSSFRow r;
	private static XSSFCell c;
	
	static String path = "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\DTestData\\TestData.xlsx";
	//access the excel
	public static void openExcel() throws IOException{
		FileInputStream fis = new FileInputStream(path);
		w = new XSSFWorkbook(fis);
		s = w.getSheet("Credentials");		
	}
	
	//read the values from excel
	public static  String getCellData(int rownum, int cellnum) throws IOException{
		openExcel();
		r = s.getRow(rownum);
		c = r.getCell(cellnum);
		String value = c.getStringCellValue();
		System.out.println("Value of corresponding cell with " + rownum + " and " + cellnum + "===>" + value);
		return value;
	}
	
	//write the values in excel
	public void writeData(int rownum, int cellnum) throws IOException{
		c = s.getRow(rownum).createCell(cellnum); //passing the corresponding cell that need to be created
		
		c.setCellValue("Result"); //specifying what should be the column header
		FileOutputStream fos = new FileOutputStream(path);
		w.write(fos);
		fos.flush();
	}
	
	public static void main(String[] args) throws IOException {
		ExcelAccess ob = new ExcelAccess();
		ob.getCellData(2, 0);
		ob.writeData(0, 2);
	}

}

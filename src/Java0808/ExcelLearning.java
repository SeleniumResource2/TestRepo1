package Java0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLearning {

	/*
	 * Workbook=>worksheet=>rows==>cells excel ==>xlsx[XSSF] ==>XLS [HSSF]
	 * Difference between throw, throws
	 */
	
	/*public void sample(){
		try {
			Exception e = new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}*/
	
	private static XSSFWorkbook w;
	private static XSSFRow r;
	private static XSSFCell c;
	private static XSSFSheet s;
	private String path = "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Java0808\\SampleOne.xlsx";
	String val;
	public void access() throws IOException{
		FileInputStream fis = new FileInputStream(path);
		 w = new XSSFWorkbook(fis);
		 s = w.getSheet("TestData");
	}
	
	public int getRow() throws IOException {
		access();	
		int rr = s.getLastRowNum();
		return rr;
	}

	public int getCol(int rownum) throws IOException {
		access();
		XSSFSheet s = w.getSheet("TestData");
		XSSFRow r = s.getRow(rownum);
		int cc = r.getLastCellNum();
		return cc;
	}
	
	public String readExcel(int rownum, int colnum) throws IOException{
		
		c = s.getRow(rownum).getCell(colnum);
		String value = c.getStringCellValue();
		return value;
		
	}
	
	public String readAll() throws IOException{
		access();
		int irow = s.getPhysicalNumberOfRows();
		System.out.println(irow);
		 for(int i=0; i<irow; i++){
				r = s.getRow(i);
				int jcol = r.getPhysicalNumberOfCells();
				System.out.println(jcol);
				for(int j=0; j<jcol; j++){
					c = r.getCell(j);
					val = c.getStringCellValue();
					System.out.println(val);
				}
			}
		return val;
	
	}
	
	public void writeData(String dataToWrite[]) throws IOException{
		FileInputStream fis = new FileInputStream(path);
		Workbook w1 = new XSSFWorkbook(fis);
		Sheet s1 = w1.getSheet("TestData");
		Row r1 = s1.getRow(0);
		int colToWrite = r1.getPhysicalNumberOfCells();
		int totRow = s1.getPhysicalNumberOfRows();
		for(int i =0; i<totRow; i++){
		Cell c1 = r1.createCell(colToWrite+1);
		c1.setCellValue(dataToWrite[i]);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Java0808\\SampleOne.xlsx");
		w1.write(fos);
		fos.close();
		w1.close();
		}
	}
	


	
	public static void main(String[] args) throws IOException {
		ExcelLearning ob = new ExcelLearning();
		//System.out.println("Number of rows " + ob.getRow() + "\n" + "Number of columns " + ob.getCol(2));
		//System.out.println(ob.readExcel(0,0));
		System.out.println(ob.readAll());
		String[] valueToWrite = {"Experience", "Yes", "No", "Yes", "Yes"};
		ob.writeData(valueToWrite);
	}

}

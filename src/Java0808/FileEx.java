package Java0808;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileEx {
	
	public void access() throws FileNotFoundException  {
		File f= new File("C:\\Users\\manju\\Desktop\\Selenium");
		
//To validated whether it is a directory or not
		boolean dir = f.mkdirs();
	System.out.println(dir);
	String[] s = f.list();//to find out or locate the files that exist in the specified path
	
	for(String ss:s){ //Fetch each file as string and print out the file names
		System.out.println(ss);
	}
	}
	
	public static void main(String[] args) throws FileNotFoundException  {
		FileEx ob = new FileEx();
		ob.access();
		
				
	}
}

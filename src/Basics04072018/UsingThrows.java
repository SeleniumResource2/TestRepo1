package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UsingThrows {
	
	public void display() throws FileNotFoundException, InterruptedException{
		String Path = "C:\\Users\\manju\\Desktop\\Sample1.txt";
		FileInputStream fis = new FileInputStream(Path);//Compile time exception
		System.out.println("File exist....");
		Thread.sleep(5000);//Compile time exception
		int a = 20/2; //Run-time Exception
		System.out.println("Validation of operator ==> Addition");
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		UsingThrows ob =new UsingThrows();
		ob.display();
	}

}
/*
 * Exceptions: Something that is abnormal. Exceptional case
 * 
 * Types of Exception:
 * 
 * 1. Checked Exception: Exception that occurs during compile time
 * 2. Un-Checked Exception: Exception that occurs during run-time
 * 3. Error: These are the one that cannot be handled eg: issues that occur due to memory space-Stack overflow error
 * 
 * Checked Exception and Un-Checked Exception can be handled
 * 
 * Ways to handle the exception:
 * 1. Using throws
 * 2. Try-Catch
 * 3. Multiple TryCatch
 * 4. Try-Catch Finally
 * 
 * For accessing file, or reading data from the file or writing data to the file we need to use the file related classes:
 * File, FileInputStream, FileOutputStream, FileWriter, FileReader, BufferedReader
 * 
 * 
 */

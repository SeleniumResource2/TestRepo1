package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excep1 {
	
	public void Access() throws FileNotFoundException, InterruptedException{
		//Compile time exception
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\abcd123sfsdf.txt");
		System.out.println("Validation of files....");
		//compile time exception
		Thread.sleep(1000);
		System.out.println("Validation of pausing the execution...");
		//Run time exception
		int b = 20;
		b = b/0;
		System.out.println("Validation of Arithmetic...");
		
		//Run time exception
		
		int[] a= new int[2];
		a[0] = 21;
		a[1] = 23;
		
		System.out.println("value of a is : " + a[2]);
		
		
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// TODO Auto-generated method stub
		Excep1 ob = new Excep1();
		ob.Access();
	}
	
	/**
	 * Exception is the parent class for all exception
	 * 
	 * Exception: 
	 * Checked Exception- Compile Time Exception - We can handle
	 * Un-Checked Exception- Run-Time exception - We can handle
	 * Error- [Stack over flow error] We cannot handle
	 * 
	 * How can we handle Exception: 1. Using throws 2. Try-Catch 3. Try-Catch-Finally
	 */

}

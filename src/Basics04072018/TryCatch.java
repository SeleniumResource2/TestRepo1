package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
	
	public void display(){
		
		
		try {
			String Path = "C:\\Users\\manju\\Desktop\\Sample1.txt";
			FileInputStream fis = new FileInputStream(Path);//Compile time exception
			System.out.println("File exist....");
			Thread.sleep(5000);//Compile time exception
			int a = 20/0; //Run-time Exception
			System.out.println("Validation of operator ==> Addition");
		} catch(Exception e){ //Third catch block
			System.out.println(e.getMessage());
		} 
		
	}
	
	public static void main(String[] args) {
		TryCatch ob = new TryCatch();
		ob.display();
	}
	/*
	 * Syntax: 
	 * try{
	 * 
	 * } catch(<Exception Name> e){
	 *  e.printStackTrace;
	 *  }
	 *  
	 *  Exception is the parent class which can take hold of all the child exception that comes across.
	 *  Child Exception -> NullpointerException, FileNotFoundException, ArrayIndexOutofBoundException, 
	 *  TypeMisMatchException, NoSuchElementException, classCastException, InvalidInputSelectorException, WebDriverException..
	 */

}

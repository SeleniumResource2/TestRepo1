package Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPerspective {
	
	public void display() throws Exception {
		//File related classes==> FileInputStream, FileOutputStream, File, FileReader, BufferedReader
		
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Exp.txt");
		System.out.println("File exist");
		Thread.sleep(3000);
		int i = 10;
		i=10/2;
		System.out.println("Arithmetic exception found " );
		
		/*String s = null;
		System.out.println(s.length());
		//Provies null pointed exception*/
		
		String s1 = "90";
		int j = Integer.parseInt(s1);
		System.out.println(j);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExceptionPerspective ob = new ExceptionPerspective();
		ob.display();
	}

}
/**
 * Java exception key words:
 * try / catch / finally / throw / throws
 * 
 */

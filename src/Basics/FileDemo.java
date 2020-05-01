package Basics;

import java.io.File;

import java.io.IOException;

public class FileDemo {
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	File f = new File("javatest.txt");
	boolean fileExist = f.exists(); //To check the presence of the file
	System.out.println("Does file exists in currect working directory : " + fileExist);
	f.createNewFile(); //Method to create the file on absence
	fileExist = f.exists(); 
	System.out.println("Does File exist after creation " + fileExist);
	
	
	}

}

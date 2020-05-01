package Basics;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\manju\\Desktop\\Testing\\", "abcd123.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		//To list out all the files in the corresponding folder
		File f1 = new File("C:\\Users\\manju\\Desktop\\Testing\\");
		int count = 0;
		String[] s = f1.list();
		
		for(String s1:s){
			count++;
			System.out.println(s1 + " Bytes " + f1.length() + " Absoulte path of the file " + f1.getAbsolutePath());
		}
		System.out.println("Total files available are : " + count);
	}
	
	

}

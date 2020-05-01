package Basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("C:\\Users\\manju\\Desktop\\Testing\\");
		File f = new File(f1, "abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Welcome to File I/O");
		
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String result;
		while((result = br.readLine())!=null){
			System.out.println(result);
		} 
		br.close();
	}

}

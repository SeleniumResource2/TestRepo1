package Java0808;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
	 //file write, file creation
		File f = new File("//SampleProject//src//Java0808//hello.txt");
		
		boolean b = f.createNewFile();
		System.out.println(b);
	}
}

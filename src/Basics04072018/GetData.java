package Basics04072018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetData {
	/*For accessing any file or reading file or writing into the file we need to access the class called
	 * File, FileInputStream, FileOutputStream, FileReader, BufferedReader
	 */
	
	public void Access() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Basics04072018\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("URL");
		System.out.println("Value for URL is " + value);
	}
	
	//To make it dynamic
	
	public String AccessOne(String propertyname) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Basics04072018\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(propertyname);
		System.out.println("Value of the property==> " + propertyname + "==>" + value);
		return value;
	}
	
	public static void main(String[] args) throws IOException {
		GetData ob = new GetData();
		ob.Access();
		ob.AccessOne("browser");
		ob.AccessOne("username");
		ob.AccessOne("password");
	}
}

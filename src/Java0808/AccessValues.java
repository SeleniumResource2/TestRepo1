package Java0808;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AccessValues {
	
	public String getValues(String propertyName) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\Java0808\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(propertyName);
		//System.out.println("Value accessed : " + data);
		return data;
	}

	public static void main(String[] args) throws IOException {
		AccessValues ob = new AccessValues();
		System.out.println(ob.getValues("URL") + "\n" + ob.getValues("Browser") + "\n" + ob.getValues("OperatingSystem"));
		
	}
}

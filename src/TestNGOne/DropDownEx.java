package TestNGOne;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownEx {
	
	public WebDriver driver;
	
	@Test
	public void testOne() throws IOException{
		driver = new FirefoxDriver();
		
		String url = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(url);
		
		//enter first name in text box
		driver.findElement(By.name("firstName")).sendKeys("Jayashree");
		//enter last name
		driver.findElement(By.name("lastName")).sendKeys("Haritha");
		//enter phone no
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9999993435");		
		
		//For selecting values in dropdown, we should use select class
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select drpdwn = new Select(country);
		//Get total options
			
		//select by value
		
		drpdwn.selectByValue("ANGOLA");
		
		//select by visible text
		
		drpdwn.selectByVisibleText("BRITISH VIRGIN ISLANDS");
		
		//select by index
		
		drpdwn.selectByIndex(6); //Antartica
		
		
		//we have an interface called "TakeScreenShot"
		
		TakesScreenshot ts =  (TakesScreenshot)driver ;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\manju\\Desktop\\Training\\" + "TestSCreenShot" + ".jpg"));
		
		 WebElement firstSelected = drpdwn.getFirstSelectedOption();
		  
		 List<WebElement> allValues = drpdwn.getOptions();
		 
		 int total = allValues.size();
		 System.out.println("Total contries available are : " + total);
		 	for(int i =0; i<total; i++){
		 		WebElement index = allValues.get(i);
		 		String indexBase = index.getText();
		 		if(indexBase.equalsIgnoreCase("India")){
		 			drpdwn.selectByVisibleText(indexBase);
		 		}
		 	}
	}

}

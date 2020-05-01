package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathCombinations {
	public WebDriver driver;
	
	public void access(){
		driver = new FirefoxDriver();
		
		String url = "http://demo.guru99.com/test/newtours/register.php";
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Arpitha");
		
		
		
	}

}

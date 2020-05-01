package TestNGOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HealthCare {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	
	public void testOne(String browser){
		if(browser.equals("Firefox")){
		driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");			
			driver = new ChromeDriver();
		}else if(browser.equals("iexplore")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\IEDriverServer.exe");			
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.healthcarevolunteer.com");
		String s = driver.getTitle();
		System.out.println("title displayed is :" + s);
		driver.quit();
	}

}

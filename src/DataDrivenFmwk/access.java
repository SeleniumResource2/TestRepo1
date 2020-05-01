package DataDrivenFmwk;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import DLoginPage.LoginPage;
import DUtility.ExcelAccess;

public class access {
	
	public static WebDriver driver;	
	
	@BeforeMethod
	public void openBrowser() {		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.get("https://www.healthcarevolunteer.com/");	
		driver.manage().window().maximize();		
	}
	
	@Test
	public void validCredentials() throws IOException{		
		String userName = ExcelAccess.getCellData(1, 0);
		String password = ExcelAccess.getCellData(1, 1);
		LoginPage.txtUser(driver).sendKeys(userName);
		LoginPage.txtPass(driver).sendKeys(password);
		LoginPage.clkLogin(driver).click();
		String Atitle = driver.getTitle();
		//validation is performed by using assertions
		Assert.assertTrue(Atitle.equalsIgnoreCase("HealthCare Volunteer - My Account"), "Failure on accessing app with valid credentials");
	}
	
	@Test
	public void inValidCredentials() throws IOException{		
		String userName = ExcelAccess.getCellData(2, 0);
		String password = ExcelAccess.getCellData(2, 1);
		LoginPage.txtUser(driver).sendKeys(userName);
		LoginPage.txtPass(driver).sendKeys(password);
		LoginPage.clkLogin(driver).click();
		String Atitle = driver.getTitle();
		//validation is performed by using assertions
		Assert.assertFalse(Atitle.equalsIgnoreCase("HealthCare Volunteer - My Account"), "Failure on accessing app with Invalid credentials");
		
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
		driver.quit();
	}

}

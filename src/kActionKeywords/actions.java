package kActionKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class actions {

	public static WebDriver driver;
	
	public static void openBrowser(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");		
		driver = new ChromeDriver();	
	}
	
	public static void accessAppln(){
		driver.get("https://www.healthcarevolunteer.com/");	
		driver.manage().window().maximize();		
	}
	
	public static void txtUserName(){
		driver.findElement(By.name("user")).sendKeys("testingtrainer01@gmail.com");
	}
	
	public static void txtPassword(){
		driver.findElement(By.name("pass")).sendKeys("Selenium10");
	}
	
	public static void clkLogin(){
		driver.findElement(By.tagName("button")).click();
	}
	
	public static void verifyTitle(){
		String expectedURL = "https://www.healthcarevolunteer.com/volunteers/main.php?singlelogin=y";
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
	}
}

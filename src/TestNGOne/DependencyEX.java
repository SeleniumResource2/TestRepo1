package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyEX {
	public WebDriver driver;
	
	//@Test(description= "Validation of application login page")
	public void testOne(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
	
		driver = new ChromeDriver();

		
		driver.get("https://www.healthcarevolunteer.com/");

		driver.manage().window().maximize();
		
		
		WebElement UserName = driver.findElement(By.name("user"));
		UserName.sendKeys("testingtrainer01@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("Selenium10");
		driver.findElement(By.cssSelector("button.login")).click();
		driver.quit();
		
	}
	
	//	@Test(invocationCount = 5)
		public void testTwo(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.healthcarevolunteer.com/");
			driver.manage().window().maximize();
			WebElement UserName = driver.findElement(By.name("user"));
			UserName.sendKeys("testingtrainer01@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("Selenium10");
			driver.findElement(By.cssSelector("button.login")).click();
			driver.quit();
			
		}

		@Test
		public void openBrowser(){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
			driver = new ChromeDriver();		
		}
		
		@Test(dependsOnMethods = {"openBrowser"})
		public void passAppUrl(){
		driver.get("https://www.healthcarevolunteer.com/");
		driver.manage().window().maximize();
		}
		
		@Test(dependsOnMethods = {"passAppUrl"})
		public void enterCredentials(){
			WebElement UserName = driver.findElement(By.name("user"));
			UserName.sendKeys("testingtrainer01@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("Selenium10");
			driver.findElement(By.cssSelector("button.login")).click();
			driver.quit();

		}
}

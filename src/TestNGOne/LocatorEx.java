package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {
	WebDriver driver;
	public void access(){	
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");

		
		driver = new ChromeDriver();
		
		driver.get("https://www.healthcarevolunteer.com/");
		
		driver.manage().window().maximize();
		//by xpath
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("testingtrainer01@gmail.com");
		//by name
		driver.findElement(By.name("pass")).sendKeys("Selenium10");
		//by tag name
		//driver.findElement(By.tagName("button")).click();
		driver.findElement(By.cssSelector("button.login")).click();
		driver.navigate().back();
		//by linktext
		driver.findElement(By.linkText("About Us")).click();
		//by class name
		driver.findElement(By.className("txtsearch")).sendKeys("apple");
		//xpath contains
		driver.findElement(By.xpath("//input[contains(@src, 'btn_search')]")).click();
		//by partial link text
		driver.findElement(By.partialLinkText("ual Repo")).click();
		driver.get("https://www.facebook.com");
		//By ID
		driver.findElement(By.id("email")).sendKeys("Testing");
		//by css selector
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
			
		
		
	}
	
	public static void main(String[] args) {
		new LocatorEx().access(); //nameless object
	}

}

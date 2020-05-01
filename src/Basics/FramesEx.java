package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesEx {
	
	@Test
	public void access(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("2354435435");
		driver.findElement(By.cssSelector("img[alt='continue']")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("Testing234");
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("1111111");
	
	}

}

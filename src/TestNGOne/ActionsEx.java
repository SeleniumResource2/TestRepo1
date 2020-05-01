package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsEx {
	//specifies the mouse events
	//leftclick, right click, click, doubleclick
	//All mouse events are taken up by actions class
	public WebDriver driver;
	
	@Test
	public void accessMenu() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");

		// open chrome browser
		driver = new ChromeDriver();
		
		driver.get("https://www.fita.in/");
		Thread.sleep(10000);
		//driver.findElement(By.cssSelector("i.spu-icon spu-icon-close")).click();
		
		WebElement course = driver.findElement(By.linkText("Courses"));
		Actions act = new Actions(driver);
		
		act.moveToElement(course).perform();
		
		WebElement BigData = driver.findElement(By.xpath("(//li//a[contains(@href, 'big')])[1]"));
		
		act.moveToElement(BigData).perform();
		
		WebElement r_training=driver.findElement(By.xpath("(//li//a[@href = 'https://www.fita.in/r-training-chennai/'])[1]"));
		
		act.moveToElement(r_training).click();
	}

}

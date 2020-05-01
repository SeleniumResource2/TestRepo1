package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestOne {
	
	//scroll event
	public WebDriver driver;
	
	@Test
	public void scrollEvent(){
		
		driver = new FirefoxDriver();
		driver.get("http://www.healthcarevolunteer.com");
		driver.findElement(By.name("user")).sendKeys("HarishKrishna");
		WebElement footerText = driver.findElement(By.xpath("//*[@id='main']/center"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("scroll(0, 400)");
		//je.executeScript("arguments[0].scrollIntoView(true)", footerText);
		
		String textAssigned = footerText.getText();
		
		System.out.println(textAssigned);
		
	}

}

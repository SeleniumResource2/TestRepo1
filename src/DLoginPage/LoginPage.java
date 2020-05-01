package DLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	
	public static WebElement element = null;
	
	public static WebElement txtUser(WebDriver driver){
		return element = driver.findElement(By.name("user"));		
	}
	
	public static WebElement txtPass(WebDriver driver){
		return element = driver.findElement(By.name("pass"));		
	}

	public static WebElement clkLogin(WebDriver driver){
		return element = driver.findElement(By.tagName("button"));
		
	}
}

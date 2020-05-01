package TestNGOne;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.Test;

public class AlertEx {

	// browser based alert or window based alert[third party tool-AutoIT,
	// Sikuli]
	// Alert is an interface
	// Simple alert is just an information to the end user
	// Prompt alert is the one ask us to input a value in a text box
	// Confirmation alert is the one helps to accept or dismiss
	@Test
	public void accessAlert() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();

		Alert al = driver.switchTo().alert();

		String msg1 = al.getText();

		System.out.println(msg1 + "===>   First alert message");

		al.accept();

		String msg2 = al.getText();
		
		System.out.println(msg2 + "===>   Second alert message");

		al.accept();
		driver.quit();
	}
	
	@Test
	public void accessAlertOne() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();

		Alert al = driver.switchTo().alert();

		String msg1 = al.getText();

		System.out.println(msg1 + "===>   First alert message");

		al.dismiss();

		driver.quit();
	}

}

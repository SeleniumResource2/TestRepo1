package TestNGOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitEx {

	/*
	 * Three different types" 1. Implicit wait: 2. Explicit wait 3. Fluent wait
	 */
	public WebDriver driver;

	@Test
	public void testOne() {

		driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.findElement(By.name("fname")).sendKeys("Gayathri");
		driver.findElement(By.id("check3")).click();
		driver.findElement(By.cssSelector("input[value='female']")).click();

		WebElement drpdwn = driver.findElement(By.id("Carlist"));
		Select drp = new Select(drpdwn);
		drp.selectByVisibleText("Audi");

		WebElement lastName = driver.findElement(By.name("lname"));
		// Explicit wait
		WebDriverWait One = new WebDriverWait(driver, 20);
		One.until(ExpectedConditions.elementToBeClickable(lastName));

		lastName.sendKeys("Jayakannan");

		// implicit wait

		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		driver.navigate().to("https://www.hdfcbank.com/");

		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("LoanDetails");
		driver.findElement(By.cssSelector("div.sf-searchicon")).click();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.navigate().refresh();
		driver.findElement(By.name("fname")).sendKeys("Sathya");

		driver.findElement(By.id("check3")).click();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Ways to override stale element reference exception
		for (int i = 0; i <= 3; i++) {

			WebElement last = driver.findElement(By.name("lname"));
			last.sendKeys("Janarathanan");
			break;
		}

		driver.findElement(By.cssSelector("input[value='female']")).click();
	}

}

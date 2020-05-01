package TestNGOne;

import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	public WebDriver driver;
	@Test
	public void access() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		//Parent window
		driver.get("http://www.popuptest.com/goodpopups.html");
		//child window- First link
		driver.findElement(By.linkText("Good PopUp #4")).click();
		//child window- Second link
		driver.findElement(By.linkText("Good PopUp #2")).click();

		Set<String> allWindows = driver.getWindowHandles();
		java.util.Iterator<String> itr = allWindows.iterator();
		
		String ptID = itr.next();
		System.out.println("Parent :" + ptID);
		String chID2 = itr.next();
		System.out.println("Child two:" + chID2);
		String chID4 = itr.next();
		System.out.println("Child one :" + chID4);
		
		driver.switchTo().window(ptID);
		String pTitle = driver.getTitle();
		System.out.println("Parent title is : " + pTitle);
		Thread.sleep(2000);
		
		driver.switchTo().window(chID2);
		String cTitle = driver.getCurrentUrl();
		System.out.println("Child window title : " + cTitle);
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(chID4);
		String c4Title = driver.getCurrentUrl();
		System.out.println("Child window title : " + c4Title);
		Thread.sleep(2000);
		driver.close();
		//moving back to parent window
		driver.switchTo().window(ptID);
		System.out.println("Switched back to parent window :" + driver.getTitle());
		Thread.sleep(2000);
	}
	
	

}

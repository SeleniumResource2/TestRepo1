package TestNGOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDropEx {
	
	public WebDriver driver;
	
	@Test
	public void access(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//different type of clicks==> click, doubleclick, contextclick, draganddrop [Actions]
		WebElement from1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement to1 = driver.findElement(By.cssSelector("ol[id='bank']"));
		
		WebElement from2 = datasFetched("5000");
		WebElement to2 = driver.findElement(By.id("amt7"));
		
		WebElement from3 = datasFetched("SALES");
		WebElement to3 = driver.findElement(By.cssSelector("ol[id='loan']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(from1, to1).perform();
		
		act.dragAndDrop(from2, to2).perform();
		
		act.dragAndDrop(from3, to3).perform();
		
		WebElement to4 = driver.findElement(By.cssSelector("ol[id='amt8']"));
		
		act.dragAndDrop(from2, to4).perform();
		
		WebElement perfect = driver.findElement(By.cssSelector("div.table4_result a"));
		
		Assert.assertTrue(perfect.isDisplayed());
		
	}
	
	
	public WebElement datasFetched(String name){
		WebElement ell = null;
		List<WebElement> values = driver.findElements(By.xpath("//ul//following-sibling::a"));
		
		for(WebElement el: values){
			if(el.getText().trim().contains(name)){
				ell= el;
			}
		}
		return ell;
	}

}

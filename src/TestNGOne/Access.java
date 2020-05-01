package TestNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Access {

	// instance created for webdriver

	public WebDriver driver;

	@Test
	public void ChromeEX() {
		// chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\Library\\chromedriver.exe");

		// open chrome browser
		driver = new ChromeDriver();

		// pass the url in browser
		driver.get("https://www.healthcarevolunteer.com/");
		//maximize the window
		driver.manage().window().maximize();
		
		// Enter user name[locate the element.passing the action
		WebElement UserName = driver.findElement(By.name("user"));
		UserName.sendKeys("testingtrainer01@gmail.com");
		
		String sAtt1 = UserName.getAttribute("placeholder");//Already pre-defined values for the coresponding attribuate is fetched
		System.out.println(sAtt1);

		String sAtt2 = UserName.getAttribute("value");//Whatever the user provide an input, that will be fetched
		System.out.println(sAtt2);
		// By is a predefined class
		// Enter password
		driver.findElement(By.name("pass")).sendKeys("Selenium10dfsdfsdf");
		
		//To clear the alerady existing value
		driver.findElement(By.name("pass")).clear();
		
		//Retype the right credentials
		driver.findElement(By.name("pass")).sendKeys("Selenium10");
		
		
		// click login button....Syntax of xpath
		// =>//tagname[@attribute='attributevalue']
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String s = driver.getTitle();

		if (s.contains("My Acc")) {
			System.out.println("Logged in with valid credentials");
		} else {
			System.out.println("Logged in with invalid credentials");
		}
		
		String sURL = driver.getCurrentUrl();
		System.out.println("URL is : " + sURL);
		
/*		String sPgSource = driver.getPageSource();
		System.out.println("Page source is : " +sPgSource);*/
		
//Navigate to other website
		driver.get("https://www.facebook.com"); //one option - wait until the page is getting loaded
		driver.navigate().to("https://wwww.google.co.in"); //second option // will not wait for page load
		//go backward
		driver.navigate().back();//facebook
		//go forward
		driver.navigate().forward();//google page
		//refresh the web page
		driver.navigate().refresh();
		
		//navigate to face book
		driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		
		//select radio button or checkbox
		
		WebElement car = driver.findElement(By.id("check2"));
		//select the checkbox
		 car.click();
		 
		 boolean select = car.isSelected();
		 System.out.println("After selected : " + select);
			//unselect the checkbox
		 car.click();
		 boolean unselect = car.isSelected();
		 System.out.println("After selected : " + unselect);
		 
		 boolean display = car.isDisplayed();
		 boolean enable = car.isEnabled();
		 
		 System.out.println("Displayed of webelement : " + display);
		 System.out.println("Enable mode of webelement :" + enable);
		
		//validation can be done on a webelement whether it is enabled, displayed or selected. Return is boolean for all three method

	}
	
	@AfterMethod
	public void TearDown(){
		driver.close();//Closses the current focussed browser
		driver.quit(); // closes all the sessions created by webdriver
	}

}

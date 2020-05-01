package kExecutionFmwk;

import java.io.IOException;
import org.testng.annotations.Test;
import kActionKeywords.actions;
import kUtility.excelAccess;

public class driverScript {
	
	@Test
	public void validCredential() throws IOException{
		excelAccess Excel = new excelAccess();		
		Excel.openExcel("C:\\Users\\manju\\Desktop\\Selenium\\SampleProject\\src\\kTestData\\TestData.xlsx");
		for(int i = 1; i<7; i++){
		String keys = Excel.fetchData(i, 4);		
		if(keys.equalsIgnoreCase("openBrowser")){
			actions.openBrowser();
		}else if(keys.equalsIgnoreCase("accessAppln")){
			actions.accessAppln();
		}else if(keys.equalsIgnoreCase("txtUserName")){
			actions.txtUserName();
		}else if(keys.equalsIgnoreCase("txtPassword")){
			actions.txtPassword();
		}else if(keys.equalsIgnoreCase("clkLogin")){
			actions.clkLogin();
		}else if(keys.equalsIgnoreCase("verifyTitle")){
			actions.verifyTitle();
		}		
		}
	}
}

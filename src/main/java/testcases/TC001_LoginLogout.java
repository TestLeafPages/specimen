package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName = "TestData";
	}
	
	@Test(dataProvider="sendData")
	public void runLoginLogout(String uName, String pass) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pass)
		.clickLogin()
		.clickLogout();
		
		
		
		/*LoginPage obj = new LoginPage();
		obj.enterUserName();
		obj.enterPassword();
		obj.clickLogin();*/
		
		
		
		
		
		
		
		
	}
	
}

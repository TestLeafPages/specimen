package pages;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUserName(String userName) {
		driver.findElementByName("USERNAME").sendKeys(userName);
		return this;
	}
	
	public LoginPage enterPassword(String password) {
		driver.findElementById("password").sendKeys(password);
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
//		HomePage obj = new HomePage();
//		return obj;
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	

}

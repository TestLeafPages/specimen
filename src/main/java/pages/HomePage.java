package pages;

import seleniumBase.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}
	
	
	
	
	
	
	
	
	
	

}

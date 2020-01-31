package seleniumBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.LearnReadExcel;



public class ProjectSpecificMethods {
	public String excelFileName;
	public static ChromeDriver driver;
//	@Parameters({"url","uName","password"})
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {

		LearnReadExcel excel = new LearnReadExcel();
		String[][] data1 = excel.readExcel(excelFileName);
		
		return data1;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

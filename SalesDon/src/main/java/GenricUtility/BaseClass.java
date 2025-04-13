package GenricUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import POM.VtigerLoginTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		Property_Utility pu=new Property_Utility();
		String bName = pu.SetBrowser("Browser");
				
				
				//SetBrowser("Browser");
		
		if(bName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		System.out.println("Browser Launch Successfully");
	}
	@BeforeMethod
	public void BM() throws IOException {
		Property_Utility pu=new Property_Utility();
		String URL = pu.SetBrowser("url1");
		String USER = pu.SetBrowser("data1");
		String PASS = pu.SetBrowser("data2");
		driver.get(URL);
		
		VtigerLoginTest vt=new VtigerLoginTest(driver);
		vt.getKeyValue(USER, PASS);
		
				                               
	}
	@AfterMethod
	public void AM() {
		VtigerLoginTest vt=new VtigerLoginTest(driver);
		vt.Logout();
	}
	@AfterClass
	public void Ac() {
		driver.close();
	}
	

}

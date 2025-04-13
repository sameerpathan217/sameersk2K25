package Practice1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;

import GenricUtility.Excel_Libereries1;

import GenricUtility.Java_Liberies1;

import POM.OrgnasationTest1;

public class LoginApplicationTest extends BaseClass {
	
	@Test
	public void LogInTest() throws EncryptedDocumentException, IOException, InterruptedException {
	
		
		OrgnasationTest1 org=new OrgnasationTest1(driver);
		org.clickOrg();
		
		Java_Liberies1 jl=new Java_Liberies1();
                   int k = jl.randomData();
		
		Excel_Libereries1 el=new Excel_Libereries1();
		String d = el.ReadData("Sheet1", 0, 1)+k;
		
		org.addData(d);
		org.saveData();
		Thread.sleep(4000);
	}
	@Test
	public void methodCheck() {
		System.out.println("Regional Regression Test");
	}

}

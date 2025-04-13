package Practice1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.common.io.Files;


import GenricUtility.Excel_Libereries1;

import GenricUtility.Java_Liberies1;

import POM.LoginPage1;

public class Launch1 {
    @Test
	public void LaunchTest() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//driver.get("https://www.amazon.in/");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 Excel_Libereries1 el=new Excel_Libereries1();
	 String url = el.ProperData("Url");
	 driver.get(url);
	 
	Java_Liberies1 jl=new Java_Liberies1();
	jl.waitTest(driver);
	
	//WebElement list = driver.findElement(By.id("searchDropdownBox"));
	//list.click();
	LoginPage1 lp=new LoginPage1(driver);
	   lp.searchDropdownBtn();
	
	//Select sat=new Select();
	//sat.selectByIndex(5);
	
	//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cipla");
	//driver.findElement(By.id("nav-search-submit-button")).click();
	  
	   String d = el.ExcelData("Sheet1", 0, 0);
	   lp.SearchBoxTest(d);
	   lp.SubmitBtnTest();
	   
	   
	
	driver.findElement(By.id("low-price")).sendKeys("1000");
	driver.findElement(By.id("high-price")).sendKeys("5000");
	driver.findElement(By.className("a-button-input")).click();

	
	/*RemoteWebDriver ts=(RemoteWebDriver)driver;
	//TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshot/amazonCart.png");
	Files.copy(src, dest);*/
	
	jl.screenShot(driver);
	
  WebElement cart = driver.findElement(By.id("nav-cart-count-container"));
  
 // Actions act= new Actions(driver);
  //act.doubleClick(cart).perform();
  jl.PageAction(driver, cart);
  
 // JavascriptExecutor js=(JavascriptExecutor) driver;
  //js.executeScript("window.scrollBy(0,1000)", "");
  //Thread.sleep(2000);
 //js.executeScript("window.scrollBy(0,-1000)", "");
  jl.javaTest(driver);

		//Push the data
  
	
	}

}

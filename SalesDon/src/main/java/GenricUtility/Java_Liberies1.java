package GenricUtility;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import POM.TrelloAction1;

public class Java_Liberies1 {
	WebDriver driver;
 public void waitTest(WebDriver driver) {
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
 }
 
 public void screenShot(WebDriver driver) throws IOException {
	 TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/amazonCartPage.png");
		Files.copy(src, dest);
 }
 
public void PageAction(WebDriver driver,WebElement data) {
	 Actions act= new Actions(driver);
	  act.doubleClick(data).perform();
}

public void javaTest(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,1000)", "");
	  Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,-1000)", "");
}

public int randomData() {
	Random r=new Random();
	int ran = r.nextInt();
	return ran;
}


 
}

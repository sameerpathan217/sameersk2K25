package Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.switchTo().activeElement().sendKeys("name");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement sw = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(sw);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("name");
		Thread.sleep(4000);
       List<WebElement> a1 = driver.findElements(By.xpath("//span[contains(text(),'name')]"));		
       for(WebElement we: a1) {
    	  String a2 = we.getText();
    	  System.out.println(a2);
    	  
    	   
       }
	}

}

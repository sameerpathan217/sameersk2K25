package Practice1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(ch);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		 driver.get("https://www.redbus.in/");
		 WebElement from = driver.findElement(By.className("db"));
		 from.sendKeys("Pune");
		 
		 System.out.println(from.getAttribute("div"));
		 
		 Actions act=new Actions(driver);
		 WebElement city = driver.findElement(By.xpath("//li[contains(text(),'Pune')][5]"));
		
		// act.doubleClick(city).perform();
		 city.click();
		 
		
		 
		WebElement to = driver.findElement(By.id("dest"));
		 to.sendKeys("Mumbai");
		 WebElement drop = driver.findElement(By.xpath("//li[contains(text(),'Mumbai')][3]"));
		 drop.click();
		 
		 driver.findElement(By.id("onward_cal")).click();
		 driver.findElement(By.xpath("//td[text()='May 2023']/../..//td[text()='10']")).click();
		 
		 driver.findElement(By.id("search_btn")).click();
		//driver.findElement(By.xpath("//div[text()='View Seats'][1]")).click();
		 WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		 help.click();
		 Thread.sleep(6000);
		 //driver.findElement(By.xpath("//i[@class='icon-close']")).click();
		 driver.findElement(By.xpath("//span[@class='twittericon icon-Twitter']")).click();
		 String t = driver.getTitle();
		 System.out.println(t);
		 String title = driver.getWindowHandle();
		 System.out.println(title);
		 
		Set<String> list = driver.getWindowHandles();
		for(String s: list) {
	String a1 = driver.switchTo().window(s).getTitle();
		System.out.println(a1);
		if(a1.equals(a1)) {
			driver.close();
		}
		
		}
		
	}

}

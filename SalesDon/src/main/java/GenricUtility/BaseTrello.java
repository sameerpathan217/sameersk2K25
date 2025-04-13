package GenricUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.TrelloLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTrello {
WebDriver driver;

Property_Utility pu=new Property_Utility();
@BeforeClass
	public void BC() {
		System.out.println("Launch a Browser");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
  @BeforeMethod
   public void BM() throws Throwable  {
	   System.out.println("Login To The Application");
	  String URL = pu.Trello("trello");
	  String USER = pu.Trello("u");
	  String PASS = pu.Trello("p");
	  driver.get(URL);
	  Thread.sleep(3000);
	  TrelloLoginPage tl=new TrelloLoginPage(driver);
	  Thread.sleep(3000);
	  tl.EnterUserNmae(USER);
	  Thread.sleep(3000);
	  tl.enterpassword(PASS);
	  
	  
	  
   }
  @AfterMethod
  public void AM() throws InterruptedException {
	  System.out.println("Logout To The Application");
	  Thread.sleep(3000);

	 
  }
  @AfterClass
  public void AC() {
	  System.out.println("Close The Browser");
	 // driver.close();
  }

}

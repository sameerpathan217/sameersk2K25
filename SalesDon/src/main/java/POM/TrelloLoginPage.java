package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {
	
	public TrelloLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	//Declaration
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement logBtn;
	
	@FindBy(id="user")
	private WebElement UserNmae;
	
	@FindBy(id="login")
	private WebElement loguser;
	
	@FindBy(name="password")
	private WebElement userpass;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement passbtn;
	
	@FindBy(xpath="//div[@class='OUdAuicP657Tka']")
	private WebElement logout1;
	
	@FindBy(xpath="//span[text()='Log out']")
	private WebElement logout2;
	//Getters
	

	public WebElement getUserNmae() {
		return UserNmae;
	}

	public WebElement getLoguser() {
		return loguser;
	}

	public WebElement getUserpass() {
		return userpass;
	}

	public WebElement getPassbtn() {
		return passbtn;
	}


	public WebElement getLogout1() {
		return logout1;
	}

	public WebElement getLogout2() {
		return logout2;
	}
	
	//Business Logic
	
   public void EnterUserNmae(String key) {
	   logBtn.click();
	   UserNmae.sendKeys(key); 
	   loguser.click();
   }
  
   
   public void enterpassword(String key) {
	   userpass.sendKeys(key);
	   passbtn.click();
   }
   
   public void LogOut() {
	   logout1.click();
	   logout2.click();
   }
}

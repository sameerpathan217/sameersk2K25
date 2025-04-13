package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginTest {
	
	public  VtigerLoginTest(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	  private WebElement password;
 
	@FindBy(id="submitButton")
	private WebElement submit;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement logoutimg;
	

	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement logoutBtn;
	
	
	
	
	
	public WebElement getUsername() {
		return username;
	}
	 public WebElement getPassword() {
			return password;
		}

	 public WebElement getSubmit() {
			return submit;
		}
	 
	 public WebElement getLogoutimg() {
			return logoutimg;
		}
		public WebElement getLogoutBtn() {
			return logoutBtn;
		}
	

		public void getKeyValue(String user,String pass) {
			username.sendKeys(user);
			password.sendKeys(pass);
			submit.click();
		}
		
		
	public void Logout() {
		logoutimg.click();
		logoutBtn.click();	
		
	}
}

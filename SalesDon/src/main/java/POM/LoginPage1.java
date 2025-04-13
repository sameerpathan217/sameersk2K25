package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage1 {

	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//Declaration
	
	@FindBy(id="searchDropdownBox")
	private WebElement searchDropdown;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement SearchBox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement SubmitBtn;

	
	


	//Getters
	public WebElement getSearchDropdown() {
		return searchDropdown;
	}
	
	public WebElement getSearchBox() {
		return SearchBox;
	}
	

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
	
	
	public void searchDropdownBtn() {
		WebElement clk = searchDropdown;
		clk.click();
		Select sat=new Select(clk);
		sat.selectByIndex(5);
	}
	
	public void SearchBoxTest(String data) {
		SearchBox.sendKeys(data);
	}
	
	public void SubmitBtnTest() {
		SubmitBtn.click();
	}
	
}

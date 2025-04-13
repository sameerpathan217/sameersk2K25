package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloAction1 {
	
	public TrelloAction1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//span[text()='Mock Completed']")
	private WebElement drag1;



	@FindBy(xpath="//span[text()='Mock Pending']")
	private WebElement drag2;
	@FindBy(xpath="//span[text()='Mock Scheduled']")
	private WebElement drag3;
	
	
	@FindBy(xpath="//textarea[text()='Java']")
	private WebElement drop1;
	@FindBy(xpath="//textarea[text()='Manual Testing']")
	private WebElement drop2;
	@FindBy(xpath="//span[text()='Mock Scheduled']")
	private WebElement drop3;
	
	public WebElement getDrag1() {
		return drag1;
	}
	public WebElement getDrag2() {
		return drag2;
	}
	public WebElement getDrag3() {
		return drag3;
	}
	public WebElement getDrop1() {
		return drop1;
	}
	public WebElement getDrop2() {
		return drop2;
	}
	public WebElement getDrop3() {
		return drop3;
	}
	
	public void drag11(WebElement src,WebElement dest) {
		 src = drag1;
		 dest=drop1;
	}

}

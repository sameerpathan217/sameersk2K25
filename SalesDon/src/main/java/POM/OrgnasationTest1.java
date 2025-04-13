package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrgnasationTest1 {
	
public OrgnasationTest1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}	

@FindBy(xpath="//a[text()='Organizations']")
private WebElement clkOrg;

@FindBy(xpath="//img[@alt='Create Organization...']")
private WebElement clkPlusBtn;

@FindBy(name="accountname")
private WebElement accountData;




@FindBy(name="button")
private WebElement saveBtn;



public WebElement getClkOrg() {
	return clkOrg;
}

public WebElement getClkPlusBtn() {
	return clkPlusBtn;
}

public WebElement getAccountData() {
	return accountData;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public void clickOrg() {
	clkOrg.click();
	clkPlusBtn.click();
}

public void addData(String data) {
	accountData.sendKeys(data);
	
}

public void saveData() {
	
	saveBtn.click();
}

}

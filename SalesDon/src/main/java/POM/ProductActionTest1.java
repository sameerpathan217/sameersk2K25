package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductActionTest1 {
	
	public ProductActionTest1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
   @FindBy(xpath="//a[text()='Products']")
   private WebElement ClkProduct;
   
  @FindBy(xpath="//img[@alt='Create Product...']")
   private WebElement clkPlus;
   
   @FindBy(name="productname")
   private WebElement proName;
   
   @FindBy(xpath="//input[@title='Save [Alt+S]']")
   private WebElement saveBtn;
   
   public WebElement getClkProduct() {
		return ClkProduct;
	}

	public WebElement getClkPlus() {
		return clkPlus;
	}

	public WebElement getProName() {
		return proName;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void ClkProduct1() {
		ClkProduct.click();
	}
	public void clkPlus1() {
		clkPlus.click();
	}
	
	public void proName1(String data) {
		proName.sendKeys(data);
	}
	public void saveBtn1() {
		saveBtn.click();
	}
}

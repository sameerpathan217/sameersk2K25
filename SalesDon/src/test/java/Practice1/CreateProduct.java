package Practice1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import GenricUtility.Excel_Libereries1;

import GenricUtility.Java_Liberies1;

import POM.ProductActionTest1;




public class CreateProduct extends BaseClass{
   @Test
	public void CreateProductTest() throws EncryptedDocumentException, IOException  {
	   
	   ProductActionTest1 pa=new ProductActionTest1(driver);
	   pa.ClkProduct1();
	   pa.clkPlus1();
	   Java_Liberies1 jl=new Java_Liberies1();
       int k = jl.randomData();
	   Excel_Libereries1 el=new Excel_Libereries1();
	   String val = el.ReadData("sheet1", 0, 1)+k;
	   pa.proName1(val);
	   pa.saveBtn1();
   }
}

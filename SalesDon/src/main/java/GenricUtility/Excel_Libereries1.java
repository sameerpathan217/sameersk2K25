package GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Libereries1 {
	
	


	public String ExcelData(String sheetname, int row,int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/SP1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row rownum = sheet.getRow(row);
		Cell cellnum = rownum.getCell(cell);
		String value = cellnum.getStringCellValue();
		return value;
	}
	
	public String ProperData(String url) throws IOException {

	FileInputStream fis=new FileInputStream("./src/test/resources/P.properties");
	Properties ps=new Properties();
	ps.load(fis);
	String d = ps.getProperty(url);
	return d;
	}
	
	
	public String ReadData(String name, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/SP1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		DataFormatter d=new DataFormatter();
		String value = d.formatCellValue(book.getSheet(name).getRow(row).getCell(cell));
		
		return value;
	}
	
}

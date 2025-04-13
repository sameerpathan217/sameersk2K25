package GenricUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property_Utility {
	
	public String SetBrowser(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/P.properties");
	Properties ps=new Properties();
	ps.load(fis);
	String value = ps.getProperty(key);
	return value;
	
	}
	
	public String Trello(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/P.properties");
		Properties ps=new Properties();
		ps.load(fis);
		String log = ps.getProperty(key);
		return log;
		
		
	}
}

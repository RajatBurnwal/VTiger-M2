package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an utility class which deals with Excel file
 * @author rajat burnwal
 * @version 26-02-04
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to fetch data from Properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	/**
	 * This is a generic method to write data to Properties file
	 * @param key
	 * @param value
	 * @param message
	 * @throws IOException
	 */
	public void writeDataToPropertiesFile(String key, 
			String value, String message) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.propertiesPath);
		prop.store(fos, message);
	}
}

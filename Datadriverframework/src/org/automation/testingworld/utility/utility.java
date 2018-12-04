package org.automation.testingworld.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class utility 
{ public WebDriver driver;
	public static Object fetchpropertyvalue( String key) throws IOException
	{
		
		FileInputStream file = new FileInputStream(".//config//config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
		
	}
	public static String  fetchlocatorvalue(String key) throws IOException
	{
		
		FileInputStream file = new FileInputStream("./config/or.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
		

}
}
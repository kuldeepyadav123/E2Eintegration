package sepration.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.steadystate.css.dom.Property;

import sepration.base.baseclass;

public class helperclass extends baseclass
{ 

	public static String  fetchlocatorvalue(String key) throws IOException
	{
		
	
	FileInputStream file = new FileInputStream(".//config//or.properties");
	Properties property = new Properties();
	
	
	property.load(file);
	return property.get(key).toString();
			
	}

			
			
			
	
	
	
	public static Object fetchpropertyvalue( String key) throws IOException
	{
		FileInputStream file = new FileInputStream(".//config//config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	

}
	public static void takeScreenshot(String fileName) throws IOException{
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Users\\LenovoL420-13u\\workspace\\SeprationAutomation\\Report" + fileName +".png"));
	
	
	
}
	
	
	//Creating a method getScreenshot and passing two parameters 
	//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	                //below line is just to append the date format with the screenshot name to avoid duplicate names 
	                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	 String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
	 File finalDestination = new File(destination);
	 FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
	 return destination;
	}
}
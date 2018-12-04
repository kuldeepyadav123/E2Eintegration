package sepration.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import sepration.utility.helperclass;

import org.apache.xml.dtm.ref.ExtendedType;
import sepration.utility.helperclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class baseclass
{
	
	public static WebDriver driver;
	
	public static  void initialisation() throws IOException
	{
		if (helperclass.fetchpropertyvalue("browsername").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if  (helperclass.fetchpropertyvalue("browsername").toString().equalsIgnoreCase("firefox"))
	
		{
			System.setProperty("webdriver.gecko.driver",".//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		}
		
	driver.get(helperclass.fetchpropertyvalue("applicationurl").toString());
		
		
		
		
	
	
	  
	}

	public void tearDown(){
      driver.close();
	
	
		
		
	}}



	



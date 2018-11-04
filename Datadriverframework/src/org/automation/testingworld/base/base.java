package org.automation.testingworld.base;

import java.io.IOException;

import org.automation.testingworld.utility.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base 
{
public WebDriver driver;
	@BeforeMethod
	public void initiatedriverinstance() throws IOException
	{
		if (utility.fetchpropertyvalue("browsername").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if  (utility.fetchpropertyvalue("browserName").toString().equalsIgnoreCase("firefox"))
	
		{
			System.setProperty("webdriver.gecko.driver",".//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",".//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(utility.fetchpropertyvalue("applicationurl").toString());
		
		
		
		
	}

	@AfterMethod
	public void closedriverinstance()
	{
		driver.quit();
	}

}

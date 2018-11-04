package org.automation.testingworld.assertion;

import org.openqa.selenium.WebDriver;

public class compare
{
	public WebDriver driver;
	
	public boolean validatepageurl(String expurl)
	{
		Boolean flag = false;
		if (driver.getCurrentUrl().equalsIgnoreCase(expurl));
		{
			flag=true;
		}
		return flag;
		
		
	}
	public boolean validatepagetitle(String exptitle)
	{
		Boolean flag = false;
		if (driver.getTitle().equalsIgnoreCase(exptitle));
		{
			flag=true;
		}
		return flag;
	
}
}

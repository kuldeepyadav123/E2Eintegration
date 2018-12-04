package org.automation.testingworld.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testing.pages.login;
import org.automation.testingworld.base.base;
import org.automation.testingworld.datagenerator.datagenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC001validateloginpage extends base 
{ 
	@Test(dataProvider="Excel" ,dataProviderClass=datagenerator.class)
	public void tc001_login_loginfunctionality(String username, String password) throws IOException
	{
	 login page =new login(driver);
	 page.enterusername(username);
	 page.enterpassword(password);
	 page.clicksighn();
		
	}
	
}
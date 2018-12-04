package sepration.pages;
import sepration.testcases.logintest;
import sepration.utility.helperclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import sepration.base.baseclass;

public class Separationapproval2 extends loginpage
{
	
	@FindBy (id = "md-input")  WebElement id;
	@FindBy (name= "UserDetailUserPassword")  WebElement password;
	@FindBy ( xpath="//*[@id='loginemployee']/div[5]/input" ) WebElement login;

	
     @ Override
	 public void usercode (String usercode) throws IOException
	 {
    	 id.sendKeys(usercode);	
			
		
	 }
    
     @ Override
	 public void password(String passwd) throws IOException
	 {
		password.sendKeys(passwd);	
			 
		
	 }
  
     @ Override
	 public void login() throws IOException
	 {
    	 login.click();
    	 
	}
     

}

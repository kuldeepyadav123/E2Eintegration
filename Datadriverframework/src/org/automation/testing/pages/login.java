package org.automation.testing.pages;

import java.io.IOException;

import org.automation.testingworld.utility.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
 WebDriver driver;
 public login (WebDriver driver)
 {
	 this.driver=driver;
 }
	
	
	public void enterusername(String username) throws IOException
	{
		driver.findElement(By.id(utility.fetchlocatorvalue("login-username-id"))).sendKeys(username);
		
		
		
	}
	public void enterpassword(String password) throws IOException
	{
		driver.findElement(By.id(utility.fetchlocatorvalue("login-password-id"))).sendKeys(password);
	}
public void clicksighn() throws IOException
{
	driver.findElement(By.xpath(utility.fetchlocatorvalue("login-sighn-xpath"))).click();
	
}

}

package sepration.pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import sepration.base.baseclass;
import sepration.utility.helperclass;


public class loginpage extends baseclass
{ 
	

    
	 

 public void usercode (String usercode) throws IOException
 {
		driver.findElement(By.className(helperclass.fetchlocatorvalue("id"))).sendKeys(usercode);
		
	
 }

 public String verifyHomePageTitle(){
		return driver.getTitle();
 }
 
 public void password(String password) throws IOException
 {
		driver.findElement(By.id(helperclass.fetchlocatorvalue("password"))).sendKeys(password);
		 
	
 }
 
 public void company ()
 {
	String  company= driver.findElement(By.name("data[UserDetail][comp_code]")).getText();
    Assert.assertEquals("stl","stl", "found stl");
	 
	 
 }
 
 public void login() throws IOException
 {
		driver.findElement(By.xpath(helperclass.fetchlocatorvalue("loginclick"))).click();
		 
  }

 public void verifytext()
 {
	 
	 
	 boolean isTheTextPresent = driver.getPageSource().contains("Leaves taken.");
	 Assert.assertTrue(true, "text is present");

 }
 
	

}
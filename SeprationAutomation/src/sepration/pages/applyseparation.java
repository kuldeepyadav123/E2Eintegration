package sepration.pages;
import org.openqa.selenium.Keys;
import sepration.testcases.logintest;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sepration.base.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import sepration.utility.helperclass;

import org.openqa.selenium.Keys;
public class applyseparation extends baseclass
{
	

	
	public void sidebar()
	{
		
			driver.findElement(By.id("sidebar_main_toggle")).click();
				
	
			
		
		 

		
	}
	 public void offboardingbar() throws IOException
	 {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='menu_section']/ul/li[6]/a/span[2]")));
		 
		WebElement bar = driver.findElement(By.xpath(helperclass.fetchlocatorvalue("offboardindba-bar")));
		bar.click();
	 }
	 
	 public void applyforsepartion() throws IOException
	 {
		 driver.findElement(By.xpath(helperclass.fetchlocatorvalue("applysepratation"))).click();
	}
	
	 public void reasonofresignation() throws InterruptedException, IOException
	 {   
	

	 driver.findElement(By.xpath(helperclass.fetchlocatorvalue("dropdownlocator"))).click();

	 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@data-value = '3']")));	
	     
	 
	 }
	
	 public void personalemail(String email) throws IOException
	 {
		 driver.findElement(By.id(helperclass.fetchlocatorvalue("personalemail"))).sendKeys(email);
		 
		 
	 }
	 
	 public void personalcontactno(String  contactno)
	 {
		 driver.findElement(By.id("personal_contact_no")).sendKeys(contactno);
		 
	 }
	 
	 public void SeparationRemark (String Remarks)
	 
	 {
		 driver.findElement(By.id("SeparationRemark")).sendKeys(Remarks);
	 }
	
	 
	 public void choosefile()
	 {
		 
		 driver.findElement(By.id("SeparationUplDoc")).sendKeys("C:\\Users\\LenovoL420-13u\\Desktop\\ab.pdf");
	 }
	 
	 public void submitbutton()
	 {
		 driver.findElement(By.xpath("//*[@id='SeparationAddForm']/div[11]/div/div/input")).click();
		 
	 }
	
	 
	
		}

	
	
	
	
	

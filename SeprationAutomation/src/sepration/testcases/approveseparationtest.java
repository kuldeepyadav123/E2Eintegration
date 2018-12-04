package sepration.testcases;

import sepration.pages.Separationapproval2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import sepration.base.baseclass;
import sepration.utility.helperclass;
public class approveseparationtest extends baseclass

{
	public approveseparationtest (WebDriver driver)
	{

        this.driver = driver;

 

        PageFactory.initElements(driver, this);
	}
	
	
	@Test
	public void approveseparation() throws IOException
	{
		baseclass.initialisation();
		
		
		
	}
	
	
	
	
	
}
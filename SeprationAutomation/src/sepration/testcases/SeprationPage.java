package sepration.testcases;
import sepration.utility.helperclass;
import sepration.base.baseclass;
import java.io.IOException;
import sepration.pages.applyseparation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sepration.pages.applyseparation;

public class SeprationPage extends baseclass 
{
	

	@Test
	
	public void applyforseparation() throws InterruptedException, IOException
	{
	
		logintest.login();
	   applyseparation obj1 = new applyseparation();
	                                                       
		obj1.sidebar();
		obj1.offboardingbar();
	    obj1.applyforsepartion();
	    obj1.reasonofresignation();
	    obj1.personalemail("yadavkuldeepit@gmail.com");
	    obj1.personalcontactno("7011698012");
	  
	    obj1.SeparationRemark("remarks");
	    obj1.choosefile();
	    obj1.submitbutton();
	    
	  // driver.close();
	}
	
	

}

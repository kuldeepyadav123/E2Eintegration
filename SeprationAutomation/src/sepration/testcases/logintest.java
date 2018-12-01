package sepration.testcases;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import sepration.utility.helperclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import sepration.pages.loginpage;
import sepration.base.baseclass;


public class logintest extends baseclass 
{
	


	
	@Test
	
	public static void login() throws IOException
	{
		baseclass.initialisation();
	loginpage obj = new loginpage();
	obj.usercode("PRT-761");
	obj.password("123456");
	Assert.assertEquals("ESS(Employee Self Service)", driver.getTitle());
	obj.company();
	obj.login();
	obj.verifyHomePageTitle();
	obj.verifytext();
	driver.getPageSource().contains("Leaves");
	

	}
	

	
		
	}


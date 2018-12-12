package gmailogin;

import java.beans.Visibility;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmaillogin

{
	
		
	
	public void gmailloginlogout() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String url= "https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		driver.get(url);
		WebElement email= driver.findElement(By.xpath("//*[@id='identifierId']"));
		email.sendKeys("yadavkuldeepit@gmail.com");
		
		
		driver.findElement(By.xpath("//div[@id='identifierNext']/content[@class='CwaK9' and 1]/span[@class='RveJvd snByac' and 1]")).click();
	
	
		WebElement password = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		
		password.sendKeys("jaishreekrishna@123");
		
		 System.out.println("testing");
		
		 WebDriverWait wait = new WebDriverWait(driver,10000); 
		 
		 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9' and 1]/span[@class='RveJvd snByac' and 1]")));
		 
		 driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9' and 1]/span[@class='RveJvd snByac' and 1]")).click(); 
		 
		 
		WebElement gmailicon= driver.findElement(By.xpath("//*[@id='yDmH0d']/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]"));
		 
		 gmailicon.click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  
		 System.out.println("puneet");
		
		
		 driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span")).click();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		 WebElement sighnout = driver.findElement(By.xpath("//*[@id='gb_71']"));
		 
		 sighnout.click();
			
		 System.out.println("gmail has been logout");
		 
		
		 
		 

	}
	
	}
	



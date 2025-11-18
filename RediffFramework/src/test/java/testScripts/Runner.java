package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testBase.BaseClass;
import testUtility.DriverUtility;
import testUtility.ListnerUtility;

@Listeners(ListnerUtility.class)

public class Runner extends BaseClass {
	
	@BeforeClass
	public void launch()
	{
		launch("chrome");
		DriverUtility.getMaximize();
		DriverUtility.getImplicitWait(10);
		DriverUtility.openPageUrl("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test (priority = -1)
	public void getTitle()
	{
		String eTtile ="";
		String aTitle = DriverUtility.getPageTitle();
		Assert.assertEquals(eTtile, aTitle);
		
	}
	
	@Test (priority = 0)
	public void getUrl()
	{
		String eUrl ="";
		String aUrl = DriverUtility.getPageUrl();
		Assert.assertEquals(eUrl, aUrl);
		
	}
	
	@Test (priority = 1)
	public void verifyLogin()
	{
		 WebElement emailTextBox=driver.findElement(By.xpath("//input[@name='login']"));
		 DriverUtility.getEnterInput(emailTextBox, "Selenium");
		 
		 WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='password']"));
		 DriverUtility.getEnterInput(passwordTextBox, "123");

	}
	
	@Test (priority = 2)
	public void createNewFields()
	{
		 WebElement newAccount = driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']"));
		 DriverUtility.getClick(newAccount);
		 
		 WebElement nameTextBox=driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
		 DriverUtility.getEnterInput(nameTextBox, "Selenium");
		 
		 WebElement rediffmailID=driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
		 DriverUtility.getEnterInput(rediffmailID, "suguthilak");
		 
		 WebElement checkAvailability=driver.findElement(By.xpath("//input[@class='btn_checkavail button']"));
		 DriverUtility.getClick(checkAvailability);
		 
	     WebElement newPassword=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
	     DriverUtility.getEnterInput(newPassword, "123");
	     
		 WebElement retypePassword=driver.findElement(By.xpath("//input[@placeholder='Retype password']"));
		 DriverUtility.getEnterInput(retypePassword, "123");
		 
		 WebElement day=driver.findElement(By.xpath("//select[@class='day']"));
		 DriverUtility.getDropDownIndex(day, 27);
		 
		 WebElement month = driver.findElement(By.xpath("//select[@class='middle month']"));
		 DriverUtility.getDropDownVisibleText(month, "MAY");
		 
		 WebElement year = driver.findElement(By.xpath("//select[@class='year']"));
		 DriverUtility.getDropDownValue(year, "2000");
		 
		 WebElement maleButton=driver.findElement(By.xpath("//label[text()='Male']"));
		 boolean elementDisplayed = DriverUtility.isElementDisplayed(maleButton);
		 if (elementDisplayed==true) 
		 {
			 boolean elementEnabled = DriverUtility.isElementEnabled(maleButton);
			 if (elementEnabled==true)
			 {
				 boolean elementSelected = DriverUtility.isElementSelected(maleButton);
				 if (elementSelected!=true) 
				 {
					DriverUtility.getClick(maleButton);
				}
				
			}
			
		}
		 
		 WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		 DriverUtility.getDropDownVisibleText(country, "India");
		 
		 WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/div/select"));
		 DriverUtility.getDropDownVisibleText(city, "Vellore");

	     WebElement recoveryId =driver.findElement(By.xpath("//input[@placeholder='Enter recovery email']"));
	     DriverUtility.getEnterInput(recoveryId, "suganthilak");

	     WebElement mobileNumber =driver.findElement(By.xpath("//input[@id='mobno']"));
	     DriverUtility.getEnterInput(mobileNumber, "8838075171");
	     
	    
	}
	
	@AfterClass (enabled = false)
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
	

}

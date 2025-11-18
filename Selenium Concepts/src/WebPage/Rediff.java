package WebPage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	
	public static void main(String[] args) {
	
	 WebDriver  driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 driver.getTitle();
	 driver.getCurrentUrl();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 
	 //Absolute Xpath
	 //WebElement newAccount=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]/p/a"));
	 
	 //Relative Xpath
	 WebElement newAccount = driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']"));
	 boolean display = newAccount.isDisplayed();
	 System.out.println(display );
	 boolean enable=newAccount.isEnabled();
	 System.out.println(enable);
	 newAccount.click();

	 //Absolute xpath	 
	 //WebElement nameTextBox=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
	 
	 //Relative xpath
	 WebElement nameTextBox=driver.findElement(By.xpath("//input[@placeholder='Enter your full name']"));
	 boolean display1 = nameTextBox.isDisplayed();
	 System.out.println(display1);
	 boolean enable1=nameTextBox.isEnabled();
	 System.out.println(enable1);
	 nameTextBox.sendKeys("Suganth");
	 
	 //Absolute xpath
	 //WebElement rediffmailID =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[3]/div/input"));
	 
	 //Relative xpath
	 WebElement rediffmailID=driver.findElement(By.xpath("//input[@placeholder='Enter Rediffmail ID']"));
	 boolean display2 = rediffmailID.isDisplayed();
	 System.out.println(display2);
	 boolean enable2=rediffmailID.isEnabled();
	 System.out.println(enable2);
	 rediffmailID.sendKeys("suguthilak");
	 
	 //Absolute xpath
	 //WebElement checkAvailability=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input"));
	 
	 //Relative xpath
	 WebElement checkAvailability=driver.findElement(By.xpath("//input[@class='btn_checkavail button']"));
	 boolean display3 = checkAvailability.isDisplayed();
	 System.out.println(display3);
	 boolean enable3=checkAvailability.isEnabled();
	 System.out.println(enable3);
	 checkAvailability.click();
	 
	 //Absolute xpath
	 //WebElement newPassword=driver.findElement(By.xpath(" /html/body/div[2]/div[2]/form/div/div[6]/div/input"));

	 //Relative xpath
     WebElement newPassword=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
	 boolean display4 = newPassword.isDisplayed();
	 System.out.println(display4);
	 boolean enable4=newPassword.isEnabled();
	 System.out.println(enable4);
	 newPassword.sendKeys("123");
	 
	 
	 //Absolute xpath
	 //WebElement retypePassword=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[7]/div/input"));

	 //Relative xpath
	 WebElement retypePassword=driver.findElement(By.xpath("//input[@placeholder='Retype password']"));
	 boolean display5 = retypePassword.isDisplayed();
	 System.out.println(display5);
	 boolean enable5=retypePassword.isEnabled();
	 System.out.println(enable5);
	 retypePassword.sendKeys("123");
	 
	 
	 //Absolute xpath
	 //WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));

    //Relative xpath
    WebElement day=driver.findElement(By.xpath("//select[@class='day']"));
    Select daySelect=new Select(day);
	daySelect.selectByIndex(27);
	boolean display6 = day.isDisplayed();
	System.out.println(display6);
	boolean enable6=day.isEnabled();
	System.out.println(enable6);
	
	
	//Absolute xpath
	//WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
	
	//Relative xpath
	WebElement month = driver.findElement(By.xpath("//select[@class='middle month']"));
	 boolean month1 = month.isDisplayed();
	 System.out.println(month1);
	 boolean month2 = month.isEnabled();
	 System.out.println(month2);
	 Select monthSelect=new Select(month);
	 monthSelect.selectByVisibleText("MAY");
		
	//Absolute xpath
	//WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
	 
	 //Relative xpath
	 WebElement year = driver.findElement(By.xpath("//select[@class='year']"));
	 boolean year1 = year.isDisplayed();
	 System.out.println(year1);
	 boolean year2 = year.isEnabled();
	 System.out.println(year2);
	 Select yearSelect=new Select(year);
	 yearSelect.selectByValue("2000");
	 
	 
	//Absolute xpath
     //WebElement maleButton=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[9]/div/label/input"));
     
	 //Relative xpath
	 WebElement maleButton=driver.findElement(By.xpath("//label[text()='Male']"));
	 maleButton.click();
	 boolean display7 = maleButton.isDisplayed();
	 System.out.println(display7);
	 boolean enable7=maleButton.isEnabled();
	 System.out.println(enable7);
	 boolean selected=maleButton.isSelected();
	 System.out.println(selected);
	 maleButton.click();
	 
	 
	//Absolute xpath
	 //WebElement country = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[10]/select"));
	 
	//Relative xpath
	 WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
	 Select countrySelect=new Select(country);
	 countrySelect.selectByVisibleText("India");
	 boolean country1 = country.isDisplayed();
	 System.out.println(country1);
	 boolean country2 = country.isEnabled();
	 System.out.println(country2);
	 
	 
	
	 //Absolute xpath
	// WebElement city = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[11]/div/select")); 
	 
	//Relative xpath
	 WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/div/select"));
	 Select citySelect=new Select(city);
	 citySelect.selectByVisibleText("Vellore");
	 boolean city1 = city.isDisplayed();
	 System.out.println(city1);
	 boolean city2 = city.isEnabled();
	 System.out.println(city2);
	 
	 
	 
	 //Absolute xpath
	 //WebElement recoveryId =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[14]/div/div/input"));
	
	 //Relative xpath
     WebElement recoveryId =driver.findElement(By.xpath("//input[@placeholder='Enter recovery email']"));
	 boolean displayed4 = recoveryId.isDisplayed();
	 System.out.println(displayed4);
	 boolean enabled4=recoveryId.isEnabled();
	 System.out.println(enabled4);
	 recoveryId.sendKeys("suganthilak");
	 
	 //Absolute xpath
	 //WebElement mobileNumber =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[17]/div/div/input"));
	 
	 //Relative xpath
     WebElement mobileNumber =driver.findElement(By.xpath("//input[@id='mobno']"));
	 boolean displayed5 = mobileNumber .isDisplayed();
	 System.out.println(displayed5);
	 boolean enabled5=mobileNumber.isEnabled();
	 System.out.println(enabled5);
	 mobileNumber.sendKeys("8838075171");
	 
	 
	 //Absolute xpath
	 //WebElement captcha =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[19]/input"));
	 
	 //Relative xpath
	 WebElement captcha =driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']"));
	 boolean displayed6 = captcha.isDisplayed();
	 System.out.println(displayed6);
	 boolean enabled6=captcha.isEnabled();
	 System.out.println(enabled6);
	 
	 //Absolute xpath
	 //WebElement createbtn =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[20]/input"));
		 
	 //Relative xpath
	 WebElement createbtn =driver.findElement(By.xpath("//input[@value='Create my account']"));
	 boolean displayed7 = createbtn.isDisplayed();
	 System.out.println(displayed7);
	 boolean enabled7=createbtn.isEnabled();
	 System.out.println(enabled7);
	
		 
	 driver.navigate().back();	 

      //login page
	 
	 //Absolute xpath
	 //WebElement emailTextBox=driver.findElement(By.xpath(" /html/body/div[2]/div/div/div[2]/div[2]/form/div/div/input"));
	 
	 //Relative xpath
	 WebElement emailTextBox=driver.findElement(By.xpath("//input[@name='login']"));
	 boolean displayed = emailTextBox.isDisplayed();
	 System.out.println(displayed);
	 boolean enabled=emailTextBox.isEnabled();
	 System.out.println(enabled);
	 emailTextBox.sendKeys("suganth");
	 

	 //Absolute xpath
	 //WebElement passwordTextBox=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/form/div[2]/div/input"));
	 
	 //Relative xpath
	 WebElement passwordTextBox=driver.findElement(By.xpath("//input[@id='password']"));

	 boolean displayed1 = passwordTextBox.isDisplayed();
	 System.out.println(displayed1);
	 boolean enabled1=passwordTextBox.isEnabled();
	 System.out.println(enabled1);
	 passwordTextBox.sendKeys("123");
	 
	 //Absolute xpath
	 //WebElement loginBtn=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/form/button"));
	 
	 //Relative xpath
	 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log In']"));
	 boolean displayed2 = loginBtn.isDisplayed();
	 System.out.println(displayed2);
	 boolean enabled2=loginBtn.isEnabled();
	 System.out.println(enabled2);
	 loginBtn.click();
	 
	
	 
	 
	 }
}

package WebPage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookXpath {
	

	public static void main(String[] args) throws InterruptedException {

		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.getTitle();
		 driver.getCurrentUrl();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 	 
		
		 
		 WebElement newAccountBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
		 boolean newAccount= newAccountBtn.isDisplayed();
		 System.out.println(newAccount);
		 boolean newAccount1=newAccountBtn.isEnabled();
		 System.out.println(newAccount1);
		 newAccountBtn.click();
	 
		 WebElement firstNameTextBox=driver.findElement(By.xpath("//input[@name='firstname']"));
		 boolean firstName=  firstNameTextBox.isDisplayed();
		 System.out.println(firstName);
		 boolean firstName1= firstNameTextBox.isEnabled();
		 System.out.println(firstName1);
		 firstNameTextBox.sendKeys("suganth");
		 
		 
		 
		 WebElement surNameBtn=driver.findElement(By.xpath("//input[@name='lastname']"));
		 boolean surName= surNameBtn.isDisplayed();
		 System.out.println(surName);
		 boolean surName1=surNameBtn.isEnabled();
		 System.out.println(surName1);
		 surNameBtn.sendKeys("sugu");
		 
		 
		 WebElement maleButton = driver.findElement(By.xpath("//input[@value='2']"));
		 maleButton.click();
		 boolean displayed = maleButton.isDisplayed();
		System.out.println(displayed);
		boolean enabled = maleButton.isEnabled();
		System.out.println(enabled);
		boolean selected = maleButton.isSelected();
		System.out.println(selected);
					
			 
		WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		Select dateSelect=new Select(date);
		dateSelect.selectByIndex(26);
		boolean displayed1 = date.isDisplayed();
		System.out.println(displayed1);
		boolean enabled1 = date.isEnabled();
		System.out.println(enabled1);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select monthSelect=new Select(month);
		monthSelect.selectByVisibleText("May");
		boolean displayed2 = month.isDisplayed();
		System.out.println(displayed2);
		boolean enabled2 = month.isEnabled();
		System.out.println(enabled2);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select yearSelect=new Select(year);
		yearSelect.selectByValue("2000");
		boolean displayed3 = year.isDisplayed();
		System.out.println(displayed3);
		boolean enabled3 = year.isEnabled();
		System.out.println(enabled3);
		
		Thread.sleep(3000);
		
	     WebElement mobileNum=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	     boolean numberTextBox= mobileNum.isDisplayed();
		 System.out.println(numberTextBox);
	     boolean numberTextBox1=mobileNum.isEnabled();
		 System.out.println(numberTextBox1);
		 mobileNum.sendKeys("9876543210");		
		
		
		
		 WebElement newPasswordBtn=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	     boolean newPassword= newPasswordBtn.isDisplayed();
		 System.out.println(newPassword);
		 boolean newPassword1=newPasswordBtn.isEnabled();
		 System.out.println(newPassword1);
		 newPasswordBtn.sendKeys("12345");	
		
		 
		 WebElement signUpBtn=driver.findElement(By.xpath("//button[@name='websubmit']"));
	     boolean signUp= signUpBtn.isDisplayed();
		 System.out.println(signUp);
		 boolean signUp1=signUpBtn.isEnabled();
		 System.out.println(signUp1);
		 signUpBtn.click();
		 
		 driver.navigate().back();
		 
		 
//		 login functions
		 
		 WebElement emailTextbox=driver.findElement(By.xpath("//input[@id='email']"));
		 boolean textBox= emailTextbox.isDisplayed();
		 System.out.println(textBox);
		 boolean textBox1= emailTextbox.isEnabled();
		 System.out.println(textBox1);
		 emailTextbox.sendKeys("sugu@gmail.com");
		 
		 WebElement passwordTextbox=driver.findElement(By.xpath("//input[@id='pass']"));
		 boolean password= passwordTextbox.isDisplayed();
		 System.out.println(password);
		 boolean password1= passwordTextbox.isEnabled();
		 System.out.println(password1);
		 passwordTextbox.sendKeys("12345");
		 
		 WebElement loginBtn=driver.findElement(By.xpath("//button[@name='login']"));
		 boolean login= loginBtn.isDisplayed();
		 System.out.println(login);
		 boolean login1= loginBtn.isEnabled();
		 System.out.println(login1);
		 loginBtn.click();
	}



}
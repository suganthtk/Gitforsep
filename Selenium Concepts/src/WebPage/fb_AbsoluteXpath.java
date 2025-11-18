package WebPage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_AbsoluteXpath {
	

	public static void main(String[] args) {

		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 driver.getTitle();
		 driver.getCurrentUrl();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 	 
		
		 
		 WebElement newAccountBtn=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a"));
		 boolean newAccount= newAccountBtn.isDisplayed();
		 System.out.println(newAccount);
		 boolean newAccount1=newAccountBtn.isEnabled();
		 System.out.println(newAccount1);
		 newAccountBtn.click();
	 
		 WebElement firstNameTextBox=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div[1]/div[1]/div[1]/input[1]"));
		 boolean firstName=  firstNameTextBox.isDisplayed();
		 System.out.println(firstName);
		 boolean firstName1= firstNameTextBox.isEnabled();
		 System.out.println(firstName1);
		 firstNameTextBox.sendKeys("suganth");
		 
		 
		 
		 WebElement surNameBtn=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div/div/div[2]/div/div/input"));
		 boolean surName= surNameBtn.isDisplayed();
		 System.out.println(surName);
		 boolean surName1=surNameBtn.isEnabled();
		 System.out.println(surName1);
		 surNameBtn.sendKeys("sugu");
		 
		 
		 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 Select sel = new Select(day);
		 sel.selectByValue("27");
		 boolean dayfield = day.isDisplayed();
		 System.out.println(dayfield);
		 boolean dayenabled = day.isEnabled();
		 System.out.println(dayenabled);
		 
		 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select sel1 = new Select(month);
		 sel1.selectByVisibleText("May");
		 boolean mondisplayed = month.isDisplayed();
		 System.out.println(mondisplayed);
		 boolean monenabled = month.isEnabled();
		 System.out.println(monenabled);
		 
		 WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select sel2 = new Select(year);
		 sel2.selectByContainsVisibleText("2000");
		 boolean yrdisplayed = year.isDisplayed();
		 System.out.println(yrdisplayed);
		 boolean yrenabled = year.isEnabled();
		 System.out.println(yrenabled);
		 
		WebElement maleButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		maleButton.click();
		boolean displayed = maleButton.isDisplayed();
		System.out.println(displayed);
		boolean enabled = maleButton.isEnabled();
		System.out.println(enabled);
		boolean selected = maleButton.isSelected();
		System.out.println(selected);
		
		
	     WebElement mobileNum=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[6]/div/div/input"));
	     boolean displayed1= mobileNum.isDisplayed();
		 System.out.println(displayed1);
	     boolean enabled1=mobileNum.isEnabled();
		 System.out.println(enabled1);
		 mobileNum.sendKeys("9876543210");		
		
		
		
		 WebElement newPasswordBtn=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[8]/div/div/input"));
	     boolean displayed2 = newPasswordBtn.isDisplayed();
		 System.out.println(displayed2);
		 boolean enabled2=newPasswordBtn.isEnabled();
		 System.out.println(enabled2);
		 newPasswordBtn.sendKeys("12345");	 
		 
		 driver.navigate().back();
		 
		 
//		 login functions
		 
		 WebElement emailTextbox=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		 boolean textBox= emailTextbox.isDisplayed();
		 System.out.println(textBox);
		 boolean textBox1= emailTextbox.isEnabled();
		 System.out.println(textBox1);
		 emailTextbox.sendKeys("sugu@gmail.com");
		 
		 
		 WebElement passwordTextbox=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/div/input"));
		 boolean password= passwordTextbox.isDisplayed();
		 System.out.println(password);
		 boolean password1= passwordTextbox.isEnabled();
		 System.out.println(password1);
		 passwordTextbox.sendKeys("12345");
		 
		 WebElement loginBtn=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[2]/button"));
		 boolean login= loginBtn.isDisplayed();
		 System.out.println(login);
		 boolean login1= loginBtn.isEnabled();
		 System.out.println(login1);
		 loginBtn.click();
	}



}



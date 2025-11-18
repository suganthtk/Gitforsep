package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		 //Absolute xpath
		 //WebElement radioButton=driver.findElement(By.xpath("/html/body/div/div[1]/fieldset[1]/label[2]/input[1]"));
		
		 //Relative xpath
		 WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio2']"));
		 boolean displayed =radioButton.isDisplayed();
		 System.out.println(displayed);
		 boolean enabled = radioButton.isEnabled();
		 System.out.println(enabled);
		 radioButton.click();
		 boolean select =radioButton.isSelected();
		 System.out.println(select);
		 
		 
		 WebElement country = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		 country.sendKeys("India");
		 boolean countrydisplayed =country.isDisplayed();
		 System.out.println(countrydisplayed);
		 boolean countryenabled =country.isEnabled();
		 System.out.println(countryenabled);
		 
		 
		 WebElement dropdown= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		 Select dropdown1 = new Select(dropdown);
		 dropdown1.selectByVisibleText("Option2");
		 boolean dddisplayed =dropdown.isDisplayed();
		 System.out.println(dddisplayed);
		 boolean ddenabled =dropdown.isEnabled();
		 System.out.println(ddenabled);
		 
		 
		 //Absolute xpath
		 //WebElement CheckBoxButton=driver.findElement(By.xpath("/html/body/div/div[4]/fieldset/label[3]/input"));
		 
		//Relative xpath
		WebElement CheckBoxButton = driver.findElement(By.xpath("//input[@value='option2']"));
		 boolean displayed1 =CheckBoxButton.isDisplayed();
		 System.out.println(displayed1);
		 boolean enabled1 =CheckBoxButton.isEnabled();
		 System.out.println(enabled1);
		 CheckBoxButton.click();
		 boolean select1 =radioButton.isSelected();
		 System.out.println(select1);
		 
		 WebElement TextBoxButton=driver.findElement(By.id("name"));
		 boolean displayed2 =TextBoxButton.isDisplayed();
		 System.out.println(displayed2);
		 boolean enabled2 =TextBoxButton.isEnabled();
		 System.out.println(enabled2);
		 TextBoxButton.sendKeys("SUGANTH");
		 
		 WebElement AlertButton=driver.findElement(By.id("alertbtn"));
		 AlertButton.click();
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 alert.accept();
		 Thread.sleep(2000);
		 TextBoxButton.sendKeys("SUGU");
		 WebElement confirmBtn=driver.findElement(By.id("confirmbtn"));
		 confirmBtn.click();
		 Alert alert2 = driver.switchTo().alert();
		 System.out.println(alert2.getText());
		 alert.accept();
		 
		 

	}

}

package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindowtab {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		

		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		  WebElement opentab= driver.findElement(By.id("opentab"));
		  opentab.click();
		  boolean displayed = opentab.isDisplayed();
		  System.out.println(displayed);
		  boolean enabled = opentab.isEnabled();
		  System.out.println(enabled);
		  
		  Set<String> tabHandle =driver.getWindowHandles();
		  ArrayList<String> tabList= new ArrayList<String>(tabHandle);
		  driver.switchTo().window(tabList.get(1));
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement allCourses= driver.findElement(By.xpath("//a[text()='Access all our Courses']"));
		  allCourses.click();
		  boolean displayed1 = allCourses.isDisplayed();
		  System.out.println(displayed1);
		  boolean enabled1 = allCourses.isEnabled();
		  System.out.println(enabled1);
		  
		  driver.switchTo().window(tabList.get(0));
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement radioButton= driver.findElement(By.xpath("//input[@value='radio1']"));
		  radioButton.click();
		  boolean displayed2 = radioButton.isDisplayed();
		  System.out.println(displayed2);
		  boolean enabled2 = radioButton.isEnabled();
		  System.out.println(enabled2);
		  boolean select = radioButton.isSelected();
		  System.out.println(select);
		  
		  driver.switchTo().window(tabList.get(1));
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.navigate().back();
		  
		  
		  WebElement AboutLink= driver.findElement(By.linkText("About us"));
		  AboutLink.click();
		  boolean displayed3 = AboutLink.isDisplayed();
		  System.out.println(displayed3);
		  boolean enabled3 = AboutLink.isEnabled();
		  System.out.println(enabled3);
		  

		  driver.quit();
		
	

	}

}

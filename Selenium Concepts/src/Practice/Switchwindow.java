package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 WebDriver  driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
		  WebElement openWindow= driver.findElement(By.id("openwindow"));
		  openWindow.click();
		  boolean displayed = openWindow.isDisplayed();
		  System.out.println(displayed);
		  boolean enabled = openWindow.isEnabled();
		  System.out.println(enabled);
		  
		  Set<String> windowHandle =driver.getWindowHandles();
		  ArrayList<String> windowsList= new ArrayList<String>(windowHandle);
		  driver.switchTo().window(windowsList.get(1));
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement allCourses= driver.findElement(By.linkText("Courses"));
		  boolean displayed1 = allCourses.isDisplayed();
		  System.out.println(displayed1);
		  boolean enabled1 = allCourses.isEnabled();
		  System.out.println(enabled1);
		  allCourses.click();
		  
		  driver.switchTo().window(windowsList.get(0));
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  WebElement nameTextBox= driver.findElement(By.xpath("//input[@id='name']"));
		  nameTextBox.sendKeys("suganth");
		  boolean displayed2 = nameTextBox.isDisplayed();
		  System.out.println(displayed2);
		  boolean enabled2 = nameTextBox.isEnabled();
		  System.out.println(enabled2);
		  
		  WebElement alertBtn=driver.findElement(By.id("alertbtn"));
		  alertBtn.click();
		  Alert alert = driver.switchTo().alert();
		  System.out.println(alert.getText());
		  alert.accept();
		  
		  
		  driver.switchTo().window(windowsList.get(1));
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

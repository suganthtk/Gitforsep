package Locators;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement dayMenu = driver.findElement(By.xpath("//select[@class='day']"));
        Select dayList = new Select(dayMenu);
        List<WebElement> dayAllList = dayList.getOptions();
        for (WebElement aa :dayAllList)
        {
        	System.out.println(aa.getText());
        }
        dayList.selectByIndex(3);
        
        
        WebElement monthMenu = driver.findElement(By.xpath("//select[@class='middle month']"));
	    Select monthList = new Select(monthMenu);
	    List<WebElement> monthAllList = monthList.getOptions();
	    for (WebElement aa: monthAllList)
	    {
	    	System.out.println(aa.getText());
	    }
	    monthList.selectByValue("02");
	    
	    WebElement yearMenu = driver.findElement(By.xpath("//select[@class='year']"));
	    Select yearList = new Select(yearMenu);
	    List<WebElement> yearAllList = yearList.getOptions();
	    for (WebElement aa:yearAllList)
	    {
	    	System.out.println(aa.getText());
	    }
	    yearList.selectByVisibleText("2002");
	
	
	
	}

}

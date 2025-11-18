package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement todayDealsLink= driver.findElement(By.linkText("Today's Deals"));
		todayDealsLink.click();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File ssFrom=ts.getScreenshotAs(OutputType.FILE);
		File ssTo=new File("C:\\Users\\Lenovo\\Desktop\\Reports\\ss\\img1.png");
		FileHandler.copy(ssFrom, ssTo);
		
	
	
	
	}

}

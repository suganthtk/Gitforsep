package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		WebElement JobsMenu = driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/nav/ul/li[1]/a[1]/div[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(JobsMenu).perform();
		WebElement RemoteJob = driver.findElement(By.xpath("/html/body/div/div[4]/div[2]/nav/ul/li[1]/div[1]/ul[2]/li[4]/a[1]/div[1]"));
        act.click(RemoteJob).perform();
		//RemoteJob.click();
	}

}

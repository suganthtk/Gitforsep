package Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement createButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createButton.click();
		WebElement termsLink = driver.findElement(By.xpath("//a[@id='terms-link']"));
		termsLink.click();
		Set<String> tabHandles = driver.getWindowHandles();
		System.out.println("Session ID"+tabHandles);
		ArrayList<String> tabList = new ArrayList<String>(tabHandles);
		driver.switchTo().window(tabList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement metaLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[3]/div/span/a"));
		metaLink.click();
		driver.switchTo().window(tabList.get(0));
		WebElement firstBox = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstBox.sendKeys("Aishwarya");
		driver.switchTo().window(tabList.get(1));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement companyLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/div[2]/div[2]/div[4]/div/div[2]/div/span/a"));
        js.executeScript("arguments[0].scrollIntoView();", companyLink);
		
	
	}

}
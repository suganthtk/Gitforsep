package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement mouseHover = driver.findElement(By.cssSelector("button#mousehover"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", mouseHover);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(frameElement);
		WebElement registerButton = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a[1]"));
		registerButton.click();
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0, -5000)");
		WebElement dropElement = driver.findElement(By.cssSelector("select#dropdown-class-example"));
		Select select = new Select(dropElement);
		select.selectByVisibleText("Option2");
		
		

	}

}
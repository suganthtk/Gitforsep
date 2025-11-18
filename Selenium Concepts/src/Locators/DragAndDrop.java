package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement dragElement = driver.findElement(By.id("draggable"));
        WebElement dropElement = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(dragElement, dropElement).perform();
        driver.switchTo().defaultContent();
        WebElement resizeElement = driver.findElement(By.linkText("Resizable"));
        resizeElement.click();
        driver.quit();
        
        
	}

}

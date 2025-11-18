package Locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    WebElement RightClickButton = driver.findElement(By.xpath("/html/body/span"));
		Actions act = new Actions(driver);
		act.contextClick(RightClickButton).perform();
		Thread.sleep(2000);
		WebElement PasteButton = driver.findElement(By.xpath("/html/body/ul/li[4]/span"));
		act.click(PasteButton).perform();
		//PasteButton.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		WebElement DoubleClickButton = driver.findElement(By.xpath("/html/body/button"));
		act.doubleClick(DoubleClickButton).perform();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		driver.quit();
	}

}

package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationPractice {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement text = driver.findElement(By.xpath("//h2[text()='ShadowDOM']"));
		js.executeScript("arguments[0].scrollIntoView();", text);
		
	}
}

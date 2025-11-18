package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonlinks {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement link :links) {
			
			System.out.println(link.getText());
		}
		System.out.println("Number of links: " + links.size());
		
		
        List<WebElement> divTag= driver.findElements(By.tagName("div"));
        System.out.println("Number of div tags : " + divTag.size());
		
		
        List<WebElement> inputTag= driver.findElements(By.tagName("input"));
        System.out.println("Number of input tags : " + inputTag.size());
	

		
        List<WebElement> buttonTag= driver.findElements(By.tagName("button"));	
        System.out.println("Number of button tags : " +buttonTag.size());
		
			
		
	}	

}
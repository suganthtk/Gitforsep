package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomTask {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0, 3000)");
    	
    	//First find the shadow element
        WebElement shadowElement = driver.findElement(By.cssSelector("div#shadow_host"));
        
        //Get shadow root
        SearchContext shadowRoot = shadowElement.getShadowRoot();
        
//        WebElement linkBlog = shadowRoot.findElement(By.linkText("Blog"));
//        linkBlog.click();
        
        WebElement textBox = shadowRoot.findElement(By.cssSelector("input[type='text']"));
        textBox.sendKeys("Tester");
	}

}



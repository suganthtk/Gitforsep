package WebPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahuldemo {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		 WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio2']"));
		 radioButton.click();
         boolean displayed =radioButton.isDisplayed();
		 System.out.println(displayed);
		 boolean enabled = radioButton.isEnabled();
		 System.out.println(enabled);
		 boolean select =radioButton.isSelected();
		 System.out.println(select);

		 WebElement suggestion = driver.findElement(By.cssSelector("input#autocomplete"));
		 suggestion.sendKeys("in");
		 
		 List<WebElement> element = driver.findElements(By.cssSelector("li.ui-menu-item div"));
		 
		 for (WebElement aa : element) {
			if (aa.getText().equalsIgnoreCase("Finland")) {
				aa.click();
				break;
				
			}
		}
		 
		 System.out.println("selected country:" + suggestion.getAttribute("value"));

		 
		 
	}
}

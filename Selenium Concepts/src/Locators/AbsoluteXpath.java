package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement createNewButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a"));
		boolean displayed = createNewButton.isDisplayed();
		System.out.println(displayed);
		boolean enabled = createNewButton.isEnabled();
		System.out.println(enabled);
		createNewButton.click();
		WebElement maleButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span[2]/label/input"));
		boolean displayed2 = maleButton.isDisplayed();
		System.out.println(displayed2);
		boolean enabled2 = maleButton.isEnabled();
		System.out.println(enabled2);
		boolean selected = maleButton.isSelected();
		System.out.println(selected);
		if (selected!=true)
		{
			maleButton.click();
		}
		
				
	}

}

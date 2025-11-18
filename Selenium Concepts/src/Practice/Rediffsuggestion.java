package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rediffsuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement createButton = driver.findElement(By.id("Register"));
		js.executeScript("arguments[0].scrollIntoView();", createButton);
		WebElement suggestionMenu = driver.findElement(By.xpath("//div[@class='countryCodeText']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(suggestionMenu));
		suggestionMenu.click();
		
		List<WebElement> suggestionList = driver.findElements(By.cssSelector("div#country_id>ul>li"));
		for (WebElement countryLists:suggestionList)
		{
			String countries=countryLists.getText();
			System.out.println(countries);
			
		}
		for (WebElement country:suggestionList)
		{
			js.executeScript("arguments[0].scrollIntoView();", createButton);

			if(country.getText().endsWith("nam (+84)")) {
				country.click();
				
				break;
			}		
		
		}
		
		
		
	}


}

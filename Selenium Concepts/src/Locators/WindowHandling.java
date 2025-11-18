package Locators;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().newWindow(WindowType.WINDOW).navigate().to("https://www.axisbank.com/");
        System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> arrayList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrayList.get(0));
		WebElement closeButton = driver.findElement(By.cssSelector("span[data-cy='closeModal']"));
		closeButton.click();
		driver.switchTo().window(arrayList.get(1));
		WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[11]/div[1]/div[1]/div[2]/div/button[2]"));
		cookieButton.click();
		
	}

}

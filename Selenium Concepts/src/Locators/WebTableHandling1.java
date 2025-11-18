package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://money.rediff.com/companies/most-traded?src=moneyhome_mosttraded_more");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200)");
		List<WebElement> tHeadingRow = driver.findElements(By.xpath("/html//body/div[6]/div/table/thead/tr"));
		int headingSize = tHeadingRow.size();
		System.out.println(headingSize);
		for (int i=1; i<=headingSize; i++)
		{
			List<WebElement> tHeadingColumn = driver.findElements(By.xpath("/html//body/div[6]/div/table/thead/tr["+i+"]/th"));
			int headingColumnSize = tHeadingColumn.size();
			for (int j=1; j<=headingColumnSize; j++)
			{
				WebElement tHeadingData = driver.findElement(By.xpath("/html//body/div[6]/div/table/thead/tr["+i+"]/th["+j+"]"));
				System.out.print(tHeadingData.getText()+ " | ");
			}
			System.out.println();
		}
		
		List<WebElement> tbRow = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr"));
		int tbRowSize = tbRow.size();
		for (int i=1; i<=tbRowSize; i++)
		{
			List<WebElement> tbColumn = driver.findElements(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td"));
			int tbColumnSize = tbColumn.size();
			for (int j=1; j<=tbColumnSize; j++)
			{
				WebElement tbData = driver.findElement(By.xpath("/html/body/div[6]/div/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tbData.getText()+ " | ");
			}
			System.out.println();
		}
	}

}

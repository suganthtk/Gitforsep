package WebPage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageRahul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600)");
		
		//webtable
		
		List<WebElement> headRow = driver.findElements(By.xpath("/html/body/div[3]/div/fieldset/table/tbody/tr[1]"));
		int headRowSize = headRow.size();
		System.out.println(headRowSize);
		for (int i=1; i<=headRowSize; i++)
		{
			List<WebElement> tHeadingColumn = driver.findElements(By.xpath("/html//body/div[3]/div/fieldset/table/tbody/tr["+i+"]/th"));
			int headingColumnSize = tHeadingColumn.size();
			System.out.println(headingColumnSize);
			for (int j=1; j<=headingColumnSize; j++)
			{
				WebElement tHeadingData = driver.findElement(By.xpath("/html//body/div[3]/div/fieldset/table/tbody/tr["+i+"]/th["+j+"]"));
				System.out.print(tHeadingData.getText()+ " | ");
			}
			System.out.println();
		}
		List<WebElement> tbRow = driver.findElements(By.xpath("/html/body/div[3]/div/fieldset/table/tbody/tr"));
		int tbRowSize = tbRow.size();
		for (int i=1; i<=tbRowSize; i++)
		{
			List<WebElement> tbColumn = driver.findElements(By.xpath("/html/body/div[3]/div/fieldset/table/tbody/tr["+i+"]/td"));
			int tbColumnSize = tbColumn.size();
			for (int j=1; j<=tbColumnSize; j++)
			{
				WebElement tbData = driver.findElement(By.xpath("/html/body/div[3]/div/fieldset/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tbData.getText()+ " | ");

			}
			System.out.println();
			
		}
		System.out.println("------------------------------------------------");

		//Webtable Fixed
		
		List<WebElement> headRow1  = driver.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/thead/tr"));
		int headRowSize1 = headRow1.size();
		System.out.println(headRowSize1);
		for (int i=1; i<=headRowSize1; i++)
		{
			List<WebElement> tHeadingColumn1 = driver.findElements(By.xpath("/html//body/div[3]/div[2]/fieldset[2]/div[1]/table/thead/tr["+i+"]/th"));
			int headingColumnSize1 = tHeadingColumn1.size();
			//System.out.println(headingColumnSize1);
			for (int j=1; j<=headingColumnSize1; j++)
			{
				WebElement tHeadingData1 = driver.findElement(By.xpath("/html//body/div[3]/div[2]/fieldset[2]/div[1]/table/thead/tr["+i+"]/th["+j+"]"));
				System.out.print(tHeadingData1.getText()+ " | ");
			}
			System.out.println();
		}
		
		List<WebElement> tbRow1  = driver.findElements(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr"));
		int tbRowSize1 = tbRow1.size();
		System.out.println(tbRowSize1);
		for (int i=1; i<=tbRowSize1; i++)
		{
			List<WebElement> tbColumn1 = driver.findElements(By.xpath("/html//body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr["+i+"]/td"));
			int tbColumnSize1 = tbColumn1.size();
//			System.out.println(tbColumnSize1);
			for (int j=1; j<=tbColumnSize1; j++)
			{
				WebElement tbData1 = driver.findElement(By.xpath("/html//body/div[3]/div[2]/fieldset[2]/div[1]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tbData1.getText()+ " | ");
			}
			System.out.println();
		}


}
}

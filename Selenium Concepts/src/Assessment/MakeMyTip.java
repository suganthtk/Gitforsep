package Assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTip {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
				
				WebElement closeButton= driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
				closeButton.click();
				
				WebElement Departure= driver.findElement(By.xpath("//span[text()='Departure']"));
				Departure.click();
				
				
				List<WebElement> headingRow=driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div"));
				int headingSize=headingRow.size();
				System.out.println(headingSize);
				for(int i=1;i<=headingSize;i++) {
					
					List<WebElement> headingColumn=driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div["+i+"]/div"));
					int headingColSize=headingColumn.size();
					
					for(int j=1;j<=headingColSize;j++) {
						
						WebElement headingDetails=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div[1]/div[2]/div["+i+"]/div["+j+"]"));
						System.out.print(headingDetails.getText()+"  ||  ");
						
					}
					System.out.println();
					
				}
				   
						
				
				List<WebElement> tableRow=driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div"));
				int tableRowSize=tableRow.size();
//				System.out.println(tableRowSize);
				for(int i=1;i<=tableRowSize;i++) {
					
					List<WebElement> tableColumn=driver.findElements(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div["+i+"]/div"));
					int tableColSize=tableColumn.size();
					
					for(int j=1;j<=tableColSize;j++) {
						
						WebElement tableDetails=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/div[2]/div/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div["+i+"]/div["+j+"]"));
						System.out.print(tableDetails.getText()+"  ||  ");
						
					}
					System.out.println();
					
				}
				
				
			}

	
	}



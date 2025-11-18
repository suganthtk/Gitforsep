package Assessment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement closeButton = driver.findElement(By.cssSelector("span[data-cy='closeModal']"));
		closeButton.click();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenShotFrom = ts.getScreenshotAs(OutputType.FILE);
		File screenShotTo = new File("C:\\Users\\Lenovo\\Desktop\\Reports\\ss\\ts.png");
		FileHandler.copy(screenShotFrom, screenShotTo);

	}


	}


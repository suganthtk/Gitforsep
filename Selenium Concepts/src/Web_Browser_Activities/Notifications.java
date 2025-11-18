package Web_Browser_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.axisbank.com/");
		

	}

}



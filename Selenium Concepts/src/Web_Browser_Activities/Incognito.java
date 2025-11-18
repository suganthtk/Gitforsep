package Web_Browser_Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		FirefoxOptions options = new FirefoxOptions();
//		options.addArguments("--private");
//		FirefoxDriver driver = new FirefoxDriver(options);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.facebook.com/");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		
	}

}

package Web_Browser_Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized", "--incognito");
		WebDriver driver = new ChromeDriver(options);

	}

}


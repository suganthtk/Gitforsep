package WebPage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://automationexercise.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
        //Absolute xpath
		//WebElement productField = driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[2]/a"));
		
		//Relative xpath
		WebElement productField = driver.findElement(By.xpath("//a[text()=' Products']"));
		boolean displayed = productField.isDisplayed();
		System.out.println(displayed);
		boolean enabled = productField.isEnabled();
		System.out.println(enabled);
		productField.click();
		
		//Absolute xpath	
		//WebElement productName = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div/div/p[1]"));
		
		//Relative xpath
		WebElement productName = driver.findElement(By.xpath("(//p[text()='Blue Top'])[1]"));
		String itemName= productName.getText();
		
		
		//Absolute xpath	
		//WebElement addToCartButton = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div/div/a"));
		
		//Relative xpath
		WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        boolean displayed1 = addToCartButton.isDisplayed();
		System.out.println(displayed1);
		boolean enabled1 = addToCartButton.isEnabled();
		System.out.println(enabled1);
		addToCartButton.click();
		
		//Absolute xpath
		//WebElement viewCartButton = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div/div/div/div[2]/p[2]/a"));
		
		//Relative xpath
		WebElement viewCartButton = driver.findElement(By.xpath("//u"));
		boolean displayed2 = viewCartButton.isDisplayed();
		System.out.println(displayed2);
		boolean enabled2 = viewCartButton.isEnabled();
		System.out.println(enabled2);
		viewCartButton.click();
		
		//Absolute xpath
		//WebElement productNameIncart=driver.findElement(By.xpath("/html/body/section/div/div[2]/table/tbody/tr/td[2]/h4/a"));
		
		//Relative xpath
		WebElement productNameIncart=driver.findElement(By.xpath("//a[text()='Blue Top']"));
		
		String itemNameInCart= productNameIncart.getText();
		if(itemName.equals(itemNameInCart)) {
			System.out.println("product successfully added to cart");
		}else {
			System.out.println("product is not added to cart");
		}

	}

}


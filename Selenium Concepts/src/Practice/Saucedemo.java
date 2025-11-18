package Practice;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Saucedemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.navigate().to("https://www.saucedemo.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			WebElement userName = driver.findElement(By.id("user-name"));
			boolean displayed = userName.isDisplayed();
			System.out.println(displayed);
			boolean enabled = userName.isEnabled();
			System.out.println(enabled);
			userName.sendKeys("standard_user");
			
			WebElement password = driver.findElement(By.id("password"));
			boolean displayed1 = password.isDisplayed();
			System.out.println(displayed1);
			boolean enabled1 = password.isEnabled();
			System.out.println(enabled1);
			password.sendKeys("secret_sauce");
			
			WebElement  loginBtn= driver.findElement(By.id("login-button"));
			boolean displayed2 = loginBtn.isDisplayed();
			System.out.println(displayed2);
			boolean enabled2 = loginBtn.isEnabled();
			System.out.println(enabled2);
			loginBtn.click();
			
			//Absolute xpath
			//WebElement  productName= driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a[1]/div[1]"));
			
			//Relative xpath
			WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
			String itemName=productName.getText();
			
			
			WebElement  addToCart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			boolean displayed3 = addToCart.isDisplayed();
			System.out.println(displayed3);
			boolean enabled3 = addToCart.isEnabled();
			System.out.println(enabled3);
			addToCart.click();
			
			
			
			WebElement  CartBtn= driver.findElement(By.className("shopping_cart_link"));
			boolean displayed4 = CartBtn.isDisplayed();
			System.out.println(displayed4);
			boolean enabled4 = CartBtn.isEnabled();
			System.out.println(enabled4);
			CartBtn.click();
			
			
			WebElement  productNameInCart= driver.findElement(By.className("inventory_item_name"));
			String itemNameInCart=productNameInCart.getText();
			if(itemName.equals(itemNameInCart)) {
				System.out.println("product successfully added to cart");
			}else {
				System.out.println("product is not added to cart");
			}
			

		}

	}



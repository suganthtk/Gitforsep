package Practice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://automationexercise.com/");
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				
				
				WebElement productField = driver.findElement(By.xpath("//a[text()=' Products']"));
				boolean pfDisplayed = productField.isDisplayed();
				System.out.println(pfDisplayed);
				boolean pfEnabled = productField.isEnabled();
				System.out.println(pfEnabled);
				productField.click();
				
				
				JavascriptExecutor js =(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				
				
				
				
     			WebElement productName = driver.findElement(By.xpath("(//p[text()='Blue Top'])[1]"));
				String itemName= productName.getText();
				System.out.println(itemName);
				
					
				WebElement addToCartButton = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		        boolean atcDisplayed = addToCartButton.isDisplayed();
				System.out.println(atcDisplayed);
				boolean atcEnabled = addToCartButton.isEnabled();
				System.out.println(atcEnabled);
				addToCartButton.click();
				
				
				WebElement viewCartButton = driver.findElement(By.xpath("//u[text()='View Cart']"));
				boolean vcdisplayed = viewCartButton.isDisplayed();
				System.out.println(vcdisplayed);
				boolean vcEnabled = viewCartButton.isEnabled();
				System.out.println(vcEnabled);
				viewCartButton.click();
				
				WebElement proceedButton = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
				boolean pbDisplayed = proceedButton.isDisplayed();
				System.out.println(pbDisplayed);
				boolean pbEnabled = proceedButton.isEnabled();
				System.out.println(pbEnabled);
				proceedButton.click();

				
				WebElement loginBtn = driver.findElement(By.xpath("//u[text()='Register / Login']"));
				boolean lbDisplayed = loginBtn.isDisplayed();
				System.out.println(lbDisplayed );
				boolean enabled4 = loginBtn.isEnabled();
				System.out.println(enabled4);
				loginBtn.click();

				
				WebElement nameField = driver.findElement(By.xpath("//input[@placeholder='Name']"));
				nameField.sendKeys("suganth");
				boolean nfDisplayed = nameField.isDisplayed();
				System.out.println(nfDisplayed);
				boolean nfEnabled = nameField.isEnabled();
				System.out.println(nfEnabled);
				
				WebElement emailField = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
				emailField.sendKeys("suganth@71");
				boolean efDisplayed = emailField.isDisplayed();
				System.out.println(efDisplayed);
				boolean efEnabled = emailField.isEnabled();
				System.out.println(efEnabled);
				
				WebElement signupBtn = driver.findElement(By.xpath("//button[text()='Signup']"));
				signupBtn.click();
				
				WebElement titleBtn = driver.findElement(By.xpath("//input[@value='Mr']"));
				boolean tbDisplayed = titleBtn.isDisplayed();
				System.out.println(tbDisplayed);
				boolean tbEnabled = titleBtn.isEnabled();
				System.out.println(tbEnabled);
				boolean selected = titleBtn.isSelected();
				System.out.println(selected);
				titleBtn.click();
				
				WebElement passwordField = driver.findElement(By.id("password"));
				passwordField.sendKeys("12345");
				boolean psDisplayed = passwordField.isDisplayed();
				System.out.println(psDisplayed);
				boolean psEnabled = passwordField.isEnabled();
				System.out.println(psEnabled);
				
				WebElement dayField = driver.findElement(By.id("days"));
				Select day= new Select(dayField);
				day.selectByValue("27");
				WebElement monthField = driver.findElement(By.id("months"));
				Select month= new Select(monthField);
				month.selectByValue("5");
				WebElement yearField = driver.findElement(By.id("years"));
				Select year= new Select(yearField);
				year.selectByValue("2000");
				
				
				WebElement firstNameField = driver.findElement(By.id("first_name"));
				firstNameField.sendKeys("suganth");
				boolean fsDisplayed = firstNameField.isDisplayed();
				System.out.println(fsDisplayed);
				boolean fsEnabled = firstNameField.isEnabled();
				System.out.println(fsEnabled);
				
				WebElement lastNameField = driver.findElement(By.id("last_name"));
				lastNameField.sendKeys("suganth");
				boolean lsDisplayed = lastNameField.isDisplayed();
				System.out.println(lsDisplayed);
				boolean lsEnabled = lastNameField.isEnabled();
				System.out.println(lsEnabled);
				
				WebElement addressField = driver.findElement(By.xpath("//input[@data-qa='address']"));
				addressField.sendKeys("64-G block");
				boolean afDisplayed = addressField.isDisplayed();
				System.out.println(afDisplayed);
				boolean afEnabled = addressField.isEnabled();
				System.out.println(afEnabled);
				
				WebElement addressField1 = driver.findElement(By.xpath("//input[@data-qa='address2']"));
				addressField1.sendKeys("Chennai");
				boolean af1Displayed = addressField.isDisplayed();
				System.out.println(af1Displayed);
				boolean af1Enabled = addressField.isEnabled();
				System.out.println(af1Enabled);
				
				WebElement countryField = driver.findElement(By.id("country"));
				Select sel =new Select(countryField);
				sel.selectByVisibleText("India");
				
				WebElement stateField = driver.findElement(By.id("state"));
				stateField.sendKeys("Tamilnadu");
				boolean sfDisplayed = stateField.isDisplayed();
				System.out.println(sfDisplayed);
				boolean sfEnabled = stateField.isEnabled();
				System.out.println(sfEnabled);
				
				WebElement cityField = driver.findElement(By.id("city"));
				cityField.sendKeys("Vellore");
				boolean cfDisplayed = cityField.isDisplayed();
				System.out.println(cfDisplayed);
				boolean cfEnabled = cityField.isEnabled();
				System.out.println(cfEnabled);
				
				WebElement codeField = driver.findElement(By.id("zipcode"));
				codeField.sendKeys("632009");
				boolean codeDisplayed = codeField.isDisplayed();
				System.out.println(codeDisplayed);
				boolean codeEnabled = codeField.isEnabled();
				System.out.println(codeEnabled);
				
				WebElement mobileNum = driver.findElement(By.id("mobile_number"));
				mobileNum.sendKeys("9876543210");
				boolean mobileDisplayed = mobileNum.isDisplayed();
				System.out.println(mobileDisplayed);
				boolean mobileEnabled = mobileNum.isEnabled();
				System.out.println(mobileEnabled);
				
				WebElement createBtn = driver.findElement(By.xpath("//button[text()='Create Account']"));
				boolean createBtnDisplayed = createBtn.isDisplayed();
				System.out.println(createBtnDisplayed);
				boolean createBtnEnabled = createBtn.isEnabled();
				System.out.println(createBtnEnabled);
				createBtn.click();
				
				
				WebElement continueBtn = driver.findElement(By.xpath("//a[text()='Continue']"));
				boolean continueBtnDisplayed = continueBtn.isDisplayed();
				System.out.println(continueBtnDisplayed);
				boolean continueBtnEnabled = continueBtn.isEnabled();
				System.out.println(continueBtnEnabled);
				continueBtn.click();
				
				WebElement cartBtn = driver.findElement(By.xpath("//a[text()=' Cart']"));
				boolean cartBtnDisplayed = cartBtn.isDisplayed();
				System.out.println(cartBtnDisplayed);
				boolean cartBtnEnabled = cartBtn.isEnabled();
				System.out.println(cartBtnEnabled);
				cartBtn.click();
				
				WebElement proceedButton1 = driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
				boolean pbDisplayed1 = proceedButton1.isDisplayed();
				System.out.println(pbDisplayed1);
				boolean pbEnabled1 = proceedButton1.isEnabled();
				System.out.println(pbEnabled1);
				proceedButton1.click();
				
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				WebElement orderBtn = driver.findElement(By.xpath("//a[text()='Place Order']"));
				boolean obDisplayed = orderBtn.isDisplayed();
				System.out.println(obDisplayed);
				boolean obEnabled = orderBtn.isEnabled();
				System.out.println(obEnabled);
				orderBtn.click();
				
				WebElement name = driver.findElement(By.name("name_on_card"));
				boolean nameDisplayed = name.isDisplayed();
				System.out.println(nameDisplayed);
				boolean nameEnabled = name.isEnabled();
				System.out.println(nameEnabled);
				name.sendKeys("suganth");
				
				WebElement cardNum = driver.findElement(By.name("card_number"));
				boolean cardNumDisplayed = cardNum.isDisplayed();
				System.out.println(cardNumDisplayed);
				boolean cardNumEnabled = cardNum.isEnabled();
				System.out.println(cardNumEnabled);
				cardNum.sendKeys("123456789");
				
				WebElement cvc = driver.findElement(By.name("cvc"));
				boolean cvcDisplayed = cvc.isDisplayed();
				System.out.println(cvcDisplayed);
				boolean cvcEnabled = cvc.isEnabled();
				System.out.println(cvcEnabled);
				cvc.sendKeys("123");
				
				WebElement expMon = driver.findElement(By.name("expiry_month"));
				boolean expMonDisplayed = expMon.isDisplayed();
				System.out.println(expMonDisplayed);
				boolean expMonEnabled = expMon.isEnabled();
				System.out.println(expMonEnabled);
				expMon.sendKeys("12");
				
				WebElement expYr = driver.findElement(By.name("expiry_year"));
				boolean expYrDisplayed = expYr.isDisplayed();
				System.out.println(expYrDisplayed);
				boolean expYrEnabled = expYr.isEnabled();
				System.out.println(expYrEnabled);
				expYr.sendKeys("2025");
				
				WebElement payBtn = driver.findElement(By.xpath("//button[text()='Pay and Confirm Order']"));
				boolean payBtnDisplayed = payBtn.isDisplayed();
				System.out.println(payBtnDisplayed);
				boolean payBtnEnabled = payBtn.isEnabled();
				System.out.println(payBtnEnabled);
				payBtn.click();
				
				
				WebElement invoiceBtn = driver.findElement(By.xpath("//a[text()='Download Invoice']"));
				boolean invoiceBtnDisplayed = invoiceBtn.isDisplayed();
				System.out.println(invoiceBtnDisplayed);
				boolean invoiceBtnEnabled = invoiceBtn.isEnabled();
				System.out.println(invoiceBtnEnabled);
				invoiceBtn.click();
				
				WebElement continueButton = driver.findElement(By.xpath("//a[text()='Continue']"));
				boolean continueButtonDisplayed = continueButton.isDisplayed();
				System.out.println(continueButtonDisplayed);
				boolean continueButtonEnabled = continueButton.isEnabled();
				System.out.println(continueButtonEnabled);
				continueButton.click();
				
			
			
			}

		

	}



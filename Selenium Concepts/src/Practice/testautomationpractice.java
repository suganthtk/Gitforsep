package Practice;

	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class testautomationpractice {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.get("https://testautomationpractice.blogspot.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
			 
			 WebElement nameTextBox=driver.findElement(By.id("name"));
			 boolean displayed =nameTextBox.isDisplayed();
			 System.out.println(displayed);
			 boolean enabled = nameTextBox.isEnabled();
			 System.out.println(enabled);
			 nameTextBox.sendKeys("Suganth");
			 
			 
			 WebElement emailTextBox=driver.findElement(By.id("email"));
			 boolean displayed1 =emailTextBox.isDisplayed();
			 System.out.println(displayed1);
			 boolean enabled1 = emailTextBox.isEnabled();
			 System.out.println(enabled1);
			 emailTextBox.sendKeys("sugu1234@gmail.com");
			 
			 
			 WebElement phoneNumber=driver.findElement(By.id("phone"));
			 boolean displayed2 =phoneNumber.isDisplayed();
			 System.out.println(displayed2);
			 boolean enabled2 =phoneNumber.isEnabled();
			 System.out.println(enabled2);
			 phoneNumber.sendKeys("9876543210");

			 
			 WebElement addressTextBox=driver.findElement(By.id("textarea"));
			 boolean displayed3 = addressTextBox.isDisplayed();
			 System.out.println(displayed3);
			 boolean enabled3 = addressTextBox.isEnabled();
			 System.out.println(enabled3);
			 addressTextBox.sendKeys("chennai");
			 
			  
			 WebElement maleRadioButtom=driver.findElement(By.id("male"));
			 maleRadioButtom.click();
			 boolean displayed4 = maleRadioButtom.isDisplayed();
			 System.out.println(displayed4);
			 boolean enabled4 = maleRadioButtom.isEnabled();
			 System.out.println(enabled4);
			 boolean select = maleRadioButtom.isSelected();
	     	 System.out.println(select);
			 
			 
			     	 
	     	 WebElement tuesdayRadiobutton=driver.findElement(By.id("tuesday"));
	     	tuesdayRadiobutton.click();
			 boolean displayed8 = tuesdayRadiobutton.isDisplayed();
			 System.out.println(displayed8);
			 boolean enabled8 = tuesdayRadiobutton.isEnabled();
			 System.out.println(enabled8);
			 boolean select4 = tuesdayRadiobutton.isSelected();
	     	 System.out.println(select4);
	     	 
	     	 
	     	 WebElement country=driver.findElement(By.id("country"));
	     	 Select sele = new Select(country);
	     	 sele.selectByVisibleText("India");
		     boolean countrydisplayed = country.isDisplayed();
			 System.out.println(countrydisplayed);
			 boolean countryenabled = country.isEnabled();
			 System.out.println(countryenabled);
	     	 
			 WebElement color=driver.findElement(By.id("colors"));
	     	 Select clr = new Select(color);
	     	 clr.selectByVisibleText("Red");
		     boolean colordisplayed = color.isDisplayed();
			 System.out.println(colordisplayed);
			 boolean colorenabled = color.isEnabled();
			 System.out.println(colorenabled);
			 
			 
			 WebElement animal=driver.findElement(By.id("animals"));
	     	 Select ani = new Select(animal);
	     	 ani.selectByVisibleText("Rabbit");
		     boolean animaldisplayed = animal.isDisplayed();
			 System.out.println(animaldisplayed);
			 boolean animalenabled = animal.isEnabled();
			 System.out.println(animalenabled);
	     	
			 
	     	 WebElement alertButton=driver.findElement(By.id("alertBtn"));
			 boolean display4 = alertButton.isDisplayed();
			 System.out.println(display4);
			 boolean enable4 = alertButton.isEnabled();
			 System.out.println(enable4);
	     	 alertButton.click();
	     	 Alert alert= driver.switchTo().alert();
	     	 System.out.println(alert.getText());
	     	 alert.accept();
	     	 
	     	 
	    	 WebElement mouseHover=driver.findElement(By.className("dropbtn"));
	    	 Actions act= new Actions(driver);
	    	 act.moveToElement(mouseHover).perform();
	    	 WebElement laptopsLink=driver.findElement(By.linkText("Laptops"));
	    	 System.out.println(laptopsLink.getText());
	    	 act.click(laptopsLink).perform();
	    	 	 
			 Thread.sleep(1000);	
			 
	    	 //Absolute xpath
	    	 //WebElement doubleClick=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[3]/div/aside/div/div[7]/div/button"));
	    	 
	    	 //Relative xpath
			 WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
	    	 act.doubleClick(doubleClick).perform();

	    	 WebElement draggableElement=driver.findElement(By.id("draggable"));
	    	 WebElement droppableElement=driver.findElement(By.id("droppable"));
	    	 act.dragAndDrop(draggableElement, droppableElement).perform();
	    	 
	    	 
	    	 WebElement lenovoLink=driver.findElement(By.linkText("Lenovo"));
	    	 lenovoLink.click();
	    	 
	    	 driver.navigate().back();
	    	 

	    	 JavascriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript("window.scrollBy(0,1300 )");
	         
	         WebElement sectionOne =driver.findElement(By.className("input-field"));
	         sectionOne.sendKeys("hello");
	         WebElement sumitButton =driver.findElement(By.className("rectangular-button"));
	         sumitButton.click();
	         
	    	 
		}


}

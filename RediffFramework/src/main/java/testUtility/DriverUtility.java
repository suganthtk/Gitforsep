	package testUtility;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.io.FileHandler;
	import org.openqa.selenium.support.ui.Select;

	import testBase.BaseClass;

	public class DriverUtility extends BaseClass {
		
		static Select sel;
		static Actions act;
		
		
		
		public static void getMaximize()
		{
			driver.manage().window().maximize();
		}
		
		public static void getMinimize()
		{
			driver.manage().window().minimize();
		}
		
		public static void getImplicitWait()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		}
		
		public static void getImplicitWait(int num)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(num));
		}
		
		public static void openPageUrl(String url)
		{
			driver.get(url);
		}
		
		public static String getPageTitle()
		{	
			return driver.getTitle();
		}
		
		public static String getPageUrl()
		{
			return driver.getCurrentUrl();
		}
		
		public static void getEnterInput(WebElement element, String value)
		{
			element.sendKeys(value);
		}
		
		public static void getClearText(WebElement element)
		{
			element.clear();
		}
		
		public static void getClick(WebElement element)
		{
			element.click();
		}
		
		public static boolean isElementDisplayed(WebElement element)
		{
			return element.isDisplayed();
		}
		
		public static boolean isElementEnabled(WebElement element)
		{
			return element.isEnabled();
		}
		
		public static boolean isElementSelected(WebElement element)
		{
			return element.isSelected();
		}
		
		public static void alertAndAccept()
		{
			driver.switchTo().alert().accept();
		}
		
		public static void alertAndDismiss()
		{
			driver.switchTo().alert().dismiss();
		}
		
		public static String alertAndGetText()
		{
			return driver.switchTo().alert().getText();
		}
		
		public static void alertAndEnterText(String text)
		{
			  driver.switchTo().alert().sendKeys(text);
			
		}
		
		public static void getDropDownValue(WebElement element, String value)
		{
			 sel =new Select(element);
			 sel.selectByValue(value);
		}
		
		public static void getDropDownIndex(WebElement element, int indexValue)
		{
			sel= new Select(element);
			sel.selectByIndex(indexValue);
		}
		
		public static void getDropDownVisibleText(WebElement element, String text)
		{
			sel= new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public static void getMouseHover(WebElement element)
		{
			act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		public static void getDoubleClick(WebElement element)
		{
			act = new Actions(driver);
			act.doubleClick(element).perform();
		}
		
		public static void getRightClick(WebElement element)
		{
			act = new Actions(driver);
			act.contextClick(element).perform();
		}
		
		public static void getDragAndDrop(WebElement elementDrag, WebElement elementDrop)
		{
			act = new Actions(driver);
			act.dragAndDrop(elementDrag, elementDrop).perform();
		}
		
		public static void getForward()
		{
			driver.navigate().forward();
		}
		
		public static void getBack()
		{
			driver.navigate().back();
		}
		
		public static void getRefresh()
		{
			driver.navigate().refresh();
		}
		
		public static void getToUrl(String url)
		{
			driver.navigate().to(url);
		}
		
		public static void frameWithElement(WebElement element)
		{
			driver.switchTo().frame(element);
		}
		
		public static void frameWithIndex(int num)
		{
			driver.switchTo().frame(num);
		}
		
		public static void frameWithName(String name) 
		{
			driver.switchTo().frame(name);
		}
		
		public static void getLeaveFrame()
		{
			driver.switchTo().defaultContent();
		}
		
		public static void getScreenShot(String fileName)
		{
			String filePath="screenshots/";
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File screenshotTo = new File(filePath+fileName+".png");
			try {
				FileHandler.copy(screenshotAs, screenshotTo);
			} catch (IOException e) {
				e.printStackTrace();
			}
				
		}
		
		public static void getScrollBy(int x, int y)
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public static void getScrollToBottom()
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight");
		}
		
		public static void getScrollToTop()
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight");
		}
		
		public static void getScrollToRight()
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(document.body.scrollHeight,0");
		}
		
		public static void getScrollToLeft()
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(-document.body.scrollHeight,0");
		}
		
		public static void getScrollToElement(WebElement element)
		{
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		
		public static void closeTab()
		{
			driver.close();
		}
		
		public static void closeBrowser()
		{
			driver.quit();
		}
		
	}




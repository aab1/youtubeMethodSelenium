package library;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Library {
	
	private static  WebDriver driver;
	private static Select select;
	private static Actions action;
	
	static
	{
		driver = null;
		select = null;
		action = null;
	}
	private static WebDriver initFirefox() throws Exception
	{
		return new FirefoxDriver();
	}
	
	private static WebDriver initChrome() throws Exception
	{
		System.setProperty("WebDriver.chrome","./lib/Browser/chromedriver.exe" );
		return new ChromeDriver();
	}
	
	private static WebDriver initInternetExplorer() throws Exception
	{
		System.setProperty("WebDriver.chrome","./lib/Browser/chromedriver.exe" );
		return new InternetExplorerDriver();
	}

	/*#############################################################
	Uses - This method launches any browser assigned to it
	It takes Chrome, Firefox and IE and initialises the driver
	###############################################################*/
	public static void LaunchBrowser(String browserName) throws Exception
	{
		switch(browserName.toLowerCase())
		{
		case "chrome" :
			driver = initChrome();
			break;
		case "firefox" :
			driver = initFirefox();
			break;
		case "ie":
		case "internetexplorer":
		case "internet explorer":
			driver = initInternetExplorer();
			break;
			
			default:
				System.out.println(browserName + " is not recognised, so Chrome browser is launched");
				driver = initChrome();
		}
		//the command below maximizes the browser when launched
		driver.manage().window().maximize();
	}
	
	
	/*#####################################################
	Uses - This method closes any browser open by selenium
	It is used to clean up afterwards
	#######################################################*/
	public static void closeBrowser() throws Exception
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
	
	/*#########################################################
	Uses - This method navigates to any url passed in. 
	Note - url must have this format -> http://www.example.com
	It is called after LaunchBrowser() method has been called.
	###########################################################*/
	public static void launchUrl(String url) throws Exception
	{
		driver.navigate().to(url);
	}
	//########################################################################################
	public static void dismissAlert()
	{
		driver.switchTo().alert().dismiss();
	}
	
	public static void hoverOver(WebElement element) throws Exception
	{
		action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void verifyAnElementIsDisplayed(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isDisplayed());
	}
	
	public static void verifyAnElementIsSelected(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isSelected());
	}
	
	public static void verifyAnElementIsEnabled(WebElement element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.isEnabled());
	}
	
	public static void verifyListOfElementsAreDisplayed(List<WebElement> element) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.size() > 0);
	}
	
	public static void verifyListOfElementsAreDisplayed(List<WebElement> element , int size) throws Exception
	{
		Assert.assertTrue(element + " is not displayed", element.size() > size);
	}
	//#########################################################################################################
	//Methods that deals with screenshot	
	public static File takeScreenShot() throws Exception
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
	public static void saveScreenshot() throws Exception
	{
		String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
		String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
		
		String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);
		
		File screenshot = takeScreenShot();
		
		FileUtils.copyFile(screenshot, new File(fileName));
			
	}
	
	public static void captureAndSaveScreenShot(WebDriver driver) throws Exception
	{
		try{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String dateNow = new SimpleDateFormat("ddMMyy").format(new GregorianCalendar().getTime());
			String timeNow = new SimpleDateFormat("hhmmss").format(new GregorianCalendar().getTime());
			
			String fileName = String.format(".\\Screenshots\\%s\\screenshot_%s", dateNow, timeNow);
			
			FileUtils.copyFile(source, new File(fileName));
			
		}catch(Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
		}

	}
	
//Select by index
	public static void selectByIndex(WebElement element, int index) throws Exception
	{
		select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement element, String value) throws Exception
	{
		select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByVisibleText(WebElement element, String text) throws Exception
	{
		select = new Select(element);
		select.selectByVisibleText(text);
	}
//###########################################################################################################
	public static List<WebElement> getElementsById(String id)throws Exception
	{
		By locator = By.id(id);
		return getElements(locator);
	}
	
	public static WebElement getElementById(String id)throws Exception
	{
		By locator = By.id(id);
		return getElement(locator);
	}
	
	public static List<WebElement> getElementsByClassName(String className)throws Exception
	{
		By locator = By.className(className);
		return getElements(locator);
	}
	
	public static WebElement getElementByClassName(String className)throws Exception
	{
		By locator = By.className(className);
		return getElement(locator);
	}
	/*For css selector*/
	public static List<WebElement> getElementsByCssSelector(String cssSelector)throws Exception
	{
		By locator = By.cssSelector(cssSelector);
		return getElements(locator);
	}
	
	public static WebElement getElementByCssSelector(String cssSelector)throws Exception
	{
		By locator = By.cssSelector(cssSelector);
		return getElement(locator);
	}
	
	public static List<WebElement> getElementsByXpath(String xPath)throws Exception
	{
		By locator = By.xpath(xPath);
		return getElements(locator);
	}
	
	public static WebElement getElementByXpath(String xPath)throws Exception
	{
		By locator = By.xpath(xPath);
		return getElement(locator);
	}
	public static List<WebElement> getElementsByName(String name)throws Exception
	{
		By locator = By.name(name);
		return getElements(locator);
	}
	
	public static WebElement getElementByName(String name)throws Exception
	{
		By locator = By.name(name);
		return getElement(locator);
	}
	
	public static List<WebElement> getElementsByLinkText(String linkText)throws Exception
	{
		By locator = By.linkText(linkText);
		return getElements(locator);
	}
	
	public static WebElement getElementBylinkText(String linkText)throws Exception
	{
		By locator = By.linkText(linkText);
		return getElement(locator);
	}
	//#####################################################################################################
	//find one element
	private static WebElement getElement(By locator) throws Exception
	{
		WebElement element = null;
		int tryCount = 0;
		while(element == null)
		{
			try
			{
				element = driver.findElement(locator);
			}catch(Exception e)
			{
				if (tryCount == 3)
				{
					saveScreenshot();
					System.out.println(element.toString() +" cannot be found");
					throw e;
				}
				Thread.sleep(2000);
				tryCount++;
			}
		}
		System.out.println(element.toString()+ " is now retrieved");
		return element;
	}
	
	//find multiple elements
	
	private static List<WebElement> getElements(By locator) throws Exception
	{
		List<WebElement> element = null;
		int tryCount = 0;
		while(element == null)
		{
			try
			{
				element = driver.findElements(locator);
			}catch(Exception e)
			{
				if (tryCount == 3)
				{
					saveScreenshot();
					System.out.println(element.toString() +" cannot be found");
					throw e;
				}
				Thread.sleep(2000);
				tryCount++;
			}
		}
		System.out.println(element.toString()+ " is now retrieved");
		return element;
	}
	
	
}

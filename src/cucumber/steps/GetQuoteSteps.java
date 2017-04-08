package cucumber.steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.Library;

public class GetQuoteSteps extends Library{
	private WebDriver driver;
	private WebElement getAQuoteSection;
	private WebElement firstName;
	private WebElement lastName;
	private WebElement dateOfBirthDD;
	private WebElement dateOfBirthMM;
	private WebElement dateOfBirthYY;
	private WebElement maleGender;
	private WebElement email;
	private WebElement phoneAreaCode;
	private WebElement mainPhoneNumber;
	private WebElement eircode;
	private WebElement findAddressBtn;
	private WebElement selectYesToEircode;
	private WebElement confirmAddrressCheckBox;
	private WebElement typeOfHousehold;
	private WebElement employmentStatus;
	private WebElement continuebtn;
	private WebElement occupation;
	/*private WebElement carReg;
	private WebElement findCarBtn;
	private WebElement yourCarSection;*/
	
	//Library helper = new Library();
	
	@Given("^I navigate to Axa website$")
	public void i_navigate_to_Axa_website() throws Throwable 
	{
		
//		System.setProperty("webdriver.chrome.driver", "C:/seleniumTraining/CarRating/lib/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://secureweb.axa.ie/MotorQuote/Step1?promoCode=AXP020001");
		/*####################################################################################################
//		System.setProperty("webdriver.gecko.driver", "./lib/Browser/geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://secureweb.axa.ie/MotorQuote/Step1?promoCode=AXP020001");
//		driver.manage().window().maximize();
 * */
//		//####################################################################################################
		System.setProperty("webdriver.edge.driver", "./lib/Browser/MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://secureweb.axa.ie/MotorQuote/Step1?promoCode=AXP020001");
	}

	@Given("^Axa get quote section is displayed$")
	public void axa_get_quote_section_is_displayed() throws Throwable {
		getAQuoteSection = driver.findElement(By.xpath("//section[@id='main']/div/h1"));
		Assert.assertTrue("Get A Quote section is not displayed", getAQuoteSection.isDisplayed());
	}

	@When("^I enter my name$")
	public void i_enter_my_name() throws Throwable {
	    firstName = driver.findElement(By.id("YourDetails_FirstName"));
	    firstName.clear();
	    firstName.sendKeys("Test");
	    
	    lastName = driver.findElement(By.id("YourDetails_LastName"));
	    lastName.clear();
	    lastName.sendKeys("car");
	    
	}

	@When("^I enter date of birth$")
	public void i_enter_date_of_birth() throws Throwable {
		dateOfBirthDD = driver.findElement(By.id("YourDetails_DateOfBirthDay"));
		Select selectDD = new Select(dateOfBirthDD);
		selectDD.selectByVisibleText("02");
		
		dateOfBirthMM = driver.findElement(By.id("YourDetails_DateOfBirthMonth"));
		Select selectMM = new Select(dateOfBirthMM);
		selectMM.selectByValue("08");
		
		dateOfBirthYY = driver.findElement(By.id("YourDetails_DateOfBirthYear"));
		Select selectYY = new Select(dateOfBirthYY);
		selectYY.selectByVisibleText("1978");
	}

	@When("^i enter my gender$")
	public void i_enter_my_gender() throws Throwable {
		maleGender = driver.findElement(By.cssSelector("[for=\"YourDetails_GenderIdA\"]"));
		maleGender.click();
	}

	@When("^I enter email address$")
	public void i_enter_email_address() throws Throwable {
	    email = driver.findElement(By.id("YourDetails_EmailAddress"));
	    email.clear();
	    email.sendKeys("test25f@sttesting.net");
	}

	@When("^I enter my phone number$")
	public void i_enter_my_phone_number() throws Throwable {
	  phoneAreaCode = driver.findElement(By.id("YourDetails_PhoneNumberAreaCode"));
	  Select select = new Select(phoneAreaCode);
	  select.selectByVisibleText("085");
	  //########################################################################
	  mainPhoneNumber = driver.findElement(By.id("YourDetails_PhoneNumberDigits"));
	  mainPhoneNumber.clear();
	  mainPhoneNumber.sendKeys("7725027");
	}

	@When("^I select yes I know my eirocode$")
	public void i_select_yes_I_know_my_eirocode() throws Throwable {
	  selectYesToEircode = driver.findElement(By.cssSelector("[for=\"YourDetails_Address_UseEircodeA\"]"));
	  selectYesToEircode.click();
	}

	@When("^I enter my eircode$")
	public void i_enter_my_eircode() throws Throwable {
	    eircode = driver.findElement(By.id("YourDetails_Address_EirCode"));
	    eircode.clear();
	    eircode.sendKeys("D15TX65");
	}

	@When("^I click find address$")
	public void i_click_find_address() throws Throwable {
		try{
			Thread.sleep(9000);
			findAddressBtn = driver.findElement(By.cssSelector(".btn.btn-emphasis.btn-icon-right.icon.addressLookupSearchButton"));
			findAddressBtn.click();
			
		}catch(Exception e){
			captureAndSaveScreenShot(driver);
			confirmAddrressCheckBox = driver.findElement(By.id("confirmAddress-label"));
			Assert.assertTrue("Unable to click find address button", confirmAddrressCheckBox.isDisplayed());
			
		}
		
	   
	}

	@When("^I click the checkbox$")
	public void i_click_the_checkbox() throws Throwable {
		try{
			 Thread.sleep(6000);
			 confirmAddrressCheckBox = driver.findElement(By.id("confirmAddress-label"));
			 confirmAddrressCheckBox.click();
		}catch(Exception e){
			Assert.assertTrue("Unable to click the confirm Addrress CheckBox", confirmAddrressCheckBox.isEnabled()); 
		}
	  
	}

	@When("^I select type of household$")
	public void i_select_type_of_household() throws Throwable {
		typeOfHousehold = driver.findElement(By.id("YourDetails_HouseholdTypeId"));
		Select select = new Select(typeOfHousehold);
		select.selectByVisibleText("Rented Accommodation");
	}

	@When("^I select employment status$")
	public void i_select_employment_status() throws Throwable {
	    employmentStatus = driver.findElement(By.id("YourDetails_EmploymentStatusId"));
	    Select select = new Select(employmentStatus);
		select.selectByVisibleText("Employed");
	}
	
	@When("^I select occupation$")
	public void i_select_occupation() throws Throwable {
	    occupation = driver.findElement(By.id("YourDetails_OccupationTypeId"));
	   Select select = new Select(occupation);
	   select.selectByVisibleText("Actress");
	 }

	@When("^I click continue$")
	public void i_click_continue() throws Throwable {
	   continuebtn = driver.findElement(By.id("btn-personal"));
	   continuebtn.click();
	}

	@Then("^your car section is displayed$")
	public void your_car_section_is_displayed() throws Throwable {
		//This is how confirm that a page contains a text.
		Assert.assertTrue("Your Car section is not displayed", (driver.getPageSource().contains("Your car")));
		
	}
}

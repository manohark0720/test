package pageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking extends BasePage {

	public FlightBooking(WebDriver driver) {
		super(driver);
	}

	// locators
	// *[contains(text(),'Filter by Airline')]
	@FindBy(xpath = "//*[contains(text(),'Filter by Airline')]")
	WebElement scrooldowm;
	@FindBy(xpath = "/html//div[@id='searchrequestform:flightResult']/div[8]/div[1]/div[@class='ui-panel-content ui-widget-content']//div[@class='Flight1-booknowBtn']/a[@href='#']")
	WebElement searchflight;
	/// html//div[@id='enquiryTemp']
	@FindBy(xpath = "/html//select[@id='salutation']")
	WebElement salution;
	@FindBy(xpath = "/html//select[@id='passengerType']")
	WebElement passangertype;
	@FindBy(xpath ="/html//input[@id='firstName']")
	WebElement frstname;
	@FindBy(xpath ="/html//input[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath ="/html//select[@id='nantionality']")
WebElement nationality;
	@FindBy(xpath ="/html//input[@id='phoneCountryCode']")
	WebElement numcode;
	@FindBy(xpath ="/html//input[@id='phoneNumber']")
	WebElement num;
	@FindBy(xpath ="/html//input[@id='passportNo']")
	WebElement passport;
	@FindBy(xpath ="/html//input[@id='documentPoi']")
	WebElement place;
	@FindBy(xpath ="/html//select[@id='contryHld']")
	WebElement country;
	@FindBy(xpath ="/html//input[@id='addCustomer1']")
	WebElement add;
	//button[@id='createBooking1']/span[@class='ui-button-text ui-c']
	@FindBy(xpath ="//button[@id='createBooking1']/span[@class='ui-button-text ui-c']")
	WebElement  createBooking;
	//button[@id='eticket']/span[@class='ui-button-text ui-c']
	@FindBy(xpath ="//button[@id='eticket2']/span[@class='ui-button-text ui-c']")
	WebElement   isssueEticket;
	@FindBy(xpath ="//div[@id='directTicketingAlertwin']/div[@class='ui-dialog-content ui-widget-content']//div[@id='menu-jquery']/table//tr/td[1]/button[@role='button']/span[@class='ui-button-text ui-c']")
	WebElement okbtn;
	public void searchFlight() {
		searchflight.click();
	}

	public void setSalution(String value) throws InterruptedException {
		Select s = new Select(salution);
		Thread.sleep(5000);
		s.selectByIndex(2);
		salution.sendKeys(Keys.ENTER);
		salution.click();

	}

	public void setPassangerType(String value) throws InterruptedException {
		Select s = new Select(passangertype);
		Thread.sleep(5000);
		s.selectByIndex(1);
		passangertype.sendKeys(Keys.ENTER);
		passangertype.click();
	}

	public void setFirstName() throws InterruptedException {
		frstname.sendKeys("manohar");
		Thread.sleep(1000);
	}
	
	public void setLastName() throws InterruptedException {
		lastname.sendKeys("kota");
		Thread.sleep(1000);
	}
	
	public void setNationality(String value) throws InterruptedException {
		Select s = new Select(nationality);
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(1000);
		nationality.click();
	}
	public	 void setMobileCode() {
		numcode.sendKeys("91");
	}
	
public	 void setMobile() {
	num.sendKeys("9177160881");
	}
public	 void setPassport() {
	passport.sendKeys("fz86875764653");
}
public	 void setPlace() {
	place.sendKeys("channai");
}
public	 void setIssueCountry() throws InterruptedException {
	Select s = new Select(country);
	s.selectByIndex(3);
	Thread.sleep(1000);
	country.sendKeys(Keys.ENTER);
	country.click();
}
public void setAdd() {
	add.click();
}
  public void setCreateBook() {
	  createBooking.click();
  }
  public void setEticket() {
	  isssueEticket.click();
  }
}

package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flight extends BasePage {
	public Flight(WebDriver driver) {
		super(driver);
	}

//locators
	@FindBy(xpath = "/html//a[@id='Flight']")
	WebElement lnkflight;
	@FindBy(xpath = "//form[@id='mainMenuForm']/div[6]/div/div[2]//ul//a[@href='/b2b/pages/flight/common/searchResults/flightSearch.jsf']")
	WebElement createbooking;
	@FindBy(xpath = "/html//label[@id='roundTrip']")
	WebElement roundtrip;
	@FindBy(xpath = "/html//label[@id='oneWay']")
	WebElement clickoneway;
	@FindBy(xpath = "/html//input[@id='origin']")
	WebElement fromcity;

	@FindBy(xpath = "/html//input[@id='destination']")
	WebElement tocity;

	@FindBy(xpath = "/html//input[@id='stdatepicker']")
	WebElement selectdate;
	@FindBy(xpath = "/html//select[@id='time']")
	WebElement selecttime;
	@FindBy(xpath = "/html//select[@id='som_adult']")
	WebElement selectadult;
	
	@FindBy(id="flightForm:round_searchBtn")
	WebElement searchbtn;
	
	// actions
	public void setFlight() {
		lnkflight.click();
	}

	public void setBooking() {
		createbooking.click();
	}

	public void setOneWay() {
		clickoneway.submit();

	}
	public void setRoundTrip() {
		roundtrip.click();
	}

	public void setFromCity(String city) throws InterruptedException {
		fromcity.sendKeys(city);
		Thread.sleep(2000);
		fromcity.sendKeys(Keys.ENTER);
	}

	public void setToCity(String city) throws InterruptedException {
		tocity.sendKeys(city);
		Thread.sleep(2000);
		tocity.sendKeys(Keys.ENTER);
	}

	public void setDate(String Date) {
		selectdate.sendKeys("10-Jan-2024");
		selectdate.click();
	}

	

	//public void setAdult(String Adult) {
	//	selectadult.sendKeys(Adult);
//	}

	public void setSerchBtn() {
		searchbtn.click();
	}

//	public void setTime(String time) {
	//	selecttime.sendKeys(time);
	//	selectdate.click();		
	


	

}
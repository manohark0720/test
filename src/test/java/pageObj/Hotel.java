package pageObj;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Hotel extends BasePage {
	public Hotel(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html//a[@id='Hotel']")
	WebElement hotellink;
	@FindBy(xpath = "/html//a[@id='Hotel']")
	WebElement createbookingbtn;

	@FindBy(xpath = "/html//input[@id='city']")
	WebElement city1;

	@FindBy(xpath = "/html//tbody[@id='hotelDetails']//select[@name='roomCount_1']")
	WebElement roomcount;
	@FindBy(xpath = "/html//tbody[@id='hotelDetails']//input[@name='withChildren_1']")
	WebElement children;
	@FindBy(xpath = "/html//select[@id='hotelForm:nantionality']")
	WebElement nationality;
	@FindBy(xpath = "/html//select[@id='hotelForm:countryOfResidence']")
	WebElement country;
	@FindBy(xpath = "/html//tbody[@id='hotelDetails']//input[@name='withChildren_1']")
	WebElement childclick;
	@FindBy(xpath = "/html//tr[@id='singleChild']//table//tr[@class='disnone row1']//select[@name='childCount_11']")
	WebElement chidcount;
	@FindBy(xpath = "/html//tr[@id='singleChild']//table//tr[@class='disnone row1']//select[@name='childAge_111']")
	WebElement age;
	@FindBy(xpath = "//div[@id='quickSearchSection']/fieldset//a[@href='#']")
	WebElement advancesearch;
	@FindBy(id = "hotelForm:round_searchBtn")
	WebElement srchbtn;
	@FindBy(xpath = "/html//div[@id='hotelResult']/div[6]/div[2]/div[@class='ui-panel-content ui-widget-content']/div/table//div[@class='Flightbookbg']/table//div[@class='Flight-booknowBtn']/a[@href='#']")
	WebElement book;
	@FindBy(xpath = "/html//input[@id='bookingSummary:chkbx_termsandcond']")
	WebElement termscondition;
	@FindBy(xpath = "//button[@id='bookingSummary:createBooking1']/span[@class='ui-button-text ui-c']")
	WebElement conformbtn;
	@FindBy(xpath ="/html//div[@id='bookingSummary:mask_content']/div[@class='box']/table/tbody/tr[6]/td/div/div[6]/table//td[@class='pleft10']//button[@role='button']/span[@class='ui-button-text ui-c']")
	WebElement addguest;
	@FindBy(xpath = "/html//select[@id='bookingSummary:salutation1']")
	WebElement salution;
	@FindBy(xpath ="/html//input[@id='bookingSummary:firstName1']")
	WebElement frstname;
	@FindBy(xpath ="/html//input[@id='bookingSummary:lastName1']")
	WebElement lastname;
	@FindBy(xpath=	"/html//select[@id='bookingSummary:nantionality1']")
	WebElement nationality1;
	@FindBy(xpath ="/html//input[@id='bookingSummary:phoneCountryCode1']")
	WebElement numcode;
	@FindBy(xpath ="/html//input[@id='bookingSummary:phoneNumber1']")
	WebElement num;
	@FindBy(xpath ="/html//input[@id='bookingSummary:addGuest']")
	WebElement add;
	@FindBy(xpath ="/html//table[@id='formOfPayment1:creditLmtChk']//label[.=' Direct Cash Sales']")
	WebElement cashless;
	@FindBy(xpath ="//button[@id='formOfPayment1:ok_button']/span[@class='ui-button-text ui-c']")
	WebElement okbtn;
	@FindBy(xpath ="/html//table[@id='formOfPayment1:creditLmtChk']//tr/td[2]/input[@name='formOfPayment1:creditLmtChk']")
	WebElement cashapproval;
	public void setHotel() {
		hotellink.click();
	}

	public void setbookbtn() {
		createbookingbtn.click();
	}

	public void setcity(String city) throws InterruptedException {
		city1.sendKeys(city);
		Thread.sleep(2000);
		city1.sendKeys(Keys.ENTER);
	}


	public void setRoomCount() throws InterruptedException {
		Select s = new Select(roomcount);
		s.selectByIndex(1);
		Thread.sleep(2000);
		roomcount.sendKeys(Keys.ENTER);
		roomcount.click();
	}
	public void setchild() {
		childclick.click();
	}

	public void setChildren() throws InterruptedException {
		Select s = new Select(age);
		s.selectByIndex(2);
		Thread.sleep(2000);
		age.click();

	}
	public void setChildCount() throws InterruptedException {
		Select s = new Select(chidcount);
		s.selectByIndex(1);
		Thread.sleep(2000);
		chidcount.click();
	}

	public void setNationality() throws InterruptedException {
		Select s = new Select(nationality);

		s.selectByIndex(4);
		Thread.sleep(2000);

		nationality.click();
	}

	public void setCountry() {
		Select s = new Select(country);
		s.selectByIndex(7);
		country.click();
	}

	public void setClickChild() {
		
	}
	public void setTerms() {
		termscondition.click();

	}

	public void setChildrenAge() {
		Select s = new Select(age);
		s.selectByIndex(3);
		age.click();
	}

	public void setAdvanceSearch() {

		advancesearch.click();

	}

	public void setSearchbtn() throws InterruptedException {

		srchbtn.click();
		Thread.sleep(6000);

	}

	public void setBookHotel() throws InterruptedException {

		book.click();
		Thread.sleep(3000);

	}
public void setConform() throws InterruptedException {
	conformbtn.click();
	Thread.sleep(6000);

}
public void setGuest() {
	addguest.click();
}

public void setSalution() throws InterruptedException {
	Select s = new Select(salution);
	Thread.sleep(5000);
	s.selectByIndex(2);
	salution.sendKeys(Keys.ENTER);
	salution.click();

}
public void setFirstName(String name) throws InterruptedException {
	frstname.sendKeys(name);
	Thread.sleep(1000);
}

public void setLastName() throws InterruptedException {
	lastname.sendKeys("kota");
	Thread.sleep(1000);}
	public void setNationality1() throws InterruptedException {
		Select s = new Select(nationality1);
		Thread.sleep(2000);
		s.selectByIndex(4);
		nationality1.sendKeys(Keys.ENTER);
	}


public void setNumCode() {
	numcode.sendKeys("91");
}
public void setNum() throws InterruptedException {
	num.sendKeys("9177160881");
	Thread.sleep(2000);

}
public void setAddBtn() {
	add.click();
}
public void setDirectCashless() {
	cashless.click();
	
}
public void setCashApprove() {
	cashapproval.click();
}
public void setOkBtn() {
	okbtn.click();
}




}

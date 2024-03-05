package testCase;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObj.Hotel;
import pageObj.HotelHomePage;
import testBase.BaseClass;
import utilities.Wrappermethods;

public class TC_2_HotelRegestation extends  BaseClass{
  @Test(dataProvider = "dp")
  public void f(String data, String username, String password,String city,String CheckInDate,String CheckOutDate) throws InterruptedException, IOException, ParseException {
		HotelHomePage hp = new HotelHomePage(driver);
		hp.setUsername(username);
		hp.setPassword(password);
		sleep();
		hp.setSubmtbtn();
		Hotel  ho=new Hotel(driver);
		sleep();
		ho.setHotel();
		sleep();
		ho.setcity(city);
		sleep();
		calenderpicker("//*[@id='indatepicker']", CheckInDate, "User select from_date as " + CheckInDate, "TesterName");
		Thread.sleep(2000);

		calenderpicker("//*[@id='outdatepicker']", CheckOutDate, "User select to_date as " + CheckOutDate, "TesterName");
		Thread.sleep(2000);
		
		Tab("//*[@id='outdatepicker']");
		Thread.sleep(1000);
		Thread.sleep(3000);
		ho.setRoomCount();
		Thread.sleep(3000);
	//	ho.setChildren();
		//Thread.sleep(3000);
	//	ho.setChildCount();
	//	sleep();
	//	ho.setChildren();
	//	sleep();
		ho.setNationality();
		Thread.sleep(3000);
		ho.setCountry();
		sleep();
		ho.setSearchbtn();
		Thread.sleep(7000);
		ho.setBookHotel();
		Thread.sleep(7000);
		scrolldownusingwebelement("/html//div[@id='contentSection']","scrooldown this","tester");
		Thread.sleep(4000);
  
		ho.setTerms();

		Thread.sleep(4000);
	//	ho.setConform();
		ho.setGuest();
		Thread.sleep(2000);
		ho.setSalution();
		ho.setFirstName("mano");
		sleep();
		ho.setLastName();
Thread.sleep(5000);

		datepicker("//*[@id='bookingSummary:return']", "04", "May-1995", "//*[@class='ui-datepicker-year']","//*[@class='ui-datepicker-month']", "User select the date as " ," TesterName");
		Thread.sleep(1000);
		ho.setNationality1();
		Thread.sleep(1000);
		ho.setNumCode();
		Thread.sleep(1000);
		ho.setNum();
		Thread.sleep(1000);
		ho.setAddBtn();
	ho.setConform();
	Thread.sleep(1000);
	ho.setDirectCashless();
	Thread.sleep(2000);
	ho.setOkBtn();
	Thread.sleep(5000);
	
	
	
	
	}

private void sleep() throws InterruptedException {
	  Thread.sleep(2000);
}
  

  @DataProvider(name = "dp")
	public Object[][] dp() throws IOException {

		return Wrappermethods.getSheet("hotel", "hotel");

	}

}
		
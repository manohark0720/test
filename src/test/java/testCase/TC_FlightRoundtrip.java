package testCase;

import java.io.IOException;

import pageObj.Flight;
import pageObj.HomePage;
import testBase.BaseClass;

public class TC_FlightRoundtrip extends BaseClass {

	public void round() throws InterruptedException, IOException {
		
			HomePage hp = new HomePage(driver);
			hp.setUsername("airmilesb2b");
			hp.setPassword("Info@dev1");
			Thread.sleep(2000);
			hp.setSubmtbtn();
		Flight f=new Flight(driver) ;
			
		f.setFlight();
		Thread.sleep(2000);
		f.setBooking();
		Thread.sleep(2000);
		f.setRoundTrip();
		Thread.sleep(2000);
		f.setFromCity("DXB");

		Thread.sleep(2000);
		f.setToCity("MAA");
		Thread.sleep(2000);
		calenderpicker("/html//input[@id='stdatepicker']", "20-mar-2024", "User select from_date as " + "10-Feb-2024",
				"TesterName");
		

		Thread.sleep(2000);
		calenderpicker("/html//input[@id='rtdatepicker']", "22-mar-2024", "User select from_date as " + "10-Feb-2024",
				"TesterName");
		
		Thread.sleep(2000);
		f.setSerchBtn();
		
		
		}
	}	
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


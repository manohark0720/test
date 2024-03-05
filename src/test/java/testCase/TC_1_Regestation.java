package testCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import pageObj.Flight;
import pageObj.FlightBooking;
import pageObj.HomePage;
import testBase.BaseClass;

public class TC_1_Regestation extends BaseClass {

	public void test_account_Registration() throws InterruptedException {
		try {
			HomePage hp = new HomePage(driver);
			hp.setUsername("airmilesb2b");
			hp.setPassword("Info@dev1");
			Thread.sleep(2000);
			hp.setSubmtbtn();
			Flight fl = new Flight(driver);
			Thread.sleep(5000);
			fl.setFlight();
			Thread.sleep(2000);
			fl.setBooking();
			Thread.sleep(4000);
			fl.setOneWay();
			Thread.sleep(2000);
			fl.setFromCity("DXB");

			Thread.sleep(2000);
			fl.setToCity("MAA");
			Thread.sleep(2000);

			calenderpicker("//*[@id='stdatepicker']", "20-mar-2024", "User select from_date as " + "10-Feb-2024",
					"TesterName");
			

			Thread.sleep(2000);

			fl.setSerchBtn();
			Thread.sleep(80000);

			FlightBooking fb = new FlightBooking(driver);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

			// Scroll down by pixel
			jsExecutor.executeScript("window.scrollBy(0, 1000);");
			Thread.sleep(5000);
            fb.searchFlight();
            Thread.sleep(5000);

			// Scroll down by pixel
            WebElement innerScrollElement = driver.findElement(By.xpath("//div[@class='row row-offcanvas row-offcanvas-right']/div[@class='layout ui-layout-container']/div[2]"));
            jsExecutor.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", innerScrollElement);

            Thread.sleep(5000);
            fb.setSalution("MR");
            Thread.sleep(5000);
            
            fb.setFirstName();
            fb.setLastName();
            
            fb.setPassangerType("ADULT");
         
            Thread.sleep(2000);
        
          
            datepicker ("//table[@id='addPassenDtls']//span[@class='glyphicon glyphicon-calendar']","6","Feb-1993","//*[@class='ui-datepicker-year']","//*[@class='ui-datepicker-month']","user select the birthdate as 06-Feb-1993","tester");
            Thread.sleep(2000);
            fb.setNationality("value");
            Thread.sleep(2000);
            fb.setMobileCode();
            fb.setMobile();
            fb.setPassport();
            fb.setPlace();
            Thread.sleep(2000);
            datepicker ("/html//table[@id='addPassenDtls']/tbody/tr[5]/td[3]/span/span[@class='glyphicon glyphicon-calendar']","4","Mar-2020", "//*[@class='ui-datepicker-year']","//*[@class='ui-datepicker-month']","user select the date of issue","tester");
            Thread.sleep(2000);
            datepicker("/html//input[@id='odcDoe']","5","Jan-2030","//*[@class='ui-datepicker-year']","//*[@class='ui-datepicker-month']","user select expiry date","tester");
            Thread.sleep(2000);
            fb.setIssueCountry();
            Thread.sleep(2000);
            fb.setAdd();
            Thread.sleep(4000);
         //   fb.setCreateBook();
            Thread.sleep(2000);
           fb.setEticket() ;
            
		} catch (Exception e) {
		}
	}
}
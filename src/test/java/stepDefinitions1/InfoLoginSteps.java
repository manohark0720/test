package stepDefinitions1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InfoLoginSteps {
	WebDriver driver;
	@Given("the user is on the information dyanamic login page")
	public void the_user_is_on_the_information_dyanamic_login_page() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		 driver=new FirefoxDriver();
		 driver.get("https:sit.infodynamic.net/euro-b2b/login.jsf");
			
			
		//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
			driver.manage().window().maximize();
	
	
	
			//@When("When the user enters valid credentials \\(username: {string}, password: {string}")
			//public void	the_user_enters_valid_credentials_username_password(String email, String pwd) {
			driver.findElement(By.xpath("/html//input[@id='j_username']")).sendKeys("airmilesb2b");
			driver.findElement(By.xpath("/html//input[@id='j_password']")).sendKeys("Info@dev1");
	}


	@When("the user clicks on the signin button")
	public void the_user_clicks_on_the_signin_button() {
		driver.findElement(By.xpath("//form[@id='loginForm']//input[@name='submit']")).click();
		//form[@id='loginForm']//input[@name='submit']
		//form[@id='loginForm']//input[@name='submit']
	}

	@Then("user should be flight booking page")
	public void user_should_be_flight_booking_page() {
		boolean target=driver.findElement(By.xpath("//form[@id='mainMenu']/div[@class='headerRight']")).isDisplayed();
		Assert.assertEquals(target,true);
	}



	
	
}
//driver.findElement(By.xpath("/html//input[@id='j_username']")).sendKeys("airmilesb2b");
//driver.findElement(By.xpath("/html//input[@id='j_password']")).sendKeys("Info@dev1");
//driver.findElement(By.xpath("//form[@id='loginForm']//input[@name='submit']")).click();
///boolean target=driver.findElement(By.xpath("//form[@id='mainMenu']/div[@class='headerRight']")).isDisplayed();
//Assert.assertEquals(target,true);	}


package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
		
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	//locators
	@FindBy(xpath="/html//input[@id='j_username']")
	WebElement username;
	@FindBy(xpath="/html//input[@id='j_password']")
	WebElement password;
	@FindBy(xpath="//form[@id='loginForm']//input[@name='submit']")
	WebElement submit;
	//actions
	
	public void setUsername(String name) {
		username.sendKeys(name);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void setSubmtbtn() {
		submit.click();
	}
}

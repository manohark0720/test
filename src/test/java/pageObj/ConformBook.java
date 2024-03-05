package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConformBook extends BasePage {
	public ConformBook(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "/html//div[@id='hotelResult']/div[6]/div[2]/div[@class='ui-panel-content ui-widget-content']/div/table//div[@class='Flightbookbg']/table//div[@class='Flight-booknowBtn']/a[@href='#']")
	WebElement book;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setBook() {
		book.click();
	}
	
	
	
	
	
	
	
	
	
}

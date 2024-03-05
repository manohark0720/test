package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BaseClass {
	static public WebDriver driver;
	public Logger logger;

    @BeforeClass(groups = { "master", "sanity" })
    public void setup(String os, String browser) throws IOException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\User\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		// loading properties file
		// FileReader file=new FileReader(".//src//test//resources//config.properties");
		// p=new Properties();
		// p.load(file);

		// String os, String br
		// loading log4j
		// logger=LogManager.getLogger(this.getClass());//Log4j

		// launching browser based on condition
		switch (browser.toLowerCase()) {

		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("No matching browser..");
		}
		// return;

		driver = new FirefoxDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://sit.infodynamic.net/euro-b2b/login.jsf");
	}

	public void datepicker(String xpath, String Day, String MonYear, String yearxpath, String monthxpath,
			String StepDescription, String TesterName) throws IOException, InterruptedException, ParseException {

		String targetDate = MonYear;
		DateFormat targetdateformat = new SimpleDateFormat("MMM-yyyy");

		try {

			Date date = targetdateformat.parse(targetDate);

			DateFormat monthformat = new SimpleDateFormat("MMM");
			DateFormat yearformat = new SimpleDateFormat("yyyy");

			String month = monthformat.format(date);
			String year = yearformat.format(date);

			WebElement element = driver.findElement(By.xpath(xpath));
			element.click();
			Thread.sleep(1000);

			WebElement dyear = driver.findElement(By.xpath(yearxpath));
			Select s1 = new Select(dyear);
			s1.selectByVisibleText(year);
			Thread.sleep(1000);

			WebElement dmonth = driver.findElement(By.xpath(monthxpath));
			Select s = new Select(dmonth);
			s.selectByVisibleText(month);
			Thread.sleep(1000);

			List<WebElement> li = driver.findElements(By.xpath(
					"//div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[6]/a[@href='#']"));
			for (int i = 0; i < li.size(); i++) {
				li.get(i).click();
			}
			Thread.sleep(5000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void Tab(String xpath) throws IOException {

		driver.findElement(By.xpath(xpath)).sendKeys(Keys.TAB);

	}

	public void scrolldownusingwebelement(String xpath, String StepDescription, String TesterName) throws IOException {

		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement w = driver.findElement(By.xpath(xpath));

		j.executeScript("arguments[0].scrollIntoView(true)", w);
	}

	public void calenderpicker(String xpath, String date, String StepDescription, String TesterName)
			throws IOException, InterruptedException {

		WebElement element = driver.findElement(By.xpath(xpath));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + date + "');", element);

	}

	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile = new File(targetFilePath);

		sourceFile.renameTo(targetFile);

		return targetFilePath;

	}

	@AfterMethod
	@AfterClass(groups = { "sanity" })
	public void tearDown() {
		driver.quit();
	}
}

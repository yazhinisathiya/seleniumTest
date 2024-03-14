package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.Screenshot;

public class Checkboxtest {

	WebDriver driver;
	WebElement chkbox;

	@BeforeTest
	@Parameters({"name","message"})
	public void setup( String browser,@Optional("testing") String message) throws Exception {
		if(browser.equalsIgnoreCase("ie"))
		{
		    //create IE instance
			
			driver = new InternetExplorerDriver();
		}		
		
		//Verify if parameter passed from TestNG is Chrome
		else if(browser.equalsIgnoreCase("chrome"))
		{
			//set path to chromedriver.exe
			
			//create Chrome instance
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//set path to chromedriver.exe
			
			//create FireFox instance
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println(message);
			//If no browser passed throw exception
			throw new Exception("No browser specified");
		}
		driver.manage().window().maximize();
	}
	@Test
	public void testcase1() {
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		String title=driver.getTitle();
		String expectedTitle="Selenium Easy - Checkbox demo for automation using selenium";
		Assert.assertEquals(title, expectedTitle);	
		
	}

	/*
	 * @Test public void testcase2() { chkbox =
	 * driver.findElement(By.cssSelector("#isAgeSelected")); chkbox.click();
	 * //System.out.println("After Select : " + chkbox.isSelected());
	 * Assert.assertTrue(chkbox.isSelected()); }
	 * 
	 * @Test public void testcase3() { chkbox.click();
	 * //System.out.println("After UnSelect : " + chkbox.isSelected());
	 * 
	 * Assert.assertTrue(chkbox.isSelected());
	 * 
	 * }
	 */
	@AfterMethod
	public void screenshottest() {
		Screenshot.captureScreenshot(driver, "checkboxtesting");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

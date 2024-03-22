package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkboxtest2 {

	WebDriver driver;
	WebElement chkbox;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void testcase1() {
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		String title=driver.getTitle();
		String expectedTitle="Selenium Easy - Checkbox demo for automation using selenium";
		Assert.assertEquals(title, expectedTitle);	
		
	}
	@Test
	public void testcase2() {
		chkbox = driver.findElement(By.cssSelector("#isAgeSelected"));
		chkbox.click();
		//System.out.println("After Select : " + chkbox.isSelected());
		Assert.assertTrue(chkbox.isSelected());		
	}
	@Test
	public void testcase3() {
		chkbox.click();
		//System.out.println("After UnSelect : " + chkbox.isSelected());
		Assert.assertTrue(chkbox.isSelected());
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}

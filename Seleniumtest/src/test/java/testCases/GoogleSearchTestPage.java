package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;
import utilities.ReadExcelExample;

public class GoogleSearchTestPage {
	
	WebDriver driver;
	 
	 @DataProvider(name = "test1")
		public Object[][] createData1() throws IOException {
		 
		 ReadExcelExample read= new ReadExcelExample();
		 Object [] [] data=read.readExcelData("./Data1.xlsx", "sheet2");
			return data;
		 
		}
	
	@BeforeTest
	public void Setup() {
		
		driver= new ChromeDriver();
		
		
		
	}
	@Test(dataProvider="test1")
	public void TestCase1(String keyword) {
		GoogleSearchPage browser= new GoogleSearchPage(driver);
		browser.NavigateGoogleSearchPage();
		browser.typeSearchKeyword(keyword);
		
		
		
	//	driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys(keyword);
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;
	
	By SearchBox = By.name("q");
	
	public GoogleSearchPage(WebDriver driver1) {
	//	System.out.println(driver);
		this.driver=driver1;
	//	System.out.println(driver);
	}

	public void NavigateGoogleSearchPage() {
		
		driver.get("https://www.google.com");
	}
	
	public void typeSearchKeyword(String keyword) {
		
		driver.findElement(SearchBox).click();
		driver.findElement(SearchBox).sendKeys(keyword);
		driver.findElement(SearchBox).sendKeys(Keys.ENTER);
	}
}

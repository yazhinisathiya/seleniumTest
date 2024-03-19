package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactory {
	WebDriver driver;
	
	public GoogleSearchPageFactory(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);

	}
	/*
	 * @FindBy(id="q") WebELement d;
	 */
	/*
	 * @FindBy(name="q") WebElement searchbox;
	 */
	
	@FindBy(how=How.ID_OR_NAME,using="q")
	WebElement searchbox;
	/*
	 * @FindBy(name="q") WebElement searchbox;
	 * 
	 * @FindBy(how=How.NAME,using="q") WebElement searchbox;
	 */

	public void NavigateGoogleSearchPage() {

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	public void typeSearchKeyword(String Keyword) {

		searchbox.click();
		searchbox.sendKeys(Keyword);
		searchbox.sendKeys(Keys.ENTER);
	}

}

package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.get("https://www.selenium.dev/selenium/web/hidden.html");
		
	//	WebElement radiobutton1=driver.findElement(By.id("my-radio-1"));
	//	WebElement radiobutton2=driver.findElement(By.id("my-radio-2"));
		WebElement hiddenFiled= driver.findElement(By.id("singleHidden"));
		//Boolean isSelected= radiobutton2.isSelected();
		Boolean isDisplayed= hiddenFiled.isDisplayed();
		
		System.out.println(isDisplayed);

	}

}

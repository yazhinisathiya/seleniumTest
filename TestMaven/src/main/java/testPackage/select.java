package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		WebElement dropdown = driver.findElement(By.name("my-select"));
		
		//WebElement text = driver.findElement(By.name("my-password"));
		
		WebElement distext = driver.findElement(By.name("my-disabled"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("One");
		
		Boolean isEnabled=distext.isEnabled();
		System.out.println(isEnabled);
		
		
		
		//Boolean isdisEnabled=distext.isEnabled();
		//System.out.println(isdisEnabled);
				
		
		
		

	}

}

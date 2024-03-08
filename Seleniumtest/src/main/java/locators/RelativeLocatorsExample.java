package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///D:/TCS/Batch%207%202024/SimplePage.html");

		/*
		 * WebElement firstName=driver.findElement(By.id("namef"));
		 * 
		 * firstName.clear();
		 * 
		 * firstName.sendKeys("Venkatesh");
		 * 
		 * //String name= firstName.getAttribute("value"); String name=
		 * firstName.getText();
		 * 
		 * System.out.println("text of FirstName "+name);
		 */
		
//	By maleRadioButton=	RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@value='f']"));
	
	/* //input[starts-with(@name,'f')]
	 * 
	 * input[name^='f']
	 *  */
	WebElement femaleRadioButton= driver.findElement(By.xpath("//input[@value='f']"));
	
	
	femaleRadioButton.click();
//	driver.findElement(maleRadioButton).click();
				
				
		//driver.quit();

	}

}

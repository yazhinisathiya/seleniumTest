package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalHtmlTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/TCS/Batch%207%202024/SimplePage.html");
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		
	//	driver.get("https://www.google.com");
		
		//WebElement input=driver.findElement(By.className("information"));
		
	//	WebElement FirstName=driver.findElement(By.cssSelector(".information#lname"));
		
		WebElement firstName=driver.findElement(By.id("namef"));
		
		firstName.sendKeys("Venkatesh");
		
		
		
		
		//  <input>FirstName</input>
		
		//String value=FirstName.getAttribute("value");
		
		//System.out.println(value);
		
		//driver.findElement(By.linkText("Selenium Official Page")).click();
		//driver.findElement(By.linkText("Official Page")).click();
		
	//	driver.findElement(By.partialLinkText("Official Page")).click();
		
		//driver.findElements(By.partialLinkText("Official Page")).get(1).click();
		
		//List<WebElement> links=driver.findElements(By.partialLinkText("Official Page"));
		
		//links.get(1).click();
		
		//System.out.println(links.size());
		
	//	String Title= driver.getTitle();
		
	//	System.out.println(Title);
		
	//	driver.quit();
		
		driver.close();

	}

}

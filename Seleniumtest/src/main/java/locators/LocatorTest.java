package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		 driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
	//	String Title = driver.getTitle();
		
		//System.out.println("Title of the page is : "+ Title);
		 
		// driver.findElement(By.id("my-text-id")).sendKeys("Venkatesh");
		 
		 driver.findElement(By.name("my-text")).sendKeys("Venkatesh");
		 
	//	 driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();
		 
		// driver.findElement(By.tagName("button")).click();
		 
		 driver.findElement(By.cssSelector(".btn.btn-outline-primary.mt-3")).click();
		 
		 String message =driver.findElement(By.id("message")).getText();
		 
		 System.out.println(message);
		 
		driver.quit();
	}

}

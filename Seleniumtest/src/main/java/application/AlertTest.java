package application;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("See an example alert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		
		/*
		 * Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * String text = alert.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * alert.accept();
		 */
		
		/*
		 * driver.findElement(By.linkText("See a sample confirm")).click();
		 * 
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 * Alert alert1 = driver.switchTo().alert();
		 * 
		 * String text1 = alert1.getText();
		 * 
		 * System.out.println(text1);
		 * 
		 * alert1.dismiss();
		 */
		//Click the link to activate the alert
		
	//	Actions action = new Actions(driver);
		
		//action.
		
	//	action.scrollToElement(driver.findElement(By.linkText("prompt happen"))).perform();
		driver.findElement(By.linkText("prompt happen")).click();

		//Wait for the alert to be displayed and store it in a variable
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Type your message
		alert.sendKeys("Selenium");

	}

}

package application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebFormTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		try {
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		Actions action= new Actions(driver);
		
	//	driver.get("https://the-internet.herokuapp.com/upload");
		
		
	/*
	 * WebElement textinput=driver.findElement(By.id("my-text-id")); WebElement
	 * passwordinput=driver.findElement(By.name("my-password")); WebElement
	 * textArea=driver.findElement(By.name("my-textarea")); WebElement
	 * selectDropdown=driver.findElement(By.name("my-select")); WebElement
	 * dropdown=driver.findElement(By.name("my-datalist")); WebElement
	 * dropdownvalue=driver.findElement(By.
	 * xpath("//*[@id=\"my-options\"]/option[@value='New York']")); Select select=
	 * new Select(selectDropdown); dropdown.sendKeys("New"); JavascriptExecutor js =
	 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click();",
	 * dropdownvalue);
	 */
		 
		WebElement drop=driver.findElement(By.xpath("//*[@name='my-datalist']"));
		
		action.sendKeys(drop,Keys.ARROW_DOWN).build().perform();
		
		
		
		//Boolean isSelected=drop.findElement(By.xpath("//*[@id='my-options']/option[@value='New York']")).isSelected();
		//System.out.println(isSelected);
	//	System.out.println(drop.getAttribute("value"));

	//	WebElement browseFile=driver.findElement(By.name("file"));
		
		//browseFile.click();
	//	browseFile.sendKeys("E:\\Pictures\\Sketch.png");
	//	driver.findElement(By.id("file-submit")).click();
	//	String fileName=driver.findElement(By.id("uploaded-files")).getText();
	//	if(fileName.contains("Sketch1.png")) {
	//		System.out.println("File uploaded "+fileName);
	//	}
	//	else {
	//		System.out.println("File not uploaded "+fileName);
	//	}
		}
		finally {
			//driver.quit();
		}
	}

}

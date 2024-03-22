package differentElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/DoubleClick.php");
		
		Actions action= new Actions(driver);
		
		WebElement clickbutton=driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		clickbutton.click();
		action.doubleClick(clickbutton).click(clickbutton).contextClick().build().perform();
		
	}
	
}

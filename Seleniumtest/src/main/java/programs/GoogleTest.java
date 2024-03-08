package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTest {

	public static void main(String[] args) {
	
		
		
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).click();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Testing");
		
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

	}

}

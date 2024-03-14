package testPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent win "+parentWin);
		WebElement tabBtn=driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
		tabBtn.click();
		System.out.println("page title "+driver.getTitle());
		
		Set<String> tabs = driver.getWindowHandles();
		System.out.println("No.of.windows  "+tabs.size());
		
		for(String child:tabs)
		{
			System.out.println("No.of.windows  "+tabs.size());
			if(!child.equalsIgnoreCase(parentWin))
			{
				driver.switchTo().window(child);
				System.out.println("Child win title "+driver.getTitle());
				driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a")).click();
			}
		}
		driver.close();
		driver.switchTo().window(parentWin);
		System.out.println("Parent page title "+driver.getTitle());
				
				
				
				
			
		
		
		
		
		

	}

}

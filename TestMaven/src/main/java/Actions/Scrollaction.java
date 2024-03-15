package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://demo.opencart.com");
		
		WebElement macbook=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a"));
		//js.executeScript("arguments[0].scrollIntoView();",macbook);
		//js.executeScript("window.scrollBy(500,500)");// for particular height
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // to scroll till end of height
		js.executeScript("arguments[0].click()", macbook);
		
		
	}

}

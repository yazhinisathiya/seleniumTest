package differentElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TextboxTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement textBox =driver.findElement(By.name("my-password"));
		WebElement dtextBox =driver.findElement(By.name("my-readonly"));
		
		Boolean isEnabled=dtextBox.isEnabled();
		System.out.println(isEnabled);
	}

}

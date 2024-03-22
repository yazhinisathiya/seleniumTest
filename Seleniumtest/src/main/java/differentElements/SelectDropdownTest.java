package differentElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		//WebElement option;
	//	driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.get("file:///D:/TCS/Batch%207%202024/SimplePage.html");
		
		WebElement dropdown =driver.findElement(By.name("multi"));
	//	WebElement disableddropdown =driver.findElement(By.name("my-disabled"));
		Select s=new Select(dropdown);
		List<WebElement> optionList = s.getOptions();
		System.out.println(optionList);
		
		for(WebElement option : optionList) {
			
			System.out.println(option.getText());		
			
		}
		//s.selectByIndex(2);
		//s.selectByValue("3");
		s.selectByVisibleText("Eggs");
		s.selectByVisibleText("Sausages");
		 List<WebElement> selectedOptionList = s.getAllSelectedOptions();
		 
		 for(WebElement option : selectedOptionList) {
				
				System.out.println(option.getText());		
				
			}
		
		//s.deselectByVisibleText("One");  -- You may only deselect options of a multi-select
	//	Boolean isEnabled=disableddropdown.isEnabled();
	//	System.out.println(isEnabled);
	}

}

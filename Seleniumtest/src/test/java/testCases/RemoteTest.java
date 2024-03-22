package testCases;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/*import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;*/
import org.testng.annotations.Test;

public class RemoteTest {


	@Test
	public void remoteTest() throws MalformedURLException{
		
		  ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--start-maximized"); 
		  options.setBrowserVersion("115"); 
		
		//  options.setCapability("platformName", "Windows 10");
		 // options.setCapability("browserName", "chrome");
		//  options.setCapability("version", "121");
		 
		
		 
		
		
		
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability(CapabilityType.BROWSER_NAME,"Firefox");
		 */
		 WebDriver driver = new ChromeDriver(options);

		 driver.get("https://www.google.com");
	}

		/*WebDriver driver=null;
		
			driver = new RemoteWebDriver(new URL("http://192.168.40.1:4444"),options);
		
			
			driver.get("https://www.google.com");
	}*/

	/* WebDriver driver = null;
    try {
      driver = new RemoteWebDriver(URI.create("http://192.168.40.1:4444").toURL(), caps);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    driver.navigate().to("https://www.google.com");

    WebElement searchbox = driver.findElement(By.name("q"));

    System.out.println(searchbox.isDisplayed());
 }*/ 
}

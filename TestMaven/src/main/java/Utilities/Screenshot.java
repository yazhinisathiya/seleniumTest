package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.exec.util.*;
import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchbox=driver.findElement(By.name("q"));
		
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		//System.out.println(timestamp);
		
		
		
		//for whole screen
		//TakesScreenshot ts =(TakesScreenshot) driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		
		// for particular element-declare webelemt above
		File source = searchbox.getScreenshotAs(OutputType.FILE);
		
		
		String destination="./Screenshots/"+" testing"+".png";
		
		try {
			FileUtils.copyFile(source,new File(destination));
			System.out.println("Screenshot captured and saved  to "+destination);
		}catch(IOException e)
		{
			System.out.println("Failed to capture "+e.getMessage());
		}	
			
		}


		
	}



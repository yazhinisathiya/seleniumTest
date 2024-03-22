package testCases;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import utilities.ReadPropertiesfileExample;

public class UsingPropertiesTest {

	
	@Test
	public void Testcase1() throws IOException {
		
		ReadPropertiesfileExample read= new ReadPropertiesfileExample();
		Properties obj=read.readpropertiesFile();
		System.out.println(obj.getProperty("Mobile"));
		
	}
}

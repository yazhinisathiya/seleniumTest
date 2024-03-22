package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAnnotationExample {
	SoftAssert softAssertion= new SoftAssert();
	@Test(priority=0)
	public void softAssert(){
		
		System.out.println("softAssert Method Was Started");
	//	softAssertion.assertTrue(false);
		softAssertion.assertEquals("test", "test");
		
		System.out.println("softAssert Method Was Executed");
		
	}
	
	@Test(priority=1)
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		softAssertion.assertEquals("test", "test1");
		
		System.out.println("hardAssert Method Was Executed");
		
	}
	@AfterMethod
	public void teardown() {
		//softAssertion.assertAll();
	}
}

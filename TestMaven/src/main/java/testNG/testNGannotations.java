package testNG;


import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.*;
import org.testng.Assert;




public class testNGannotations {
    @Test
	public  void softAssert() {
		// TODO Auto-generated method stub
		
		SoftAssert softAssertion=new SoftAssert();
		System.out.println("softassert method was started");
		softAssertion.assertEquals("test", "test1");
		System.out.println("softassert method was executed");
		softAssertion.assertAll();
}
       @Test
		public void hardAssert()
		{
		System.out.println("hardassert method was started");
		Assert.assertTrue(false);
		System.out.println("hardassert method was executed");
		}
		
		
		
		
		
		

	}



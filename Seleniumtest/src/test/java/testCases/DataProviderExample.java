package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ReadExcelExample;

public class DataProviderExample {
	
	/*
	 * @DataProvider(name = "test1") public Object[][] createData1() { return new
	 * Object[][] { { "Cedric", 36 }, { "Anne", 37}, {"venkatesh",38},
	 * {"HariShankar",39} }; }
	 * 
	 * @Test(dataProvider = "test1") public void verifyData1(String n1, Integer n2)
	 * { System.out.println(n1 + " " + n2); }
	 */
	 
	 @DataProvider(name = "test1")
		public Object[][] createData1() throws IOException {
		 
		 ReadExcelExample read= new ReadExcelExample();
		 Object [] [] data=read.readExcelData("./Data1.xlsx", "sheet2");
			return data;
		 
		}
		 @Test(dataProvider = "test1")
		 public void verifyData1(String n1, String n2, String n3) {
		  System.out.println(n1 + " " + n2 + ""+n3);
		 }
	
		 @Test(dataProvider = "test1")
		 public void verifyData2(String n1, String n2, String n3) {
		  System.out.println(n1 + " " + n2 + ""+n3);
		 }

}

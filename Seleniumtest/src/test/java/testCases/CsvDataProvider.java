package testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ReadCsvExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataProvider {
    @DataProvider(name = "csvData")
    public Object[][] provideData() throws IOException {
    	utilities.ReadCsvExample read= new ReadCsvExample();
    	Object[][] data = read.ReadCsv();
    	System.out.println(data[1][1]);
    	
		return data;
    }
    
    @Test (dataProvider="csvData")
    public void testcase1(String Name, String Age) {
    	
    	System.out.println("UserName "+ Name);
    	//System.out.println("Password "+ Password);
    	System.out.println("Age "+ Age);
    }
}
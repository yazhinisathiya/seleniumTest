package testCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import programs.Student;

public class DataProviderExample2 {
	
	// A DataProvider method which returns an iterator to a list. 
		@DataProvider(name="DataProviderIterator")
		public Iterator studentDetails(){
		ArrayList s=new ArrayList();
		s.add(new Student("Kiran", 28, "Male"));
		s.add(new Student("Amod", 28, "Male"));
		s.add(new Student("Anu", 28, "Female"));
		return s.iterator();
		}

	        // Test method accepting Student type attribute ( Not an Iterator)
		@Test(dataProvider = "DataProviderIterator")
		public void Studentregistration(Student student) {

			if(student.validateAge())
			{
				System.out.println("Student registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.gender);
			}
			else
			{
				System.out.println("Student not registered with details as Name = "+student.name + " , Age ="+student.age +" , Gender ="+student.gender);
			}

		}

}

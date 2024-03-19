package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadXMLExample {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		File src= new File("./objRepo1.xml");
		FileInputStream fis = new FileInputStream(src);	
		
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(fis);
		
		String sourceId=document.selectSingleNode("//Bus_Search/source").getText();
		System.out.println(sourceId);
		
		/*
		 * System.out.println(document.selectSingleNode("//login_detail/username").
		 * getText()); //
		 * System.out.println(document.selectNodes("//login_detail/username").size());
		 * System.out.println(document.selectNodes("//login_detail/username").get(1).
		 * getText()); document.selectNodes("//login_detail/username").get(1);
		 */
		
		

	}

}

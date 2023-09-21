package ConceptofProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		Properties pr= new Properties();
		FileOutputStream fis= new FileOutputStream(".//WritingFile.properties");
		pr.setProperty("name", "pravin");
		pr.store(fis, "name added");
		
		System.out.println("reading Properties file");
		System.out.println("name is "+ pr.getProperty("name"));
		

	}

}

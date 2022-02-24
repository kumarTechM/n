package reading_properties_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Reading_PropertiesFile 
{
	@Test
	public void ReadingPropertiesFile() throws IOException
	{
		Properties pr= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\king\\Downloads\\ashish\\src\\reading_properties_excel\\Data.properties");
		pr.load(fis);
		System.out.println(pr.get("Username"));
		
		System.out.println(pr.getProperty("password"));
		
	}

}
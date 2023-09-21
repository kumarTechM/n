package ConceptofProperties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertiesFile 
{
	public static void main(String [] args) throws Throwable 
	{
		Properties pr= new Properties();
		FileInputStream fis= new FileInputStream("C:\\"
				+ "Users\\king\\Downloads\\ashish\\src\\ReadFlieing.properties");
		pr.load(fis);
		System.out.println("reading broswer value from properties: "+pr.getProperty("browser"));
		System.out.println("reading broswer value from properties: "+ pr.getProperty("url"));
	}

}

package examples_exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwsexception 
{
	public static void main(String []args) throws FileNotFoundException, InterruptedException 
	{
		FileInputStream fis= new FileInputStream("c//ptohram");// checked exception 
		Thread.sleep(1000); // checked exception 
	}

}

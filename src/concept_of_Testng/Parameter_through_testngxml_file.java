package concept_of_Testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameter_through_testngxml_file
{
	@Test
	@Parameters("browser")
	public void gettingdata(String browser)
	{
		if(browser.equals("Chrome"))
		{
			Assert.assertEquals("", "");
			System.out.println("chrome browser will envoke");
		}
		else
		{
			System.out.println("other browser will envoke");
		}
	}
	

}

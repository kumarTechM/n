package concept_of_Testng;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Practise 
{
	@Test(dependsOnMethods="m2")
	public void m1()
	{
		System.out.println("enabling method");
	}
	@Test
	public void m2()
	{
		System.out.println("m2 method");
	//	throw new SkipException("age not mrmb");
	}
	
}

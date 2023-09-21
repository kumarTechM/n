package ConceptOfBeforeclassAndTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 
{

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("class 1 before class");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("class 1 after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("class 1 before test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method of class 1 ");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method of class 1");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("class 1 After test");
	}
	@Test
	public void method1()
	{
		System.out.println("test method of class 1");
	}
	@Test
	public void method2()
	{
		System.out.println("test method of class 1");
	}
	@Test
	public void method3()
	{
		System.out.println("Test method of class 1");
	}
}

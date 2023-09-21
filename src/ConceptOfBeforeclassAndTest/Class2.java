package ConceptOfBeforeclassAndTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 
{

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("class 2 before class");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("class 2 after class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("class 2 before test");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method of class 2 ");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method of class 2  ");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		System.out.println("class 2 After test");
	}
	@Test
	public void method1()
	{
		System.out.println("Test method of class 2");
	}
	@Test
	public void method2()
	{
		System.out.println("Test method of class 2");
	}
	@Test
	public void method3()
	{
		System.out.println("Test method of class 2");
	}

}

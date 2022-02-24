package concept_of_Testng;

import org.testng.annotations.Test;

public class Exception_in_TestNg 
{
	@Test(expectedExceptions=ArithmeticException.class,description="jhgfjh")
	public void m1()
	{
		int e=1/0;
		System.out.println("sucessfully");
		System.out.println("m1 method");
	}

	@Test
	public void m2()
	{
		System.out.println("m2 method");
	}
}

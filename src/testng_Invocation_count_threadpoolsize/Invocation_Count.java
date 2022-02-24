package testng_Invocation_count_threadpoolsize;

import org.testng.annotations.Test;

public class Invocation_Count 
{
	@Test(invocationCount=10)
	public void m1()
	{
		System.out.println("m1 method");
	}

	@Test(invocationCount=2)
	public void m2()
	{
		System.out.println("m2 method");
	}

}

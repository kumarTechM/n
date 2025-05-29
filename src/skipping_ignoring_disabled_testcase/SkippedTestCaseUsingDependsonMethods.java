package skipping_ignoring_disabled_testcase;

import org.testng.annotations.Test;

public class SkippedTestCaseUsingDependsonMethods 
{
	
	@Test
	public void m1()
	{
		int a=10/0;
		System.out.println("m1 method");
	}
	@Test(dependsOnMethods="m1")
	public void m2()
	{
		System.out.println("m2 method");
	}
}

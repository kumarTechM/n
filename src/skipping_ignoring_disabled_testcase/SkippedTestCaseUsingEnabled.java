package skipping_ignoring_disabled_testcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedTestCaseUsingEnabled 

{
	@Test(enabled=false)
	public void m1()
	{
		System.out.println("m1 method");
		//throw new ArithmeticException("asekjrjtk");
		//int a=10/0;
	}
       // using enabled=false 0 test will execute 
	// we disabled this test case completely , not skipped conditionally so if want to reflect in console then skipped through conditionally 
}

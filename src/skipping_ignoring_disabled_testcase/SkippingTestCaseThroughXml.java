package skipping_ignoring_disabled_testcase;

import org.testng.annotations.Test;

public class SkippingTestCaseThroughXml
{
	@Test
	public void m1()
	{
		System.out.println("m1 method");
		
	}
	// we skipped using xml so it will not reflect in console as skip keep note
	@Test
	public void m2()
	{
		System.out.println("m2 method");
	}

}

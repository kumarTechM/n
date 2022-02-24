package skipping_ignoring_disabled_testcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Example1 
{
	@Test(threadPoolSize=3)
	public void m1()
	{
		System.out.println("m1 method");
	}

}

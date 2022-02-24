package skipping_ignoring_disabled_testcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Example2 

{
	@Test(enabled=true)
	public void m1()
	{
		System.out.println("m1 method");
		//throw new ArithmeticException("asekjrjtk");
		//int a=10/0;
	}
	@Test
	
	public void m2()
	{
		System.out.println("m2 method");
		System.out.println("jksgdjjjjjjjjhfshg");
		throw new SkipException("skip it");
		
	}

}

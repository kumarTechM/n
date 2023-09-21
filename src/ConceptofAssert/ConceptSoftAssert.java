package ConceptofAssert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ConceptSoftAssert

{
	@Test(expectedExceptions=ArithmeticException.class)
	public void m1()
	{
	int a=10/0;
	System.out.println("pravin");
	
		
	
	}
	}
	
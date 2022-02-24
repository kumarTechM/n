package concept_of_Testng;

import org.testng.annotations.Test;

public class Conceptofdependonmethods

{
	@Test(dependsOnMethods="m2",groups="fucntoinal",description="normal")
	public void m1()
	
	{
		System.out.println("m1 method");
	}
	@Test(groups="fucnttional",description="normal")
	public void m2()
	{
		System.out.println("m2 method");
	}

}

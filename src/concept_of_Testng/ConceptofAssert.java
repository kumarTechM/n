package concept_of_Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class ConceptofAssert {


	@Test
	public void m1()
	{
		SoftAssert a= new SoftAssert();
		System.out.println("m1 method");
		String name="pravin";
		a.assertEquals("Pravin", name);
		System.out.println("m1 methodname");
		//a.assertAll();
	}
	@Test
	public void m2()
	{
		System.out.println("m2 method");
	}
	
}

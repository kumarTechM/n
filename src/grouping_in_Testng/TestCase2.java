package grouping_in_Testng;

import org.testng.annotations.Test;

public class TestCase2 
{
	@Test (groups = {  "functionalTest" })
	 public void loginTest(){
	 System.out.println("Logged in successfully");
	 }
	@Test
	public void m1()
	{
		System.out.println("m1 method");
	}
	

}

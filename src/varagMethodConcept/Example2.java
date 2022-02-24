package varagMethodConcept;

import regarding_Constructor.practise;

// varag to varag is  overriding
public class Example2 extends pravin
{

	public void m1(int...x)
	{
		System.out.println("overriding varag method");
	}


	public static void main(String[] args) 
	{
		pravin p= new Example2();
		p.m1(10);
	}

}
class pravin
{
	public void m1(int...x)
	{
		System.out.println("parent varag method");
	}
	
}
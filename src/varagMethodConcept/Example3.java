package varagMethodConcept;

import regarding_Constructor.practise;

// varag to no-varag is overloading not overriding
public class Example3 extends pravin1
{

	public void m1(int...x)
	{
		System.out.println("overriding varag method");
	}


	public static void main(String[] args) 
	{
		pravin1 e= new Example3();
		e.m1(10);
	}

}
class pravin1
{
	public void m1(int x)
	{
		System.out.println("varag method");
	}
	
}
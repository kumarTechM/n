package varagMethodConcept;

import regarding_Constructor.practise;

public class Example1 {

	// calling between normal and varag method
	public void m1(int a)
	{
		System.out.println("Normal method");
	}
	public void m1(int...x)
	{
		System.out.println("varag method");
	}
	

	public static void main(String[] args) 
	{
		
		Example1 v= new Example1();
		v.m1(10);
		
		
	}

}

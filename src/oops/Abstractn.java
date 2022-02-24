package oops;


import java.util.Stack;

// in asbtraction while implementing abstract method u can't reduce scope of access modifiers
public class Abstractn  extends a 
{
	public void m1()
	{
		System.out.println("implememe ethod");
	}
	Abstractn() {
		System.out.println("o child cons");
	}
		{
		System.out.println("instance block of child");
	}
	static  
	{System.out.println("static blockof child ");
		
	}
	
	
public static void main(String[] args) 
{
	
	Abstractn n= new Abstractn();
	n.m1();
}

}

abstract class a
{
	a()
	{
		System.out.println("arg constructor of abstarct");
	}
 abstract void m1();
	{
		System.out.println("instance block of abstarct");
	}
	static  
	{System.out.println("static blockof abstract ");
		
	}
	public static void main(String[]args)
	{
		System.out.println("abstract class main mehtod");
	}
}
package oops;

abstract  class practise 
{
	practise()
	{
		System.out.println("o- arg constructor");
	}
	public static void main(String [] args)
	{
		System.out.println("abstract class main method");
	}

}
class a1 extends practise
{
	a1()
	{
		System.out.println("child cons");
	}
	
	public static void main(String [] args)
	{
		
	}
}
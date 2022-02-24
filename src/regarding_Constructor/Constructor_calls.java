package regarding_Constructor;

public class Constructor_calls  extends a
{
	
	Constructor_calls()
	{
		super();
		System.out.println("0-arg constructor");
	}

	public static void main(String[] args) 
	{
		Constructor_calls n= new Constructor_calls();
		

	}
}

abstract class a
{
	a()// int a
	{
		System.out.println("parent 0-arg ");
	}
	/*public void main(String []args)
	{
		System.out.println("abstract class main method");
	}*/
}

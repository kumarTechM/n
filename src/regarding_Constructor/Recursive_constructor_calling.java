package regarding_Constructor;


//Recursive_constructor_calling is compile time error 
//while recursive method calling is run time error
public class Recursive_constructor_calling 
{
	
	Recursive_constructor_calling()
	{
		//this(10);
		System.out.println("0- arg constructor");
	}
	Recursive_constructor_calling(int a)
	{
		this();
		System.out.println("1- arg constructor");
	}

	
	public static void main(String[] args) 
	{
		Recursive_constructor_calling n= new Recursive_constructor_calling();

	}

}

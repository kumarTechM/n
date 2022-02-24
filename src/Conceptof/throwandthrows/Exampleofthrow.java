package Conceptof.throwandthrows;

public class Exampleofthrow {

	public static void main(String[] args) 
	{
		validatingage(20);
		

	}
	
	
	
	public static  void validatingage(int age)
	{
		if(age<18)
		{
			 throw new ArithmeticException("not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote");
		}
		
	}
}

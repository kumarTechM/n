package examples_exception_handling;

public class Mutiple_catch_block {

	public static void main(String[] args) {


		try
		{
			int a=50/0;
			
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("dkjfsk");
			// here it will give two suggestion 
			//1. remove catch clause
			//2. replace catch clause with throws
			
		}

	}

}

package exceptionWithReturnStatement;

/*
 NOTE: Two Main Rules for this return statement in exception
 1. If finally block returns a value then try and catch blocks may or may not return a value
 2.If finally block does not return a value then both try and catch blocks must return a value.
 
 */

public class With_ReturnStatement4 {

	public static void main(String[] args) 
	{
		//methodReturningValue();
		System.out.println(methodReturningValue());
	}
	
	
	//NOTE:   finally block will be always executed even though try and catch blocks are returning the control.
	
	static Object methodReturningValue()
	{
		try {
			//
			//int a=10/0;
			System.out.println("i am in try block");
			return  50.5f;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("i am in catch block");
			return 20;
		}
		finally
		{
			System.out.println("i am in final block statement 1");
			System.out.println("i am in final block statement 2");
			//return 90;
			  
		
		
	}
		/*
*/
	}
}



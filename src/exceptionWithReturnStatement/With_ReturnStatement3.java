package exceptionWithReturnStatement;

/*
 NOTE: Two Main Rules for this return statement in exception
 1. If finally block returns a value then try and catch blocks may or may not return a value
 2.If finally block does not return a value then both try and catch blocks must return a value.
 
 */

public class With_ReturnStatement3 {

	public static void main(String[] args) 
	{
		//methodReturningValue();
		System.out.println(methodReturningValue());
	}
	
	//NOTE:finally block overrides any return values from try and catch blocks.
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
			//return 40;
			return 30.5f;
			  
		}
		
	}
		/*
*/
	}



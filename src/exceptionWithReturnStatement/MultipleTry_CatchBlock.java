package exceptionWithReturnStatement;

public class MultipleTry_CatchBlock {

	public static void main(String[] args) 
	{
		try {
			int a=10/0;
		} catch (ArithmeticException e) {
			System.out.println("child exception");
		}
		catch(Exception e)
		{
			System.out.println("parent exception");
		}
		

	}

}

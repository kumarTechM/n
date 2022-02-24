package programming;

public class Swapping_Variable {

	public static void main(String[] args)
	{
		int x=10;
		int y=20;
		System.out.println("1st way");
		// using 3 re variable
		/*int temp;
		temp=y;
		y=x;
		x=temp;
		*/
		// without 3rd variable  with + operator
		/*x=x+y;//30
		y=x-y;//30-20=10
		x=x-y;*/
		
		//using * operator
		x=x*y;
		y=x/y;
		x=x/y;
		
		
		System.out.println(x);
		System.out.println(y);	

	}

}

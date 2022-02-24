package programming;

public class Factorial_numbers 
{
	public static void factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factroirial of number is "+ fact );
	}

	public static void main(String[] args) 
	{
		factorial(5);
	}

}

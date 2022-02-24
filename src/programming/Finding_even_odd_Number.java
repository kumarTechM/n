package programming;

public class Finding_even_odd_Number
{
	public static  void findingevenoddnumber(int num)
	
	{
		if(num%2==0)
		{
			System.out.println("given number is even "+num);
		}
		else// if(num%2!=0)
		{
			System.out.println("given number is odd "+num);
		}
	}
	

	public static void main(String[] args) 
	{
		findingevenoddnumber(10);

	}

}

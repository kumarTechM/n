package programming;

public class Prime_Number 
{
	public static boolean isprime(int a)
	{
		// 2 is lowest prime number
		// 3 is prime number
		if(a<=1)
		{
			return false;
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
	/*	System.out.println("11 isprime number "+isprime(11));
		System.out.println("13 isprime number "+isprime(13));
		System.out.println("17 isprime number "+isprime(17));
		System.out.println("10 isprime number "+isprime(10));
		System.out.println("1 isprime number "+isprime(1));
		System.out.println("0 isprime number "+isprime(0));*/
		System.out.println("2 isprime number "+isprime(2));
	}

}

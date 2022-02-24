package programming;

public class Finding_Prime_Numbers 
{
	public static boolean isprime(int n)
	{
		/*if(n<=1)
		{
			return false;
		}*/
		for(int i=2;i<n;i++)
		{
			if(n %i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void  getprimenumbers(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isprime(i))
			{
				System.out.print(i + " ");
			}
		}
		 
	}
	public static void main(String[] args) 
	{
		getprimenumbers(100);

	}

}

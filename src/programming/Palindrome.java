package programming;

public class Palindrome 
{
	public static void  getPalindromeNumber(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Number is "+rev);
		// i can also put condition 
	
	}

	public static void main(String[] args)
	{
		getPalindromeNumber(151);

	}

}

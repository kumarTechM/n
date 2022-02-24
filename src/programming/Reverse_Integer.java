package programming;

public class Reverse_Integer 
{
	public  static void reversingnumber(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num= num/10;
			
		}
		System.out.println("reverse number is "+rev);
		
	}

	public static void main(String[] args) 
	{
		reversingnumber(12345);
		int a=123456;
		System.out.println(new StringBuffer(String.valueOf(a)).reverse());
	}

}

package programming;

public class AddingNumberFromString 
{
	public static void main(String [] args)
	{
		String s="pravin10";
		String s1="pravin20";
		
		String num=s.replaceAll("\\D", "");
		String num1=s1.replaceAll("\\D", "");
		System.out.println(num);
		int nu=Integer.parseInt(num);
		int nu1=Integer.parseInt(num1);
		
		int sum=nu+nu1;
		System.out.println(sum);
		 int sum1=Integer.parseInt(num)+Integer.parseInt(num1);
		 System.out.println("sum1 is "+sum1);
	}

}

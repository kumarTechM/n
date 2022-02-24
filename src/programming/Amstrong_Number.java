package programming;

public class Amstrong_Number 
{
	// 153=1*1*1+5*5*5+3*3*3=1+125+27=153
	//370,371
	//0
	//1
	public static void getAmstrongnumber(int num)
	{
		int cube=0;
		int rev = 0;
		while(num>0)
		{
			rev=num%10;
			num=num/10;
			cube=cube+(rev*rev*rev);
		}
		System.out.println("getting amstrong number "+cube);
		
	}
	

	public static void main(String[] args) 
	{
		
		getAmstrongnumber(153);
	}

}

package programming;

public class finding1to100_even_odd_numbers 

{
	public static void gettingnumbers(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println("even number is"+i);
			}
			else
			{
				System.out.println("odd number is"+i);
			}
			
		}
		
	}

	public static void main(String[] args) 
	{
		
		gettingnumbers(10);

}
}

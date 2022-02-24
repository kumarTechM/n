package pattern_problems;


/*1
12
123
1234
123
12
1*/

public class Example3 {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		// printing lower order
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

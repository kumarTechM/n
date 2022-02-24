package pattern_problems;


/*4321
432
43
4*/

public class Example2 {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

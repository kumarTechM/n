package pattern_problems;


/*4
43
432
4321*/

public class Example5 {

	public static void main(String[] args) 
	{
		int rows=5;
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(j);
				
				
			}
			System.out.println();
		}
		
	
	}

}

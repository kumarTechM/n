package programming;

public class PrintingAlphabet2 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int  i=1;i<=n;i++)
		{
			int ch=65; // small a=97
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(ch-i+j)+" ");
				
			}
			System.out.println();
		}

	}

}

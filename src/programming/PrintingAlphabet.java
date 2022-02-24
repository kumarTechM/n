package programming;

public class PrintingAlphabet {

	public static void main(String[] args) 
	{
		int n=5;
		for(int  i=1;i<=n;i++)
		{
			int ch=65; // small a=97
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}

	}

}

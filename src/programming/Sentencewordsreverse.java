package programming;

public class Sentencewordsreverse {

	public static void main(String[] args) 
	{
		String s="abhishek modi";
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
			
		}
		
		
}
}
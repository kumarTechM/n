package programming;

public class ReverseSetenceWordUsingSpaceIndex {

	public static void main(String[] args) {
		
		String s="Abishek modi";// i want to -->modi abhishek
		int spaceIndex=-1;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				spaceIndex=i;
				
			}
		}
		StringBuffer secondword= new StringBuffer();
		// print secondword
		for(int i=spaceIndex+1;i<ch.length;i++)
		{
			System.out.println(ch[i]);
			secondword.append(ch[i]);
		}
		System.out.println(secondword);
		
		// printing first word
		StringBuffer firstword= new StringBuffer();
	
		for(int i=0;i<spaceIndex;i++)
		{
			//System.out.println(ch[i]);
			firstword.append(ch[i]);
		}
		System.out.println(firstword);
		System.out.println(secondword+" "+firstword);
		
	}
	// alternat waye 
	String s="abhishek modi";
		String[] s1=s.split(" ");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");// o/p--> modi abhishek
			
		}

}

package programming;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		
		String s="pravin";
		int length= s.length();
		System.out.println(length);
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	
		System.out.println(rev);
		// using StringBuffer
		/*StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());*/
		
	}

}

package programming;

public class ReturnLasr4Char {
	public static String lastFourchar(String s)
	{
		String rev="";
		if(s.length()<4)
		{
			return "string is to short to reverse last 4 character";
		}
		String firstname=s.substring(0, s.length()-4);
		String lastname=s.substring(s.length()-4);
		for(int i=lastname.length()-1;i>=0;i--)
		{
			rev=rev+lastname.charAt(i);
		}
		
		return firstname+rev;
	}
	
		
	public static void main(String [] args)
	{
		System.out.println(lastFourchar("You"));
	}
}

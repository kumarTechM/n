package programming;

public class checkGivenStringisEqualOrNot {

	public static boolean check(String s,String s1)
	{
		if(s.length()!=s1.length())
		{
			return false;
		}
		String s2=s+s;
		return s2.contains(s1);
	}
	public static void main(String [] args)
	{
		String s="thisistestingstring";
		String s1="stringthisistesting";
		System.out.println(check(s, s1));
		
	}

}

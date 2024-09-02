package programming;

import java.util.Arrays;

public class VerifyStringIsAnagramorNot {
	public static boolean IsAnagram(String s1,String s2)
	{
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
			char ch[]=s2.toLowerCase().toCharArray();
			char ch1[]=s2.toLowerCase().toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			return Arrays.equals(ch, ch1);
		}
	}

	public static void main(String[] args) {
		System.out.println(IsAnagram("CAT","TAC"));
			
	}
	
	
}

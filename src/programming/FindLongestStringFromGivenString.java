package programming;

public class FindLongestStringFromGivenString {
	public static void main(String [] args)
	{
		String s="pravin sarkate jhkjhkjhjkhjk shkjhkjhkjhkjhkhkhjk";
		   String [] s1=s.toLowerCase().split(" ");
		   String longword="";
		   int maxlength=0;
		   for (String string : s1) 
		   {
			   if(string.length()>maxlength)
			   {
				   maxlength=string.length();
				   longword=string;
			   }
			
		}
		   System.out.println("Longest String is "+ longword);
				
	}
}

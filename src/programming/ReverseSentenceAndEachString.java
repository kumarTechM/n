
package programming;

import java.util.Arrays;

public class ReverseSentenceAndEachString 
{
	public static void main(String[] args)  
	{
		String s="hello i am pravin ";
		String [] s1=s.split(" ");
		//System.out.println(s1.length);
		String rev="";
		// hello
		// i
		// am
		//pravin
		for(int i=s1.length-1;i>=0;i--)
		{
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				System.out.print(s1[i].charAt(j));
			}
			System.err.print(" ");
		}
		System.out.print
		(" ");

}

}

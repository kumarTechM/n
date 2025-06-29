
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
			System.out.print(" ");
		}
		System.out.print
		("");

}
//o/p" nivarp ma i olleh 
}
// alternat way 
String s="hello i am pravin ";
       String rev="";
       for(int i=s.length()-1;i>=0;i--)
       {
           rev=rev+s.charAt(i);
       }
       System.out.print(rev);// nivarp ma i olleh

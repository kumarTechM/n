package programming;

public class ReversingStringWithSpecialCharacter {

	public static void main(String[] args) {
		String s="prav@in Sar#kate fr*om L&ona@r";
		String str[]=s.split(" ");
		for (String a : str) {
			 int place=1;
	            String [] sp = a.split("[^A-Za-z0-9]");
	            String b = a.replaceAll("[^A-Za-z0-9]", "");
	            int len = sp[0].length();
	            for(int i = b.length()-1; i>=0; i--) {
	                System.out.print(b.charAt(i));
	                if(place==len)
	                    System.out.print(a.charAt(len));
	                place++;
	            }
	            System.out.print(" ");     
		}

	}

}
// alerate way 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    
    public static void main(String[] args) 
    {
           String s="xdfg@hj iop#qwe ui*ty L&ona@r";
           StringBuffer result=new StringBuffer();
           StringBuffer word=new StringBuffer();
           for(char c:s.toCharArray())
           {
               if(Character.isLetterOrDigit(c))
               {
                   word.append(c);
               }
           }
         word.reverse();
           int index=0;
           for(char c:s.toCharArray())
           {
               if(Character.isLetterOrDigit(c))
               {
                   result.append(word.charAt(index++));
               }
               else
               {
                   result.append(c);
               }
           }
       System.out.println(result);
    }
} 

// what if you reverse but order of word should be same then 
import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        String s = "xdfg@hj iop#qwe ui*ty L&ona@r";

        for(String sp : s.split(" "))
        {
            StringBuffer word = new StringBuffer(); // ✅ moved inside loop

            // 1. capture letters
            for(char c : sp.toCharArray())
            {
                if(Character.isLetterOrDigit(c))
                {
                    word.append(c);
                }
            }

            // 2. reverse letters
            word.reverse();

            int index = 0;
            StringBuffer result = new StringBuffer(); // also reset per word

            // 3. rebuild word
            for(char c : sp.toCharArray())
            {
                if(Character.isLetterOrDigit(c))
                {
                    result.append(word.charAt(index++));
                }
                else
                {
                    result.append(c);
                }
            }

            System.out.print(result + " ");
        }
    }
}

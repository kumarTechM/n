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
      
        String s = "prav@in Sar#kate fr*om L&ona@r";
        String[] words = s.split(" ");

        for (String word : words) {

            // Step 1: remove special characters
            String clean = word.replaceAll("[^A-Za-z0-9]", "");

            // Step 2: reverse only letters
            String reversed = new StringBuilder(clean).reverse().toString();

            StringBuilder result = new StringBuilder();
            int index = 0;

            // Step 3: rebuild word
            for (char c : word.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    result.append(reversed.charAt(index++));
                } else {
                    result.append(c);  // keep special char same
                }
            }

            System.out.print(result + " ");
        }
     
    }
}

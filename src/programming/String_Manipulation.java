package programming;

public class String_Manipulation {

	public static void main(String[] args) 
	{
		String str="the rains  have started heres";
		// finding length of string
		System.out.println(str.length());

		// finding char at specific index
		System.out.println(str.charAt(5));

		// finding index of char
		System.out.println(str.indexOf('s'));

		// finding 2 nd occurance of s
		System.out.println(str.indexOf('s', 9));
		// dynamice 2 nd occurance of s
		//System.out.println(str.indexOf('s', str.indexOf('s')+1));
		// last index of s


		System.out.println(str.lastIndexOf('s'));
		
		System.out.println("index of have "+ str.indexOf("heres"));
		
		// if perticular char or string not present in given string it will return -1,will not get any error
         System.out.println(str.indexOf('p'));
         System.out.println(str.indexOf("pravin"));
      // substring
 		System.out.println(str.subSequence(0, 9));
 		System.out.println(str.substring(4));
 		
 		//trim -- to remove spaces
 		String s=" HELLOW World  ";
 		System.out.println(s.trim());
 		System.out.println(s.replace(" ", ""));
 		// replace method
 		String s1="i am pravin sarkate";
 		System.out.println(s1.replace('a', 'z'));
 		System.out.println(s1.replaceFirst(s, "fffff"));
 		
	}

}


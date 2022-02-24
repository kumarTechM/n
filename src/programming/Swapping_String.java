package programming;

public class Swapping_String {

	public static void main(String[] args)
	{
		String s="hello";
		String s1="world";
		// adding both String
		
	
		
		s= s+s1;//helloworld
		s1=s.substring(0, s.length()-s1.length());
		// Strarting from 0 to length of s(helloworld) - length of s1(world) so it will print hello
		 
		System.out.println(s1);
		s=s.substring(s1.length());
		System.out.println(s);
		
		// 2nd way
		s1=s.substring(0, 5);
		s=s.substring(5, 10);
		System.out.println(s1);
		System.out.println(s);

	}

}

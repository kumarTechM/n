package programming;

public class StringRotation {

	public static boolean isStringRotated(String s,String s2)
	{
		return (s.length()==s2.length()) && ((s+s).contains(s2));
		
	}
	public static void main(String[] args) {
		 String s = "AACD";
	        String s2 = "ACDA";
	 
	        if (isStringRotated(s, s2))
	            System.out.println("Yes");
	        else
	            System.out.printf("No");

	}

}

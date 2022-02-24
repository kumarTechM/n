package programming;

public class FindingLengthofStringWithoutLengthfunction {

	public static void main(String[] args) 
	{
		String s="pravin";
		System.out.println(s.length());
		
		System.out.println(s.toCharArray().length);
		System.out.println(s.lastIndexOf(""));
		System.out.println(s.split("").length);
	}
	

}

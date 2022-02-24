package programming;

public class StringBuffer_to_String {

	public static void main(String[] args)
	{
		StringBuffer sb= new StringBuffer("pravin");
		String s=sb.toString();
		System.out.println("String "+s);
		
		// string to Stringbuffer
		String s1= "sarkate";
		StringBuffer sb1= new StringBuffer(s1);
		System.out.println("StringBuffer "+ sb1);
		
		

	}

}

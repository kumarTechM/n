package examples_of_string_StringBuffer;

public class Reference_Or_Content_Comparision {

	//String = content comparision 
	// StringBuffer= Ref. comparision 
	public static void main(String[] args) 
	{
		String s="pravin";
		String s1="sarkate";
		String s2="pravin";	
		String p=new String("sarkate");
		String p1=new String("pravin");
		String p2=new String("sarkate");
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s==s2);
		System.out.println("equlas method output "+ s.equals(p1));
		
		// for new
		System.out.println(p==p1);
		System.out.println(p1==p2);
		System.out.println(p==p2);
		

	}

}

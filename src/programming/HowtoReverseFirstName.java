package programming;

public class HowtoReverseFirstName {
	public static void main(String []args)
	{  
	 String a="pravinsarkate";
	 System.out.println(a.length());
	 String rev="";
	 
	 String firstname=(String) a.subSequence(0, 6);
	 String lastname=(String) a.subSequence(6, 13);
	 for(int i=firstname.length()-1;i>=0;i--)
	 {
		 rev=rev+firstname.charAt(i);
	 }
	 System.out.println("rever is "+rev);
			 
	
	}
}

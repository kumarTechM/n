package objectCreationExample;

public class Example1 {

	public static void main(String[] args) 
	{
		String s= new String("pravin");
		String s1=new String("pravin");
		String s2="pravin";
		String s3="pravin";
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		
		System.out.println("now uisng equlas method");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
				

	}

}

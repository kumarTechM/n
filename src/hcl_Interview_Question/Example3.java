package hcl_Interview_Question;

public class Example3 {

	
	
	
	public static void main(String[] args) 
	{
		String s1="pravin";
		String s2=s1;
		s1+="sarkate";
		System.out.println(s1);
		System.out.println(s1 +" "+s2 +" " +s1==s2);
		StringBuffer sb= new StringBuffer("Ashish");
		StringBuffer sb1=sb;
		sb.append("gore");
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb +" "+sb1  +"  "+ sb.equals(sb1));
	}

}

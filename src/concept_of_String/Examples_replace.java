package concept_of_String;

public class Examples_replace
{
	
	

	public static void main(String[] args) 
	{
		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
		// replace perticular char with new char
		//System.out.println("replacing chararcter =="+s1.replace('J', 'p'));
		
		// replaceing string with new string 
		// using just replace it replace all old string  with new string
		//System.out.println("replacing string=="+s1.replace("Java","mava"));
		
		/// using replaceAll same as above
		//System.out.println(s1.replaceAll("Java", "pravin"));
		
		//replace first 
		System.out.println(s1.replaceFirst("Java", "pravin"));

	}

}

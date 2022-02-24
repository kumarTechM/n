package concept_of_String;

public class Finding_Indexces {

	public static void main(String[] args) 
	{
		String s="pravinprap";
		System.out.println("First index of "+ s.indexOf('p'));
		// last index
		System.out.println("last index of "+s.lastIndexOf('p'));
		
		// but now i want to find index of p in middle 
		
		System.out.println(s.indexOf('a', 3));
		System.out.println(s.indexOf('p', 1));

	}

}

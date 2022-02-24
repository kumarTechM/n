package programming;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElements_in_String {

	public static void main(String[] args) 
	{
	
		String s[]= {"java","c++","python","c","perl","java","c"};
		// 1st way
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("dupliactes element is "+s[i]);
				}
				
			}
		}
		// 2nd way
		System.out.println("2nd way ");
		
	  Set<String> set= new HashSet<String>();
	  for(String name:s)
	  {
		  // first store java is checking is already stored or not if not then stored otherwise that is duplicate 
		  if(set.add(name)==false)
		  {
			  System.out.println("dupliactes element is "+name);
		  }
		  
	  }
	  

	}

}

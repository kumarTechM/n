package collections_info;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Conversion_all_types {

	public static void main(String[] args) 
	{
		// collection to array
		List s= new LinkedList();
		s.add(10);
		s.add(20);
		s.add(30);
		
		// collection to array
		Object[] a=s.toArray();
		
		for (Object object : a) 
		{
			System.out.println(object);
		}  
		
		// Array to List
	System.out.println("Converting Array to List");
	int []s1 = {10,20,30};
	for(int
			s2:s1)
	{
		System.out.println(s2);
	}
	List l= Arrays.asList(s1);
	System.out.println(l);
}

}

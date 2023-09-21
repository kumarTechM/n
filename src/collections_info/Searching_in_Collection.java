package collections_info;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Searching_in_Collection {

	public static void main(String[] args)
	{
		List s= new LinkedList();
		s.add(10);
		s.add(20);
		s.add(30);
		
		System.out.println("before searching"+s);
		Collections.sort(s);
		System.out.println("after searching"+s);
		
		
		System.out.println(Collections.binarySearch(s, 1));
		System.out.println(Collections.binarySearch(s, 20));
		System.out.println(Collections.binarySearch(s, 50));
		System.out.println(Collections.binarySearch(s, 40));
		System.out.println(Collections.binarySearch(s, 60));
		//System.out.println(Collections.binarySearch(s, "pravin"));

		
	}

}

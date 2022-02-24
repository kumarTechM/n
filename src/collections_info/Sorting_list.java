package collections_info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_list {

	public static void main(String[] args) 
	{
		List l= new  ArrayList();
		l.add("pravin");
		l.add("sarkate");
		l.add("ashish");
	
		//l.add(10);
		System.out.println("before sorting"+l);
		Collections.sort(l);
		System.out.println("After sorting"+l);
		
		// colections to array
	Object []a=l.toArray();
	System.out.println(a);
	for (Object object : a) 
	{
	System.out.println(object);	
	}
		

	}

}

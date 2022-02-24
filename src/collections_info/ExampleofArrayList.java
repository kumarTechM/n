package collections_info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleofArrayList {

	public static void main(String[] args) 
	{
		List l= new LinkedList();
		l.add(10);
		l.add(20);
		l.add(36);
		l.add(10);
		l.add(20);
		l.add("ashish");
		l.add("pravin"); 
	//	ListIterator li= l.listIterator();
	
		
		// we can add value to perticular index also
		l.add(2,"skmgbmn");
		
		System.out.println(l);
		List m=Collections.synchronizedList(l);
		System.out.println("synchronized list is:"+m
				);
		List l2= new LinkedList();
		
		l2.add("kjggggggk");
		l2.add("khghjf");
		System.out.println(l2);
		
		// here adding collection(l) to specific index
		l2.addAll(0, l);
		//l2.addAll(l);
		System.out.println(l2);
	
		
	}

}

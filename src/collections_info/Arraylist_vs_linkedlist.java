package collections_info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist_vs_linkedlist {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{

		ArrayList l= new ArrayList();
		//Iterator i= l.iterator();
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(2);
		l.add(1);
		
		//System.out.println("size of list"+l.size());
		 List l1=Collections.synchronizedList(l);
		 System.out.println(l1);
		System.out.println("array list contais"+l);
		/*LinkedList l1= new LinkedList();
		l1.add(5);
		l1.add(6);
		l1.addAll(l);
		l1.addFirst(50);
		l1.addLast(100);
		System.out.println("linked list conatins:"+l1);
		*/

	}

}

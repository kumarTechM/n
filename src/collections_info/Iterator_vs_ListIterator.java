package collections_info;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_vs_ListIterator {

	public static void main(String[] args) 
	{
		List l= new ArrayList();
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(0);
		l.add(1);
		l.add("pravinSSSSS");
		// uisng iterator
		/*Iterator i=l.iterator();
		while(i.hasNext())
		{
		
		  // System.out.println(i.next());
			
		}*/
		// using listiterator
		/*ListIterator it=l.listIterator();
		
		while(it.hasNext())
		{
			int index=it.nextIndex();
		System.out.println(index);
		it.add(e);
		it.remove();
	
			
			
		}*/

	}

}

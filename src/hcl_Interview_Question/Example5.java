
package hcl_Interview_Question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) 
	{
		int[]a={1,2,4,4,5,5};
		ArrayList list= new ArrayList();
	Set set= new HashSet();
		for (int a1 : a) {
			
			if(set.add(a1)==false)
			{
				//System.out.println("Duplicate "+a1);
				list.add(a1);
				
			}
		}
		System.out.println("unique array is "+set);
		System.out.println("duplicate element is "+list);

	}

}

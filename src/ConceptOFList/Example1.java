package ConceptOFList;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("pravin");
		list.add(100);
		list.add("sarkate");
		list.add(200);
		System.out.println("list before operation:"+list);
		//adding element to specificendex 
		list.add(2, "gore");
		System.out.println("list after adding element:"+list);
		//
		list.remove(2);
		System.out.println("After removing list:"+list);
		// verify
	System.out.println("verification of element:"+list.contains("pravin"));

	Set set= new HashSet();
	set.add("pravin87987");
	set.addAll(list);
	System.out.println(set);
	
		

	}

}

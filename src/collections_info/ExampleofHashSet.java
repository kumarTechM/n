package collections_info;

import java.util.HashSet;
import java.util.Set;

public class ExampleofHashSet {

	public static void main(String[] args) 
	{
		Set set= new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(30);
		set.add(20);
		System.out.println(set);

	}

}

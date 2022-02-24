package collections_info;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ExampleofLinkedHashSet {

	public static void main(String[] args) 
	{
		Set set= new LinkedHashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(30);
		set.add(20);
		System.out.println(set);
		
	}

}

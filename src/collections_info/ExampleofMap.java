package collections_info;

import java.util.HashMap;

public class ExampleofMap {

	public static void main(String[] args) 
	{
		HashMap  map= new HashMap();
		map.put(0, 100);
		map.put(1, 101);
		map.put(2, 102);
		map.put(3, 103);
		map.put(0, 104);
		map.put(5, 104);
		System.out.println(map);
		System.out.println(map);
		System.out.println(map.containsValue(108));
		
		

	}

}

package conceptOfHashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

//https://javaconceptoftheday.com/java-hashmap-programs-and-examples/-- for hashmap concept

public class How_TORemove_keyValuePair 
{
	//How do you remove a key-value pair from the HashMap?

	public static void main(String[] args) 
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		Set<Entry<String,Integer>> key_value=map.entrySet();
		for(Entry<String,Integer> add:key_value)
		{
			System.out.println(add.getKey()+":"+add.getValue());
		}
		
		/*
		 NOTE:
		 1. we can remove either providing key or key_value
		 */
		// now removing key
		/*map.remove("gore");
		System.out.println("After removing:"+map);*/
		// removing key_value
		map.remove("gore", 4);
		System.out.println("After removing:"+map);

	}

}

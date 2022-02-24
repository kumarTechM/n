package conceptOfHashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Adding_keyValue_ifNotPresent 
{
	//How do you add given key-value pair to HashMap if and only if it is not present in the HashMap?

	public static void main(String[] args) 
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		
		System.out.println("size of map"+map.size());
		System.out.println("before adding any value"+map.entrySet());
		  //Adds key-value pair 'ONE-111' only if it is not present in map
		map.putIfAbsent("pravin", 111);
		System.out.println("After adding 1 any value"+map.entrySet());
		// NOTE: ("pravin",111) can't add because keys can't be dupliacte
		map.putIfAbsent("a", 1);
		System.out.println("After adding 2 any value"+map.entrySet());
		System.out.println("now printing key-value one by one");
	Set<Entry<String,Integer>> map1=map.entrySet();
	for(Entry<String,Integer> map3:map1)
	{
		System.out.println(map3.getKey()+":"+map3.getValue());
	}
		

	}

}

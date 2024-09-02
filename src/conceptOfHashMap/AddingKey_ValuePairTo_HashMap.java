package conceptOfHashMap;


import java.util.*;
import java.util.Map.Entry;
public class AddingKey_ValuePairTo_HashMap 
{
/*
 By using put() and putAll() methods. 
 put() method adds key-value pair one by one 
 where as putAll() method copies all key-value pairs from one HashMap to another HashMap.
 */
	
	public static void main(String[] args) 
	{
		HashMap<String,Integer>map= new HashMap<String,Integer>();
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		System.out.println(map.entrySet());
		// but if we want key-value pair one by one
	Set<Entry<String,Integer>> set=map.entrySet();
		
		for(Entry<String,Integer>set1:set)
		{
			//System.out.println(set1.getKey()+":"+set1.getValue());
			System.out.println(set1);
		}
		

}
}

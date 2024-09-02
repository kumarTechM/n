package conceptOfHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HowToGetOnlyKey 
{
	//How do you retrieve all keys present in a HashMap?

	public static void main(String[] args) 
	{
		
HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		
		System.out.println(map);
		
		Collection<Integer> value=map.values();
		for(Integer val:value)
		{
			System.out.println("getting value only:"+val);
		}
	
		Set<String> keyset=map.keySet();
		for (String string : keyset) 
		{
			System.out.println("key value only:"+string);
			
		}
	}

}

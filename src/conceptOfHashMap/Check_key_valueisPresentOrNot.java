package conceptOfHashMap;

import java.util.HashMap;

public class Check_key_valueisPresentOrNot 
{
	//How do you check whether a particular key/value exist in a HashMap?

	public static void main(String[] args) 
	{
HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		System.out.println(map);
		//Checking whether key 'sarkate' exist in map
		
		System.out.println(map.containsKey("sarkate"));// it return true or false
		
		System.out.println(map.containsValue(4));
		
		System.out.println("before clear:"+map.size());
		// how to clear map 
		map.clear();
		System.out.println("After clear:"+map.size());

	}

}

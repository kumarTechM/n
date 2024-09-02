package conceptOfHashMap;

import java.util.HashMap;

public class Retrive_value_usingKey 
{
	//How do you retrieve a value associated with a given key from the HashMap?

	public static void main(String[] args) 
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);
		 //Retrieving a value associated with key 'TWO'
		System.out.println(map.get("pravin"));
		

	}

}

package conceptOfHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class pracrise {

	public static void main(String[] args) 
	{
		HashMap map= new HashMap();
		map.put("pravin",1);
		map.put("sarkate", 2);
		map.put("ashihs", 3);
		map.put("gore", 4);


		//System.out.println(map);
		Set<Entry<String,Integer>>ma=map.entrySet();
		for(Entry<String,Integer>s:ma)
		{
			System.out.println(s);
		}

	}

}

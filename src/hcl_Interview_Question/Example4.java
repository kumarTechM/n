package hcl_Interview_Question;

import java.util.HashMap;

public class Example4 
{
	
	
	public static void main(String[] args) 
	{
		
		String s="pravinpravin";
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		char[] ch=s.toCharArray();
		for (char c : ch) {
			
			if(map.containsKey(c))
			{
				//If char 'c' is present in Map, incrementing it's count by 1
				map.put(c, map.get(c)+1);
			}
			else
			{
				//If char 'c' is not present in Map,
                //putting 'c' into Map with 1 as it's value
				map.put(c,1);
			}
		}
		System.out.println(map);
		System.out.println(s+" : "+map);
		
		
		
		
		

	}

}


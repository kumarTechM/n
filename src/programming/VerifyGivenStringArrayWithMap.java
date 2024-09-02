package programming;

import java.util.HashMap;
import java.util.Map;

public class VerifyGivenStringArrayWithMap 
{

	public static void main(String [] args)
	{

		String[] a = {"a", "b", "a", "c", "b"};
		Map<String,Boolean>map=new HashMap<String ,Boolean>();
		for(String s:a)
		{
			if(map.containsKey(s))
			{
				map.put(s, true);
			}
			else
			{
				map.put(s, false);
			}
		}
		System.out.println(map);
		
		
	}


}

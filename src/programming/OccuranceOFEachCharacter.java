package programming;

import java.util.HashMap;

public class OccuranceOFEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		now check blow code
			 StringBuffer sb = new StringBuffer();
        Set<Entry<Character, Integer>> set = map.entrySet();
        for (Entry<Character, Integer> jk : set) {
            if (jk.getValue() > 1) {  // ✅ Only add repeating characters
                sb.append(jk.getKey()).append(jk.getValue());
            }
        }

        System.out.println(sb.toString());  // ✅ o/p wil be a2b2s2x2i2
		
		


	}

}
//
// what if you want o/p like a1b1c2de1jklm1n1 rmeoing diuplicate frequency 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="aabbcccdeejklmmnn";
        //a1b1c2de1jklm1n1
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Character,Integer>>jk=map.entrySet();
        StringBuffer sb=new StringBuffer();
        for(Map.Entry<Character,Integer>k:jk)
        {
           int count=k.getValue()-1;// reduce count
           sb.append(k.getKey());
           if(count>0)
           {
               sb.append(count);
           }
           
            
        }
        System.out.println(sb);
    }
}

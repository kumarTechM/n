package programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_Chars_In_String {

	public static void main(String[] args)
	{
		String s="pravinaa";
		char[] chars=s.toCharArray();	
		int count = 0;
		for(int i=0;i<chars.length;i++)
		{
			for(int j=i+1;j<chars.length;j++)
			{
				if(chars[i]==chars[j])
				{
					count++;
					
					System.out.println("dupliacte char is "+ chars[i]);
					
				}
			}
		}
		System.out.println(count);
//		Set set= new HashSet();
//		for(char s1:chars)
//		{
//			if(set.add(s1)==false)
//			{
//				System.out.println("duplicate char is"+ s1);
//			}
//			
//		}
//

	}
}

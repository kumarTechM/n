
package programming;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber_in_Array {

	public static void main(String[] args)
	{
		int a[]= {2,4,6,8,10,2,6,9,5};
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("duplicate number is "+a[i]);
					
				}
			}
		}
			
		System.out.println("using 2nd way");*/
		Set set = new HashSet();
		for (Object object : a) 
		{
			if(set.add(object)==false)
			{
				System.out.println("duplicate number is "+object);
				
			}
			
		}
		System.out.println(set);
		

	}

}


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
// print only unieq element ---not single element should be duplicate
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    
    public static void main(String[] args) 
    {
     	int a[]= {2,4,6,8,10,2,6,9,5};
     	List unique=new ArrayList();
     	Set set=new HashSet();
     	Set duplicate=new HashSet();
     	for(int j:a)
     	{
     	    if(set.add(j)==false)
     	    {
     	        duplicate.add(j);
     	    }
     	    else
     	    {
     	        unique.add(j);
     	        
     	    }
     	   
     	}
     
     unique.removeAll(duplicate);
     System.out.println("not duplciae "+set);
     System.out.println("duplicate"+duplicate);
        System.out.println("unique without duplicate is "+unique);
    }
}

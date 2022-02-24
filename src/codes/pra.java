package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class pra 

{
	public static void main(String [] args)
	{
		int [] a={10,20,30,40,50,8,2};
		int largest=a[0];
		int smallest=a[0];
		int seocndsmallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
			else if(a[i]>smallest && a[i]<smallest)
			{
				seocndsmallest=a[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
		System.out.println(seocndsmallest);
	}	
	
	}
	

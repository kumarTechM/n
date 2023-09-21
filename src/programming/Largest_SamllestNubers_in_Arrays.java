package programming;

import java.util.Arrays;

public class Largest_SamllestNubers_in_Arrays {

	public static void main(String[] args) 
	{
		int a[]= {10,30,50,60,70,80,5};
		int largest=a[0];
		int smallest=a[0];
		int smallest2=a[0];
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
			else if(a[i]<smallest2 && a[i]!=smallest)
			{
				smallest2=a[i];
			}
		}
		 System.out.println(largest);
		 System.out.println(smallest);
		 System.out.println(smallest2);
		
		
	}

}

package programming;

import java.util.Arrays;

public class Largest_SamllestNubers_in_Arrays {

	public static void main(String[] args) 
	{
		int a[]= {10,30,50,60,70,80,5,0};
		int largest=a[0];
		int Secondlargest=a[0];
		int smallest=a[0];
		int smallest2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				Secondlargest=largest;
				largest=a[i];
			}
			else if(a[i]>Secondlargest&& a[i]!=largest)
			{
				Secondlargest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest2=smallest;
				smallest=a[i];
							}
			else if(a[i]<smallest2 && a[i]!=smallest)
			{
				smallest2=a[i];
			}
		}
		 System.out.println("1 st largest element is "+largest);
		 System.out.println("2 st largest element is "+Secondlargest);
		 System.out.println("1 st smallest element is "+smallest);
		 System.out.println("1 st smallest element is "+smallest2);
		
		
	}

}

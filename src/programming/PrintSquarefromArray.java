package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSquarefromArray {
	public static void main(String []args)
	{  
	int []a= {1,2,3,4,5};
	int []squarearry= new int[a.length];
	List l=new ArrayList();
	for(int i=0;i<a.length;i++)
	{
		squarearry[i]=a[i]*a[i];
		
	}
	System.out.println(Arrays.toString(squarearry));

	}
}

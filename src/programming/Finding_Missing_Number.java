package programming;

public class Finding_Missing_Number {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum is "+ sum);
		int a1[]= {3,2,4,5};
		int sum1=0;
		for(int j=0;j<a1.length;j++)
		{
			sum1=sum1+a1[j];
		}
		System.out.println("second sum is "+sum1 );
		System.out.println("Missing NUmber is "+(sum-sum1));

	}

}

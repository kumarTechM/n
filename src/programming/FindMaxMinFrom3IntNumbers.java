package programming;

public class FindMaxMinFrom3IntNumbers {

	public static void maxnumber(int a,int b,int c)
	{
		int max=0;
		while(a>0||b>0||c>0)
		{
			a--;
			b--;
			c--;
			max++;
		
		}
		System.out.println(max);
		
	}
	public static void main(String []args)
	{
		maxnumber(1,2,3);
	}
	// alternat way for this
	public static void checkLargerNumber(int a,int b,int c)
  {
      int max=0;
      if(a>=b&& a>=c)
      {
          max=a;
      }
      else if(b>=a&&b>=c)
      {
          max=b;
          
      }
      else
      {
          max=c;
      }
      System.out.println(max);
  }
   
	
}

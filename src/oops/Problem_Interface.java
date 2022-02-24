package oops;

// suppose interface having 5 methods but out of whcih i want only 2 methods to implement
// to overcome this u ahve to use adapter class that contains empty method declaration 
public class Problem_Interface  extends x
{
	public void m5()
	{
		System.out.println("m5 method");
	}

	public static void  main(String[]args)
	{Problem_Interface i= new Problem_Interface();
	i.m5();

		
	}
}
class x implements It1
{
	// empty method declaration 
	public void m1() {}
	public void m2() {}
	public void m3() {}
	public void m4() {}	
	public void m5() {}
}
interface It1
{
	
		void m1();
		void m2();
		void m3();
		void m4();	
		void m5();
		
	

	
}
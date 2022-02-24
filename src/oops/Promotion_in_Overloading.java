package oops;

public class Promotion_in_Overloading 
{
	public  void m1(int a)
	{
		System.out.println("int-arg");
	}
	public  void m1(float a)
	{
		System.out.println("float-arg");
	}
	
	public static void main(String[] args) 
	{
		Promotion_in_Overloading n= new Promotion_in_Overloading();
		n.m1('a');
		n.m1('b');
		n.m1(10);
		
		
		
	}

}

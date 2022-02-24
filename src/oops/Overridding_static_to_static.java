package oops;

public class Overridding_static_to_static
{
	public static void m1()
	{
		System.out.println("child static method");
	}
	public void m2()
	{
		System.out.println("m2 method of child");
	}

	public static void main(String[] args) 
	{
		

		Overridding_static_to_static n= new Overridding_static_to_static();
		/*n.m1();
		n.m2();*/
		// now creating object of parent
		z Z= new z();
		Z.m1();
	}

}
class z
{
	public static void m1()
	{
		System.out.println("parent static method");
	}
}
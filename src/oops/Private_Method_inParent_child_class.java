package oops;

public class Private_Method_inParent_child_class  extends ashish
{
	private void m1()
	{
		System.out.println("child private method");
	}
	private void m2()
	{
		System.out.println("2 nd child private method");
	}

	public static void main(String[] args) 
	{
		Private_Method_inParent_child_class n= new Private_Method_inParent_child_class();
		n.m1();
		n.m2();
		
		
		ashish p = new ashish();
		p.m5();
		
	}

}
class ashish
{
	private void m1()
	{
		System.out.println("parent private method");
	}
	public void m5()
	{
		System.out.println("parent public method");
	}
}
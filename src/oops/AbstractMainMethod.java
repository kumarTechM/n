package oops;

public class AbstractMainMethod extends A{
	AbstractMainMethod()
	{
		//super(10);
		
		System.out.println("child class-0-arg");
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractMainMethod m= new AbstractMainMethod();
		System.out.println("child class main method");
	}*/

}
class A
{
	A()
	{
		System.out.println("0-arg constru");
	}
	A(int a)
	{
		System.out.println("1-arg constru");
	}
	public static void main(String []args)
	{
		System.out.println("Abstract class main method");
	}
}
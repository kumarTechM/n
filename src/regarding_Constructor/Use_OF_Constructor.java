package regarding_Constructor;

public class Use_OF_Constructor 
{
	// to initiazlie staic as well as instance variable without oject creation
	// calling instance as well as static method without oject creation 
	// syso statement possible
	
	int a;
	static int  b;
	void m1()
	{
		System.out.println("m1 method");
		
	}
	static void m2()
	{
		System.out.println("m2 method");
	}
	Use_OF_Constructor()
	{
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Use_OF_Constructor n= new Use_OF_Constructor();
	}

}

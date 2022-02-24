package codes;

public class Areas {

	int a=10;
	int b=20;
	static int c=30;
	
	void m1()
	{
		System.out.println("instance method");
	}
	static void m2()
	{
		System.out.println("static method");
	}
	public static void main(String[] args)
	{
		System.out.println(c);// static variables directly called using direct  name 
		//System.out.println(b);// but instance can't called using direct name
		m2();// direclty called static method no object creation is required.

		// but to called instance variables and method we required object creation 
		Areas t= new Areas();
		System.out.println(t.a);// now we can called instance varibales
		System.out.println(t.c);
		t.m1();
		t.m2();
		
		
		
	}

}

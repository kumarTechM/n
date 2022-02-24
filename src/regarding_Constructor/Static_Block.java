package regarding_Constructor;

public class Static_Block {
	//when . class file loaded at that time static block will execute that means only once in class
	// here we can called only  static variable/ methods only 
	//constructor calling is not possible
	
	int c=20;
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
	Static_Block()
	{
		System.out.println("0-arg constructor");
	}
	static 
	{
		
		
		b=20;
	
		m2();
		//System.out.println(c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Static_Block();

	}

}

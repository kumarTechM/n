package regarding_Constructor;

public class Instance_Block {
	// same as constrcutor 
	// for every object creation it will be execute
	
	// only we can't called to constructor into instance block
	
	
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
	Instance_Block()
	{
		System.out.println("0-arg constructor");
	}
	
	{
		
		a=10;
		b=20;
		m1();
		m2();
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instance_Block b= new Instance_Block();// 1st way to create object using reference variable
		new Instance_Block();// nameless approach
	}

}

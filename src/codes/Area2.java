
package codes;

public class Area2 {
	
	static int a=20;
	static int b=30;
	static void m1()//static method
	{
		System.out.println(Area2.a);
		System.out.println("static method");
		//m();// to do this we have to make m() method as a static 
	}

	void m()
	{
		m1();// but static direclty acess in insance method
		System.out.println(Area2.a);// using class name 
		System.out.println(b);// directly acess
		
	}
	
	public static void main(String[] args) 
	{
         m1();
           Area2 t= new Area2();
           t.m();

	}

}

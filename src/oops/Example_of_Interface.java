package oops;

// but in interface while implementing interface method that implemented  method has public modifiers it is compulsory

public class Example_of_Interface  implements IT{
	 public void m1()
	{
		System.out.println("implemented method");
	}
public void m2()
{
	System.out.println("m2 method");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// in interface no need to give abstract/public  keyword to method because it is by deafult it is public/abstract
interface IT
{
	void m1();
	
	void m2();
}
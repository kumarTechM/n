package oops;

public class ExamplePractise extends w

{
	@Override
	public void m1()
	{
		System.out.println("overriding method");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePractise v= new ExamplePractise();
		v.m1();
	}

}

interface i
{
	void m1();
	void m2();
	void m3();
	void m4();
}
class w implements i
{
	public void m1(){};
	public void m2(){};
	public void m3(){};
	public void m4(){};
}
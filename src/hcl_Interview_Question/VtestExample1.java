package hcl_Interview_Question;

public class VtestExample1 {

	public static void main(String[] args) 
	{
		a2.m2();// 
		a2.m1();
		

	}

}
class a1
{
	public static  void m1()
	{
		System.out.println("m1 method");
	}
}
class a2 extends a1
{
	public static void m2()
	{
		System.out.println("m2 method");
	}
}
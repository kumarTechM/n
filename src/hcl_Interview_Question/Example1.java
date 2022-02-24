package hcl_Interview_Question;

public class Example1 {

	// how to call local and instacne variable in method if both have same name 
	int num=10;
	static int b=20;
	public  void m1(int num)
	{
	
		System.out.println(this.num);
	}
	public static void main(String[] args) 
	{
		Example1 v= new Example1();
		v.m1(20);

	}

}

package oops;

public class How_To_Print_Return_value_ofMethod 
{
	public String m1()
	{
		System.out.println("m1 method");
		return "pravin";
		
	}
	public Object m2()
	{
		System.out.println("m2 method");
		return "sarkate";
		
	}
	public int m3()
	{
		System.out.println("m1 method");
		return 10;
		
	}

	public static void main(String[] args) 
	{
		How_To_Print_Return_value_ofMethod m= new How_To_Print_Return_value_ofMethod();
		String s=m.m1();
		System.out.println("printing return value "+s);
		Object b=m.m2();
		System.out.println(b);
		// why type casting need see below exapmle of m2 method
		// m3 method return type is obejct but storing in string 
		String s1=(String) m.m2();
		System.out.println(s1);
		

	}

}

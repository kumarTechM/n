package hcl_Interview_Question;

public class Example2 {

	
	int num=10;
	static int b=20;
	public  void m1(int num)
	{
		/*
		 * but this.num=num*10 or 10*num asel tr output same as input what u provide to that method
		 */
	
		/*
		 * this.num= num;
		 * num=10*num;
		 *System.out.println(num);//200
		 
		 */
		this.num=num*20;
		
		System.out.println(num);// here only 5
		
	}
	public static void main(String[] args) 
	{
		Example2 v= new Example2();
		v.m1(50);

	}

}

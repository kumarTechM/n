package hcl_Interview_Question;

public class Example7 {

	static int count=0;
	public static void m1()
	{
		
		if(count<3)
		{
			count++;
			main(null);
			
			
		}
		else
		{
			//System.out.println("no"); 
			
			return;
		}
		System.out.println("pravin");
		
	}
	public static void main(String[] args) 
	{
		
		m1();
	}

}

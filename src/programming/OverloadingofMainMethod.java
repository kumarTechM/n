package programming;

public class OverloadingofMainMethod {

	public static void main(String[] args) 
	{
		System.out.println("main method");
		OverloadingofMainMethod.main(100);

	}
	public static void main(int args)
	{
		System.out.println("int method main method"); 
	
	}

}

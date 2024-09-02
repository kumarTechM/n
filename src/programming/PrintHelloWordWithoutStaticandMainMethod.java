package programming;

public class PrintHelloWordWithoutStaticandMainMethod {
	public static int print()
	{
		System.out.println("hello world");
		return 1;
	}
	static int p=print();// static things will load /store firstly	
	static String s="hello world";
	public static void main(String [] args)
	{
		
	}
}

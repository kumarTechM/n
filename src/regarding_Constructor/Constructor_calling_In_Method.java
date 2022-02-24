package regarding_Constructor;

public class Constructor_calling_In_Method 
{
	Constructor_calling_In_Method()
	{
		System.out.println("0-arg cons");
	}
	Constructor_calling_In_Method(int a)
	{
		System.out.println("1-arg cons");
	}
	public void  Constructor_calling_In_Method()
	{
		
		this.Constructor_calling_In_Method();
		//this.Constructor_calling_In_Method(10);
		System.out.println("mehtod");
	}

	public static void main(String[] args) 
	{
		Constructor_calling_In_Method n = new Constructor_calling_In_Method();
		n.Constructor_calling_In_Method();
		
				

	}

}

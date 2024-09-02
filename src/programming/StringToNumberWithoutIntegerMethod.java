package programming;

public class StringToNumberWithoutIntegerMethod {
	public static int getNumber(String s)
	{
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			//((int)s.charAt(i)--> getting ASCII value i,1=49
			num=num*10+((int)s.charAt(i)-48);
			
			
		}
 return num;
		
	}
	
public static void main (String [] args)
{
	String s="123";
	
		
System.out.println(getNumber(s)+10);
	
}
	
}

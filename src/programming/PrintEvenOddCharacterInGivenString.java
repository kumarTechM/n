package programming;

public class PrintEvenOddCharacterInGivenString {

	public static void main(String []args)
	{  
		String s="pravin sarkate lonar";
	//	s=s.replaceAll(" ", "");
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.println("even charcate is "+s.charAt(i));
			}
			else
			{
				System.out.println("odd character is "+s.charAt(i));
			}
		}
		

	}
}

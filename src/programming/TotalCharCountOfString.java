package programming;

public class TotalCharCountOfString {

	public static void main(String[] args) 
	{
		String s="hello i am pravin";
		System.out.println(s.length());
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total character present is String is:"+count);

	}

}

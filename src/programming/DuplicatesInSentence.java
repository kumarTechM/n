
package programming;

public class DuplicatesInSentence {

	public static void main(String[] args) 
	{
		String s="pravin is here pravin is not here";
		String[]s1=s.split(" ");
		for(String ch:s1)
		{
			System.out.println(ch);
		}

		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					System.out.println("dupliavte is "+s1[i]);
				}
			}
		}
	}

}

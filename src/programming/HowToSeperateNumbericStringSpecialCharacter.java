package programming;

public class HowToSeperateNumbericStringSpecialCharacter 
{
	public static void main(String[] args) 
	{
		
		StringBuffer alpha= new StringBuffer(),
				numeric=new StringBuffer(),special=new StringBuffer();
		
		String s="pravinkumar985624135@#$^%*&(pravin465465";
		char[] s12=s.toCharArray();
		for(int i=0;i<s12.length;i++)
		{
			if(Character.isDigit(s12[i]))
			{
				numeric.append(s12[i]);
			}
			else if(Character.isAlphabetic(s12[i]))
			{
			alpha.append(s12[i]);	 
			}
			else
			{
				special.append(s12[i]);
			}
			
		}
		
		System.out.println(numeric);
		System.out.println(alpha);
		System.out.println(special);
	}

}

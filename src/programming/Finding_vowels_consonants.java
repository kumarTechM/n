package programming;

public class Finding_vowels_consonants 
{
	
static 	int vowels=0,consonants=0,spaces=0,digit=0;
	
	public static void main(String [] args)
	{
		String s="hello i am pravin 921874120";
		
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else if(ch>='a'&&ch<='z')
			{
				consonants++;
				
			}
			else if(ch==' ')
			{
				spaces++;
				
			}
			else if(ch>='0'&&ch<='9')
			{
				digit++;
			}
		}
		System.out.println("count of vowels "+vowels);
		System.out.println("count of consonants "+consonants);
		System.out.println("count of spaces "+spaces);
		System.out.println("count of digit "+digit);
	}

}

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
o/p
6
8
9
4
alternate
	// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args)
    {
      String s="hello i am pravin 921874120";
       	int vowels=0,consonants=0,spaces=0,digit=0;
      for(char  c:s.toCharArray())
      {
          if(Character.isLetter(c))
          {
          if("aieou".indexOf(c)!=-1)
          {
              vowels++;
          }
          else
          {
              consonants++;
              
          }
          }
          if(Character.isDigit(c))
          {
              digit++;
          }
          else if(Character.isWhitespace(c))
          {
              spaces++;
          }
      }
        
        
System.out.println(vowels);
System.out.println(consonants);
System.out.println(digit);
System.out.println(spaces);
    }
}
o/p
6
8
9
4

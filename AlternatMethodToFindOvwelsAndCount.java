package programming;

public class AlternatMethodToFindOvwelsAndCount {

	public static void main(String[] args) 
	{
		 	int vowels=0,consonants=0,spaces=0,digit=0,SpecialCharacte=0;
		 	String s="hello i am pravin 921874120%^&*&^%$##$%^&*^% $%^&*";
		 	for(char ch:s.toCharArray())
		 	{
		 		if(Character.isLetter(ch))
		 		{
		 			if("aieou".indexOf(ch)!=-1)
		 			{
		 				vowels++;
		 			}
		 			else {consonants++;}
		 		}
		 		else if(Character.isDigit(ch))
		 		{
		 			digit++;
		 		}
		 		else if(Character.isWhitespace(ch))
		 		{
		 			spaces++;
		 		}
		 		else
		 		{
		 			SpecialCharacte++;
		 		}
		 	}
		 	
		System.out.println(vowels);
		System.out.println(consonants);
		System.out.println(digit);
		System.out.println(spaces);
		System.out.println(SpecialCharacte);

	}

}

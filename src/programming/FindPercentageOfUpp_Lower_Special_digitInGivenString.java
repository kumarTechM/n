package programming;

public class FindPercentageOfUpp_Lower_Special_digitInGivenString {

	public static void main(String [] args)
	{
		String s="PraivnPraivb4567897654!@#$%^&*";
		int len=s.length();
		int uppercase = 0;
		int lowercase=0;
		int speical=0;
		int digit=0;
			for(int i=0;i<s.length();i++)
			{
				char ch=s.charAt(i);
				
				if(Character.isUpperCase(ch))
				{
					uppercase++;
				}
				else if(Character.isLowerCase(ch))
				{
					lowercase++;
				}
				else if(Character.isDigit(ch))
				{
					digit++;
				}
				else 
				{speical++;
					
				}
			}
		double upercasecount=	(uppercase*100)/len;
		double lowercasecount=	(lowercase*100)/len;
		double digitecount=	(digit*100)/len;
		double specialcount=	(speical*100)/len;
		System.out.println(upercasecount);
		System.out.println(lowercasecount);
		System.out.println(digitecount);
		System.out.println(specialcount);		
	}
}

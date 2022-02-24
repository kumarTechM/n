package programming;

public class HowToGetAdditionofDigitinString {

	public static void main(String[] args) 
	{
		

		int sum=0;
		String ws="pravin11sarkate3hi55";
		for(int i=0;i<ws.length();i++)
		{
			char ch=ws.charAt(i);
			if(Character.isDigit(ch))
			{
				
				int b=Integer.parseInt(String.valueOf(ch));
				sum=sum+b;
			}
		}
		System.out.println(sum);

	}

}


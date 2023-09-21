package programming;

public class consecutiveRepaetingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getString("aasssfmfkfff");
	}
	public static void getString(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			// setting counter to get occurrence of char
			int counter=1;
			while(i+1<s.length()&& s.charAt(i)==s.charAt(i+1))
			{
				i++;
				counter++;
			}
			System.out.print(s.charAt(i)+""+ counter);
		}
		
	}
}

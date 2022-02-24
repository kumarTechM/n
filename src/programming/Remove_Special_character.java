package programming;

public class Remove_Special_character
{
	public static void m1(String s)
	{
		String s1=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);
		
		// if we want to remove spaces
		System.out.println(s1.trim());
		System.out.println(s1.replaceAll(" ", ""));
		
	}

	public static void main(String[] args) 
	{
		/*String s="@!#!@#$@#$%#@$#$#@pravin$#@$#@$#!%#@sarkate";
		//regular expression [^a-zA-Z0-9]-------^means not
		s=s.replaceAll("[^a-zA-Z0-9]", "");// if given string not conatins (a-zA-Z0-9) then replace with ""
		System.out.println(s);*/

		m1("!@#$#$#pravin&^*&^&^%^%$%$#$@#9565654$^#%$&$%");
	}

}

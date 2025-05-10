package programming;

public class consecutiveRepaetingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getString("123123");
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
	// alternative soltion  but it won't give you o/p like -->a2b2c3 it give in form of array{a=2,b=2,c=3}
	 char [] ch=s.toCharArray();
	      HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	      for(char c:ch)
	      {
	          if(map.containsKey(c))
	          {
	              map.put(c,map.get(c)+1);
	          }
	          else 
	          {
	              map.put(c,1);
	          }
	      }
	      System.out.println(map);
}

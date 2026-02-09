package programming;

public class AddingThreeStringAlternavtively {

	public static void main(String[] args) 
	{
		String a="1 2 4";
		String b="M N L";
		String c="x y z";
		StringBuffer sb= new StringBuffer();
		
		
		for(int i=0;i<a.length()|| i<b.length() || i<c.length();i++)
		{
			if(i<a.length())
{
	  sb.append(a.charAt(i));
}
			if(i<b.length())
			{
				sb.append(b.charAt(i));
			}
			if(i<c.length())
			{
				sb.append(c.charAt(i));
			}
		}
		System.out.println(sb);

	}

}
// if spaces haven't added in input , how to add in o/p
   public static void main(String[]args)
      {
          	String a="124";
		String b="MNL";
		String c="xyz";
		StringBuffer sb= new StringBuffer();// 1MX 2Ny 4Lz
	for(int i=0;i<a.length()||i<b.length()||i<c.length();i++)
	{
	    if(i<a.length())
	    {
	        sb.append(a.charAt(i));
	    }
	    if(i<b.length())
	    {
	        sb.append(b.charAt(i));
	    }
	    if(i<c.length())
	    {
	        sb.append(c.charAt(i));
	    }
	    if(i<a.length()-1||i<b.length()-1||i<c.length()-1)
	    {
	        sb.append(" ");
	    }
	}
	System.out.println(sb);
		
      }

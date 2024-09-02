package programming;

public class ReversingStringWithSpecialCharacter {

	public static void main(String[] args) {
		String s="prav@in Sar#kate fr*om L&ona@r";
		String str[]=s.split(" ");
		for (String a : str) {
			 int place=1;
	            String [] sp = a.split("[^A-Za-z0-9]");
	            String b = a.replaceAll("[^A-Za-z0-9]", "");
	            int len = sp[0].length();
	            for(int i = b.length()-1; i>=0; i--) {
	                System.out.print(b.charAt(i));
	                if(place==len)
	                    System.out.print(a.charAt(len));
	                place++;
	            }
	            System.out.print(" ");     
		}

	}

}

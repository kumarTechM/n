package programming;

public class PrintName100TimesWithoutLoop {

public static void main(String[] args) {
		
		String s="pravin";
		String s1="i";
			s1=s1.replaceAll("i", "iiiiiiiiii");//10
			s1=s1.replaceAll("i", "iiiiiiiiii");//10*10=100
			s1=s1.replaceAll("i", s +"\n");
			System.out.println(s1 );
			
	}
	

}

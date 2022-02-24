package concept_of_String;

public class ValueOf {

	//The string valueOf() method coverts given type such as int, long, float, double,
	//boolean, char and char array into string.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;  
		String p=String.valueOf(a);
		System.out.println("value of a is"+ p);
		String s=String.valueOf(a);  
		System.out.println(s+10);  
	}

}

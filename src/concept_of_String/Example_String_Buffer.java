package concept_of_String;

public class Example_String_Buffer {

	public static void main(String[] args) {
		StringBuffer b= new StringBuffer("pravin");
	// inserting chararter in given string
		// so inserting java at 1st index
		//b.insert(1, "java");
		System.out.println(b);
		
		// setcharAt to set new charater with new 
		//b.setCharAt(1, 's');
		System.out.println(b);
		
		//delete
		b.deleteCharAt(0);//  deleting perticular char at index 
		//b.delete(0, 3);// deleting char from start to end-1 index
		System.out.println(b);
		
		

	}

}

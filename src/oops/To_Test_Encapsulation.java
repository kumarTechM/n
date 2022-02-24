package oops;
//A Java class to test the encapsulated class. 
public class To_Test_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation s= new Encapsulation();
		// setting values
		s.setA(10);
		s.setName("pravin");
		
		// getting values
		System.out.println(s.getA());
		System.out.println(s.getName());
	}

}

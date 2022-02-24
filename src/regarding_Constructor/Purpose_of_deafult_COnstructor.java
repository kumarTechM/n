package regarding_Constructor;

public class Purpose_of_deafult_COnstructor {
// to provide default values to object
	int a;
	float b;
	double c;
	String d;
	void display()
	{
		System.out.println(a +" "+ b +" "+c +" "+d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Purpose_of_deafult_COnstructor n= new Purpose_of_deafult_COnstructor();
		n.display();
	}

}

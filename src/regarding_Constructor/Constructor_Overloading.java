package regarding_Constructor;

public class Constructor_Overloading {
	int id;
	String name;
	int age;
	Constructor_Overloading(int i,String s)
	{
		id=i;
		name=s;
	}
	
	Constructor_Overloading(int i,String s,int b)
	{
		id=i;
		name=s;
		age=b;
		
	}
void display()
{
	System.out.println(id+" "+name+" "+age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_Overloading b= new Constructor_Overloading(111,"pravin");
		Constructor_Overloading b1= new Constructor_Overloading(111,"pravin",25);
		b.display();
		b1.display();
		
		

	}

}

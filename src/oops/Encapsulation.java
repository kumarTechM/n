package oops;

//Every Java class is an example of encapsulation because we write everything within the class only 
//that binds variables and methods together and hides their complexity from other classes. 

//By providing only a setter or getter method,
//you can make the class read-only or write-only
public class Encapsulation {
	
	private String name;
	private int a;
	
	// getter method for name
	
	public String getName()
	{
		return name;
	}
	// getter method for a
	public int getA()
	{
		return a;
	}
	
	// setter method for name
	public void setName(String name)
	{
		this.name=name;
	}
	public void setA(int a)
	{
		this.a=a;
	}

	

}

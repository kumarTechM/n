package examples_exception_handling;

import java.io.FileNotFoundException;

public class ThrowException 
{
	 static void validate(int age)
	 {  
	     if(age<18)  
	     {
	    	 throw new ArithmeticException("not valid");  // here we throw exception 
		   // throw new NullPointerException("afgjasfj");
	    	// throw new FileNotFoundException("file is no found");
	    	 
	     }
	      
	     else  
	      System.out.println("welcome to vote");  
	   }  
	   public static void main(String args[]){  
	      validate(13);  
	      System.out.println("rest of the code...");  
	  }  

}

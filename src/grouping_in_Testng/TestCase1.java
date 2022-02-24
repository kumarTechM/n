package grouping_in_Testng;

import org.testng.annotations.Test;

public class TestCase1 
{
	
	 @Test (groups =  "functionalTest" )
	 public void composeMail(){
	 System.out.println("Mail Sent");
	 }
	
}

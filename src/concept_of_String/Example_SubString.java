package concept_of_String;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Example_SubString 
{

	public static void main(String[] args)
	{
		String s= "pravinsarkate";
		System.out.println("length ofString is "+ s.length());
		
		// suppose i want to print string  sarkate
		System.out.println("new Stirng is "+ s.substring(6));
		
		// suppose i want to print pravin 
		//substring(begain index, endindex-1)
		System.out.println(s.substring(0, 6));
		
		

	}

}

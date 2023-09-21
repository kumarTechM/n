package codes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public   class pra 

{
	public static void main(String [] args)
	{
		try
		{
			int a=10/0;
		}
		
		catch(Exception r)
		{
			System.out.println("exception parent");
		}
		catch(ArithmeticException e)
		{
			System.out.println("aritmmetic exception");
		}
	}
	
}
	 


		
	
	
		
	
	

package conceptOfHashMap;

import java.util.HashMap;

public class Different_typeofHashMap 
{
	//default initial capacity (16) and the default load factor (0.75)

	public static void main(String[] args) 
	{
		//Below example shows 4 different methods for creating HashMap
	 //1. Creating HashMap with default initial capacity and load factor
		HashMap<String,Integer>map= new HashMap<String,Integer>();
		//3. Creating HashMap with 30 as initial capacity and 0.5 as load factor
		HashMap<String,Integer> map1= new HashMap<String,Integer>(30,0.5f);
		
		//4. Creating HashMap by copying another HashMap
		HashMap<String,Integer>map3= new HashMap<String,Integer>(map1);
		

	}

}

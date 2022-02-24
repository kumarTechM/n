package collections_info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//as we know arraylist is non-synchronized but i want to used arraylist but thread safty also required
// for this there is mehtod in collections class sycnhronized
public class Synchronized_Array_list {

	public static void main(String[] args) 
	{


		List l=new ArrayList();
		List l1=Collections.synchronizedList(l);
		

	}

}

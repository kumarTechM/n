package collections_info;

import java.util.HashMap;
import java.util.Map;

public class ExampleOfHashMap {

	public static void main(String[] args)
	{
		Map map= new HashMap();
		map.put(1, 100);
		map.put(2, 100);
		map.put(3, 100);
		map.put(2, 100);
		map.put(1, 100);
		map.put(1, 100);
		System.out.println(map);

	}

}

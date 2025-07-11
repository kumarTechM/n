package programming;

public class AddNumberTillGetSingleDigit {
	public static int add(int num)
	{
		int sum=0;
		while(num>0|| sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum=sum+num%10;
			num=num/10;
					
		}
		return sum;
		 
	}
    
public static void main(String [] args)
{
	System.out.println(add(123345));
}
}

another program same 
	class Main {
    public static int addition1(int num)
    {
        int sum=0;
        while(num>0||sum>9)
        {
            if(num==0)
            {
                num=sum; // we can skip this if part if don;t want sum till single digit
                sum=0;
            }
          
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(897, 877, 864, 765, 213);
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<list.size();i++)
        {
               int value = list.get(i);
            map.put(i,addition1(value));
        }
        
        System.out.println(map);
        
    }
}
o/p-->add element till get single digit={0=6, 1=4, 2=9, 3=9, 4=6}

just sum of digit and add them into map 
	// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int addition1(int num)
    {
        int sum=0;
        while(num>0)
        {
          
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(897, 877, 864, 765, 213);
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<list.size();i++)
        {
               int value = list.get(i);
            map.put(i,addition1(value));
        }
        
        System.out.println(map);
        
    }
}-->o/p-->{0=24, 1=22, 2=18, 3=18, 4=6}

package crossbrowser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWinidwPopUp 
{
	public static void main(String [] args)
	{
		int count=0;
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		String s="pravinpravin";
		char[] ch=s.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}



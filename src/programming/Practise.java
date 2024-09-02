package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise
{
	
	
	public static void main(String [] args)
	{
		 String x="a2b3r4t1";
	      String [] letters=x.split("[0-9]");
	      String [] numbers=x.split("[a-z]+");
	      int num[]=new int[numbers.length];
	      int k=0;
	      for(int i=0;i<numbers.length;i++)
	      {
	          if(!numbers.equals(""))
	          {
	              num[k]=Integer.parseInt(numbers[i]);
	              k++;
	          }
	      }
	}
	
}


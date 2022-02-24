package programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
	public static void main(String[] args) 
	{
		
	StringBuffer aplha= new StringBuffer(),numeric=new StringBuffer(),specail= new StringBuffer();
	String s="pravin2106!@#$%^&*";
	char[] ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		char c=s.charAt(i);
		if(Character.isAlphabetic(c))
		{
			aplha.append(c);
		}
		else if(Character.isDigit(c))
		{
		
			numeric.append(c);
		}
		else
		{
			specail.append(c);
		}
	}
		
		System.out.println("aplha :"+ aplha);
		System.out.println("numeric:"+ numeric);
		System.out.println("specail:"+ specail);
		
	}
}


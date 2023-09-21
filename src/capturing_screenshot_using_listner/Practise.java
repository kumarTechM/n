package capturing_screenshot_using_listner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise 
{

	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\king\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String s=driver.findElement(By.xpath("//input[@name='q']")).getAttribute("type");
		System.out.println(s);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement ele= driver.findElement(By.xpath("//a[text()='Gmail']"));
		js.executeScript("arguments[0].click();", ele);
		WebElement sign_Button=driver.findElement(By.xpath("//a[text()='Sign in']"));
		js.executeScript("arguments[0].click()", sign_Button);
		
	}
}

package parallel_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel_example 
{
	WebDriver driver;
	@BeforeMethod
	public void invokebrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	
	@Test
	public void firstmethod()
	{
		System.out.println("firstmethod");
		driver.get("https://www.google.com");
		driver.close();
	}
	@Test
	public void Secondmethod()

	{
		/*System.setProperty("webdriver.gecko.driver","C:\\Users\\ps11184490\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();*/
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}


}

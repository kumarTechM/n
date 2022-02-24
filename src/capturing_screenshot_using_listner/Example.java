package capturing_screenshot_using_listner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class Example {

	public static WebDriver driver;
	
	@Test
	public void m1() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		 driver= new ChromeDriver();

		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		
		System.out.println(title);
		//Code_of_Screenshot.getscreenshot(s);

		System.out.println("assertion check");
		//Thread.sleep(1000);
		Assert.assertEquals("Facebook", title, "not matched");
		System.out.println("assertion  checked");
		
		Code_of_Screenshot.getscreenshot(driver);
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
